package com.bytecode;

public class Pentagonal
{
  public static void main(String[] args)
  {
    System.out.println(pentagonalNumber(1));
    System.out.println(pentagonalNumber(2));
    System.out.println(pentagonalNumber(3));
    System.out.println(pentagonalNumber(4));
    System.out.println(pentagonalNumber(5));
  }

  private static int pentagonalNumber(int num)
  {
    int result = 0;
    for (int i = num; i > 0; i--)
    {
      if (i == 1)
      {
        result = result + 1;
      }
      else
      {
       result = result + 5 *(i-1);
      }
    }
    return result;
  }
}
