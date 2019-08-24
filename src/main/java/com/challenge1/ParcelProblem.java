package com.challenge1;

import java.util.*;

/*
Minimum value to move the parcel
 */
public class ParcelProblem
{
  public static void main(String[] args)
  {
    List<Integer> parts = Arrays.asList(8, 4, 6, 12);
    System.out.println(minimumTime(parts.size(), parts));
  }

  private static int minimumTime(int numOfParts, List<Integer> parts)
  {
    int minimumTimeTaken = 0;
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(parts);
    while (priorityQueue.size() > 1) {
      int sum = priorityQueue.poll() + priorityQueue.poll();
      priorityQueue.offer(sum);
      minimumTimeTaken += sum;
    }
    return minimumTimeTaken;
  }
}
