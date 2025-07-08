// Most Frequent Elements
// Description:

// Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

// Example 1:
// Input: nums = [1,1,1,2,2,3], k = 2  
// Output: [1,2]

// Example 2:
// Input: nums = [1], k = 1  
// Output: [1]

import java.util.*;

public class Most_Frequent_Elements {

     public static void Find_Frequent(int[] arr,int k){

          int n = arr.length;

          HashMap<Integer,Integer> map = new HashMap<>();

          for(int a : arr){
               map.put(a, map.getOrDefault(a, 0)+1);
          }

          boolean isFind = false;

          for(Map.Entry<Integer,Integer> m : map.entrySet()){
               if(m.getValue()>=k){
                    System.out.println("Element is : " + m.getKey() + " it Can Frequent : " + m.getValue());
                    isFind = true;
               }
          }

          if(!isFind){
               System.out.println("Any Thing Can Not Match " + k + " Frequent ,Sorry");
          }
     }
     
     public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Array Size : ");
          int size = sc.nextInt();
          sc.nextLine();

          int[] nums  = new int[size];

          System.out.println("Enter in Array Numbers : ");
          for(int i=0 ; i<size ; i++){
               nums[i] = sc.nextInt();
          }

          System.out.println("Enter Number You Can Get Frequent : ");
          int k = sc.nextInt();
          sc.nextLine();

          Find_Frequent(nums,k);
     }
}
