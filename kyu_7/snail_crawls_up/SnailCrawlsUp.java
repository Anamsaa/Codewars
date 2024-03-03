package kyu_7.snail_crawls_up;
// https://www.codewars.com/kata/5b93fecd8463745630001d05
// The snail crawls up the column. During the day it crawls up some distance. During the night she sleeps, so she slides down for some distance (less than crawls up during the day).

// Your function takes three arguments:

// The height of the column (meters)
// The distance that the snail crawls during the day (meters)
// The distance that the snail slides down during the night (meters)
// Calculate number of day when the snail will reach the top of the column.

public class SnailCrawlsUp {
    public static int snail(int column, int day, int night) {
      
      int distance = 0;
      int totalDays = 0;
      
      while(distance < column){
        totalDays ++; 
        distance += day; 
        if (distance >= column){
        break; 
        }
        distance -= night; 
      }

      // distancia total: column 
      // distancia recorrida en un día: day - nigth 
      // número total de días: column / (day - nigth) 
      return totalDays; 
    } 
}