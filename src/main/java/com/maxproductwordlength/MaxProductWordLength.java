package com.maxproductwordlength;

/*
Given a string array words, find the maximum value of length(word[i]) * length(word[j])
where the two words do not share common letters.
You may assume that each word will contain only lower case letters. If no such two words exist, return 0.
 */
public class MaxProductWordLength
{
  public static void main(String[] args)
  {

   // String[] words = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
    String[] words = {"eae","ea","aaf","bda","fcf","dc","ac","ce","cefde","dabae"};

    System.out.println(findMaxProduct(words));
  }

  private static int findMaxProduct(String[] words)
  {
    int maxProductLength = 0;
    for (int i = 0; i < words.length; i++)
    {
      for (int j = i + 1; j < words.length; j++)
      {
        boolean charFound = false;
        for (char c : words[i].toCharArray())
        {
          if (words[j].contains("" + c))
          {
            charFound = true;
          }
        }
        if (!charFound)
        {
          int tempLength = words[i].length() * words[j].length();
          if (maxProductLength < tempLength)
          {
            maxProductLength = tempLength;
          }
        }
      }
    }
    return maxProductLength;
  }
}
