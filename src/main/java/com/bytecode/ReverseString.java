package com.bytecode;

public class ReverseString
{

  public static void main(String[] args)
  {
    System.out.println(FirstReverse("thisiscool"));
  }

  public static String FirstReverse(String str)
  {
    StringBuilder stringBuilder = new StringBuilder();
    char[] chars = str.toCharArray();
    int i = chars.length - 1;
    while (i >= 0)
    {
      stringBuilder.append(chars[i]);
      i--;
    }
    return stringBuilder.toString();
  }
}
