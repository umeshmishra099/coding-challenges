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
    int tempSum = 0;
    int i = 0;
    for (int j = 0; j < arr.length; j++)
    {
      tempSum += arr[j];
      if (j >= k - 1)
      {
        maxSum = Math.max(maxSum, tempSum);
        tempSum -= arr[i];
        i++;
      }
    }
    return maxSum;
  }
}
