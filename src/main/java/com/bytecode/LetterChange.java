package com.bytecode;

public class LetterChange
{
  static final char[] VOWELS = {'a', 'e', 'i', 'o', 'u'};

  public static void main(String[] args)
  {
    System.out.println(LetterChange("a confusing /:sentence:/[ this is not!!!!!!!~"));
  }

  private static String LetterChange(String str)
  {
    StringBuilder stringBuilder = new StringBuilder();
    char[] chars = str.toCharArray();
    for (char aChar : chars)
    {
      char x = aChar;
      if (((int)aChar >= 97 && (int)aChar < 122)
              || ((int)aChar >= 65 && (int)aChar < 90))
      {
        x += 1;
      }
      else if ((int)aChar == 122)
      {
        x = 'a';
      }
      else if ((int)aChar == 90)
      {
        x = 'A';
      }
      if (isVowel(x))
      {
        x = Character.toUpperCase(x);
      }
      stringBuilder.append(x);
    }
    return stringBuilder.toString();
  }

  private static boolean isVowel(char ch)
  {
    for (char vowel : VOWELS)
    {
      if (vowel == ch)
      {
        return true;
      }
    }
    return false;
  }
}
