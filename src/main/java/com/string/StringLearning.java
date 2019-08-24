package com.string;

public class StringLearning
{
  public static void main(String[] args)
  {
    String s1 = "Hello";
    String s2 = "Hello";
    System.out.println(s1 == s2);
    s2 = s2.toUpperCase();
    System.out.println(s1);
    System.out.println(s2);
    String s3 = new String("Hello").intern();
    System.out.println(s1 == s3);
  }
}
