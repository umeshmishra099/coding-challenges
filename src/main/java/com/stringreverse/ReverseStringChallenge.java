package com.stringreverse;

public class ReverseStringChallenge
{
  public static void main(String[] args)
  {
    System.out.println(getReverse("a-bC-dEf-ghIj"));
  }

  public static String getReverse(String S)
  {
    StringBuilder sb = new StringBuilder();
    char[] charArray = S.toCharArray();
    int length = charArray.length;
    for (char c : charArray)
    {
      char value = c;
      if (Character.isAlphabetic(c))
      {
        do
        {
          length = length - 1;
        }
        while (!Character.isAlphabetic(charArray[length]));
        value = charArray[length];
      }
      sb.append(value);
    }
    return sb.toString();
  }
}
