package com.averagesubarray;

import java.util.Arrays;

public class AverageSubArray
{
  public static void main(String[] args)
  {
    System.out.println("Averages of subArrays of size k: " + Arrays.toString(findAverages(5, new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2})));
  }

  private static double[] findAverages(int k, int[] arr)
  {
    double[] result = new double[arr.length - k + 1];
    double sliderSum = 0;
    int sliderStart = 0;
    for (int sliderEnd = 0; sliderEnd < arr.length; sliderEnd++)
    {
      sliderSum = sliderSum + arr[sliderEnd];
      if (sliderEnd >= k - 1)
      {
        result[sliderStart] = sliderSum / k;
        sliderSum = sliderSum - arr[sliderStart];
        sliderStart = sliderStart + 1;
      }
    }
    return result;
  }
}
