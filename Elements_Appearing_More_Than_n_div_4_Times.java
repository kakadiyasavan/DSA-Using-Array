// Elements Appearing More Than n/4 Times
// Description:

// Given an integer array nums of size n, return all elements that appear more than ⌊ n/4 ⌋ times.

// Example 1:
// Input: nums = [1,1,2,2,2,3,3,4]
// Output: [2]

// Example 2:
// Input: nums = [1,1,1,2,3,4]
// Output: [1]

// Example 3:
// Input: nums = [5,5,5,5,6,6,6,7,7,7,7,8]
// Output: [5,7]

import java.util.*;

public class Elements_Appearing_More_Than_n_div_4_Times {

     public static void Appearing_Number(int[] nums,int n){

          HashMap<Integer,Integer> map = new HashMap<>();

          for(int num : nums){
               map.put(num, map.getOrDefault(num, 0)+1);
          }

          boolean isFind = false;

          for(Map.Entry<Integer,Integer> m : map.entrySet()){
               if(m.getValue()>(n/4)){
                    System.out.println("Number is : " + m.getKey() + " It Can Appearing : " + m.getValue());
                    isFind = true;
               }
          }

          if(!isFind){
               System.out.println("No bury Value is Greter-Than n/4 Sorry");
          }
     }
     
     public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Array Size : ");
          int size = sc.nextInt();
          sc.nextLine();

          int[] nums = new int[size];

          System.out.println("Enter Numbers in Array : ");
          for(int i=0 ; i<size ; i++){
               nums[i] = sc.nextInt();
          }

          Appearing_Number(nums,size);
     }
}
