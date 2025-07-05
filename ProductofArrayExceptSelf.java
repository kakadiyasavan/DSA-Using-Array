// leetCode 238. Product of Array Except Self
// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

// You must write an algorithm that runs in O(n) time and without using the division operation.

// Example 1:

// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]
// Example 2:

// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]

import java.util.*;

public class ProductofArrayExceptSelf {

     public static void CountProduct(int[] arr,int size){

          int[] result = new int[size];

          for(int i=0 ; i<size ; i++){
               int prefix = 1,postfix = 1;
               
               for(int j=0; j<i ; j++){
                    prefix *= arr[j];
               }

               for(int j=(i+1) ; j<size ; j++){
                    postfix *= arr[j];
               }
               
               result[i] = prefix*postfix;
          }

          System.out.println("Prosuct Of Sum Array : ");
          for(int i=0; i<size ; i++){
               System.out.print(result[i] + ",");
          }
     }

     public static void main(String[] args){
          
          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Size of Array : ");
          int size = sc.nextInt();
          sc.nextLine();

          int[] arr = new int[size];

          System.out.println("Enter Number to Find Product : ");
          for(int i=0 ; i<size ; i++){
               arr[i] = sc.nextInt();
          }

          CountProduct(arr,size);
     }
}
