package com.challenge2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class BuzzFuzz
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    IntStream.rangeClosed(0, n).mapToObj(
            i -> i % 3 == 0 ?
                    (i % 5 == 0 ? "FizzBuzz" : "Fizz") :
                    (i % 5 == 0 ? "Buzz" : i))
            .forEach(System.out::println);

  }

}
