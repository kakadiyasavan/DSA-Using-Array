// LeetCode 229 Majority Element II
// Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

// Example 1:

// Input: nums = [3,2,3]
// Output: [3]
// Example 2:

// Input: nums = [1]
// Output: [1]
// Example 3:

// Input: nums = [1,2]
// Output: [1,2]

import java.util.*;

public class Majority_Element_II {

     public static void CalculateMajor(int[] arr) {

          HashMap<Integer,Integer> map = new HashMap<>();
          int n = arr.length;

          for(int a : arr){
               map.put(a, map.getOrDefault(a, 0)+1);
          }

          boolean isFind = false;

          for(Map.Entry<Integer,Integer> m : map.entrySet()){
               if(m.getValue() > n/3){
                    System.out.println(" Element is : " + m.getKey() + "Repeat Count is : " + m.getValue());
                    isFind = true;
               }    
          }

          if(!isFind){
               System.out.println("No Element is greter Than n/3");
          }
     }

     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Array Size : ");
          int size = sc.nextInt();
          sc.nextLine();

          int[] arr = new int[size];

          System.out.println("Enter Numbers in Array : ");
          for (int i = 0; i < size; i++) {
               arr[i] = sc.nextInt();
          }

          CalculateMajor(arr);
     }
}
