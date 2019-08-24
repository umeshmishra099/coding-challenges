package com.challenge2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreditCardValidation
{
  public static void main(String[] args)
  {
    List<String> input = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int legnth = scanner.nextInt();
    for (int i = 0; i < legnth; i++)
    {
      String next = scanner.next();
      input.add(next);
    }
    input.stream().map(CreditCardValidation::validate).forEach(System.out::println);
  }

  private static String validate(String s)
  {
    final String reverseValue = Stream.of(s)
            .map(word -> new StringBuilder(word).reverse())
            .collect(Collectors.joining(""));
    int A = 0;
    int B = 0;
    for (int i = 0; i < reverseValue.length(); i++)
    {
      if (i % 2 == 0)
      {
        A = A + Integer.parseInt(String.valueOf(reverseValue.charAt(i)));
      }
      if (i % 2 != 0)
      {
        int temp = Integer.parseInt(String.valueOf(reverseValue.charAt(i))) * 2;
        if (temp > 9)
        {
          temp = sumDigits(temp);
        }
        B = B + temp;
      }
    }
    return ((A + B) % 10 == 0) ? "Yes" : "No";
  }

  private static int sumDigits(int i)
  {
    return i == 0 ? 0 : i % 10 + sumDigits(i / 10);
  }
}
