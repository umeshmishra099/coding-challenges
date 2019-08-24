package com.duplicate;

class RemoveDuplicates
{

  public static void main(String[] args)
  {
    int[] num = {1, 1, 2};
    System.out.println(removeDuplicates(num));
  }

  public static int removeDuplicates(int[] nums)
  {
    int len = nums.length;
    int j = 0;
    if (len == 1)
    {
      return 1;
    }
    else
    {
      for (int i = 1; i < len; i++)
      {
        if (nums[i] != nums[j])
        {
          nums[++j] = nums[i];
        }
      }
      return j + 1;
    }
  }
}
