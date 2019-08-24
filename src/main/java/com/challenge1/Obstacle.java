package com.challenge1;

import java.util.*;

/**
 * Shortest path to remove obstacle
 */
public class Obstacle
{

  public static void main(String[] args)
  {
    List<List<Integer>> list = Arrays.asList(Arrays.asList(1, 0, 0), Arrays.asList(1, 0, 0), Arrays.asList(1, 9, 1));
    System.out.println(removeObstacle(3, 3, list));
  }

  static int removeObstacle(int numRows, int numColumns, List<List<Integer>> lot)
  {
    Integer[][] lots = new Integer[lot.size()][];
    int index = 0;
    for (List<Integer> nestedList : lot)
    {
      lots[index++] = nestedList.toArray(new Integer[0]);
    }
    if (lots.length == 0) return -1;

    int stepsUsed = 0;
    Queue<Point> pointQueue = new LinkedList<>();
    pointQueue.add(new Point(0, 0));
    boolean[][] visitedPoints = new boolean[lots.length][lots[0].length];
    visitedPoints[0][0] = true;
    int[][] directions = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    while (!pointQueue.isEmpty())
    {
      int size = pointQueue.size();
      for (int i = 0; i < size; i++)
      {
        Point point = pointQueue.poll();
        int x = point.x;
        int y = point.y;
        if (lots[x][y] == 9) return stepsUsed;

        for (int[] dir : directions)
        {
          int latestX = x + dir[0];
          int latestY = y + dir[1];

          if (latestX >= 0
                  && latestX < lots.length && latestY >= 0
                  && latestY < lots[0].length
                  && lots[latestX][latestY] != 0
                  && !visitedPoints[latestX][latestY])
          {
            pointQueue.add(new Point(latestX, latestY));
            visitedPoints[latestX][latestY] = true;
          }
        }
      }
      stepsUsed++;
    }
    return -1;
  }

  static class Point
  {
    int x;
    int y;

    Point(int x, int y)
    {
      this.x = x;
      this.y = y;
    }
  }

}
