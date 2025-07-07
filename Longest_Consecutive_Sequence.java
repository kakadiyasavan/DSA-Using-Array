// leetCode 128 Longest Consecutive Sequence
// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

// You must write an algorithm that runs in O(n) time.

// Example 1:

// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
// Example 2:

// Input: nums = [0,3,7,2,5,8,4,6,0,1]
// Output: 9
// Example 3:

// Input: nums = [1,0,1,2]
// Output: 3

import java.util.*;

public class Longest_Consecutive_Sequence {

     public static void CountSequence(int[] arr){

          int longLength = 0;

          Set<Integer> set = new HashSet<>();

          for(int a : arr){
               set.add(a);
          }

          for(int a : set){
          
               if(!set.contains(a - 1)){
                    int current = a;
                    int count = 1;

                    while(set.contains(current+1)){
                         current++;
                         count++;
                    }

                    longLength = Math.max(longLength,count);
               }
          }

          System.out.println("The Longest Sequence is : " + longLength);
     }
     
     public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Array Size : ");
          int size = sc.nextInt();
          sc.nextLine();

          int[] arr = new int[size];

          System.out.println("Enter Array Numbers : ");
          for(int i=0 ; i<size ; i++){
               arr[i] = sc.nextInt();
          }

          CountSequence(arr);
     }
}
