// LeetCode 525 Contiguous Array
// Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.
// Example 1:

// Input: nums = [0,1]
// Output: 2
// Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.
// Example 2:

// Input: nums = [0,1,0]
// Output: 2
// Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
// Example 3:

// Input: nums = [0,1,1,1,1,1,0,0,0]
// Output: 6
// Explanation: [1,1,1,0,0,0] is the longest contiguous subarray with equal number of 0 and 1.

import java.util.*;

public class Contiguous_Array {

     public static void Check_Binary(int[] arr,int size){

          for(int i=0 ; i<size ; i++)
               if(arr[i] == 0) arr[i] = -1;

          HashMap<Integer,Integer> map = new HashMap<>();
          map.put(0, -1);

          int sum = 0;
          int maxLength = 0;

          for(int i=0 ; i<size ; i++){
               sum += arr[i];

               if(map.containsKey(sum)){

                    int last = map.get(sum);
                    maxLength = Math.max(maxLength,i - last);
               } else {
                    map.put(sum, i);
               }
          }

          System.out.println("Maximum Length of Binary is : " + maxLength);
     }
     
     public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Array Size : ");
          int size = sc.nextInt();
          sc.nextLine();

          int[] arr = new int[size];

          System.out.println("Enter Element Binary(0,1) : ");
          for(int i=0 ; i<size ; i++){
               arr[i] = sc.nextInt();
          }

          Check_Binary(arr,size);
     }
} //[0,1,1,1,1,1,0,0,0]
