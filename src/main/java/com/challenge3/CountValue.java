package com.challenge3;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
Function counts number of given value in range of integer
 */
public class CountValue
{
  public static void main(String[] args)
  {
    String valueSearch = "2";
    String tillToSearch = "25";

   String allValues = IntStream.rangeClosed(0, Integer.parseInt(tillToSearch))
            .mapToObj(String::valueOf)
            .collect(Collectors.joining());

    int count = 0;
    char[] chars = allValues.toCharArray();

    for (Character character : chars)
    {
      if (Character.toString(character).equals(valueSearch))
      {
        count = count + 1;
      }
    }
    System.out.println(count);
  }
}
