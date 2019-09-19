package com.averagesubarray;

import java.util.Arrays;

public class AverageSubArray
{
  public static void main(String[] args)
  {
    System.out.println("Averages of subarrays of size k: " + Arrays.toString(findAverages(5, new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2})));
  }

  private static double[] findAverages(int k, int[] arr)
  {
    double[] result = new double[arr.length - k + 1];
    for (int i = 0; i <= arr.length - k; i++)
    {
      double sum = 0;
      for (int j = i; j < i + k; j++)
      {
        sum = sum + arr[j];
      }
      result[i] = sum / k;
    }
    return result;
  }
}
