package com.bytecode;

public class Factorial
{

  public static void main(String[] args)
  {
    System.out.println("Hello");
    System.out.println(FirstFactorial(9));
  }

  public static int FirstFactorial(int num)
  {
    return num == 0 ? 1 : num * FirstFactorial(num - 1);
  }
}
