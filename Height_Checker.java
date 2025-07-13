// LeetCode 1051 Height Checker
// A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.

// You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).

// Return the number of indices where heights[i] != expected[i].

// Example 1:

// Input: heights = [1,1,4,2,1,3]
// Output: 3
// Explanation: 
// heights:  [1,1,4,2,1,3]
// expected: [1,1,1,2,3,4]
// Indices 2, 4, and 5 do not match.
// Example 2:

// Input: heights = [5,1,2,3,4]
// Output: 5
// Explanation:
// heights:  [5,1,2,3,4]
// expected: [1,2,3,4,5]
// All indices do not match.
// Example 3:

// Input: heights = [1,2,3,4,5]
// Output: 0
// Explanation:
// heights:  [1,2,3,4,5]
// expected: [1,2,3,4,5]
// All indices match.
 
import java.util.*;

public class Height_Checker {

     public static void Count_Height(int[] first,int[] second){

          int count = 0;
          for(int i=0 ; i<first.length ; i++){
               if(first[i] != second[i]){
                    count++;
               }
          }

          System.out.println("Total Height Diffrence is : " + count);
     }
     
     public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Array Size : ");
          int size = sc.nextInt();
          sc.nextLine();

          int[] nums = new int[size];
          int[] nums2 = new int[size];

          System.out.println("Enter Array Numbers : ");
          for(int i=0 ; i<size ; i++){
               nums[i] = sc.nextInt();
               nums2[i] = nums[i];
          }

          Arrays.sort(nums2);

          Count_Height(nums, nums2);
     }
}
