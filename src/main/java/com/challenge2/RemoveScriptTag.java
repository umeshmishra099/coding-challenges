package com.challenge2;

import java.util.Scanner;

public class RemoveScriptTag
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    String text = scanner.next();
    text += scanner.nextLine();
    System.out.println(text);
    String scriptPattern = "<script.*?>([\\s\\S]*?)<\\/script>";
    final String output = text.replaceAll(scriptPattern, "");
    System.out.println(output);
  }
}