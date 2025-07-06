// leetCode 75 Sort Colors
// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
// Example 2:

// Input: nums = [2,0,1]
// Output: [0,1,2]

import java.util.*;

public class Sort_Colors {

     public static void SortColor(int[] color) {

          int redColor = 0, whiteColor = 0, blueColor = 0;

          for (int i = 0; i < color.length; i++) {
               if (color[i] == 0)
                    redColor++;
               if (color[i] == 1)
                    whiteColor++;
               if (color[i] == 2)
                    blueColor++;
          }

          for (int i = 0; i < redColor; i++) {
               color[i] = 0;
          }
          for (int i = redColor; i < (redColor + whiteColor); i++) {
               color[i] = 1;
          }
          for (int i = (redColor + whiteColor); i < color.length; i++) {
               color[i] = 2;
          }

          System.out.println("Sorted Colors Are : ");
          for (int i = 0; i < color.length; i++) {
               System.out.println(color[i] + ",");
          }
     }

     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Array Size : ");
          int size = sc.nextInt();
          sc.nextLine();

          int[] color = new int[size];

          System.out.println("Enter Three Color Number : ");
          for (int i = 0; i < size; i++) {
               color[i] = sc.nextInt();
          }

          SortColor(color);
     }
}

// this code Time Complexity O(n)
// Space Complexity O(1)
