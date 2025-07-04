// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

// There is only one repeated number in nums, return this repeated number.

// You must solve the problem without modifying the array nums and using only constant extra space.

// Example 1:

// Input: nums = [1,3,4,2,2]
// Output: 2
// Example 2:

// Input: nums = [3,1,3,4,2]
// Output: 3
// Example 3:

// Input: nums = [3,3,3,3,3]
// Output: 3

import java.util.*;

public class FindtheDuplicateNumber {

     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Array Size : ");
          int size = sc.nextInt();
          sc.nextLine();

          int[] nums = new int[size];

          System.out.println("Enter Array Number And Find Repeted Number : ");
          for (int i = 0; i < size; i++) {
               nums[i] = sc.nextInt();
          }

          int count = 0, repeat = 0;

          for (int i = 0; i < size/2 ; i++) {
               for (int j = size - 1; j > i; j--) {
                    if (nums[i] == nums[j]) {
                         count++;
                         repeat = nums[i];
                    }
               }
          }

          System.out.println("Repeated Number is : " + repeat + " Count of Repeation : " + count);
     }
}
