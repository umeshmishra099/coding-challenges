package com.maximumsumsubarray;

public class MaximumSumSubarray
{
  public static void main(String[] args)
  {
    int[] arr = {2, 3, 4, 1, 5};
    System.out.println(findMaxSumSubArray(3, arr));
  }

  private static int findMaxSumSubArray(int k, int[] arr)
  {
    int maxSum = 0;
    for (int i = 0; i <= arr.length-k; i++)
    {
      int tempSum = 0;
      for (int j = i; j < i + k; j++)
      {
        tempSum = tempSum + arr[j];
      }
      if (tempSum > maxSum)
      {
        maxSum = tempSum;
      }
    }
    return maxSum;
  }
}
