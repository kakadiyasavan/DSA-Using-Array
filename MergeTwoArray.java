// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

// Merge nums1 and nums2 into a single array sorted in non-decreasing order.

// The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

// Input: nums1 = [1,2,3], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]


import java.util.*;

public class MergeTwoArray {

     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Array Size : ");
          int size = sc.nextInt();
          sc.nextLine();

          int[] num = new int[size + size];
          int[] num1 = new int[size];
          int[] num2 = new int[size];

          System.out.println("Enter First Array Numbers : ");
          for (int i = 0; i < size; i++) {
               num1[i] = sc.nextInt();
          }

          System.out.println("Enter Second Array Numbers : ");
          for (int i = 0; i < size; i++) {
               num2[i] = sc.nextInt();
          }

          for (int i = 0; i < size - 1; i++) {
               for (int j = 0; j < size - 1; j++) {
                    if (num1[j] > num1[j + 1]) {
                         int temp = num1[j];
                         num1[j] = num1[j + 1];
                         num1[j + 1] = temp;
                    }
               }
          }

          for (int i = 0; i < size - 1; i++) {
               for (int j = 0; j < size - 1; j++) {
                    if (num2[j] > num2[j + 1]) {
                         int temp = num2[j];
                         num2[j] = num2[j + 1];
                         num2[j + 1] = temp;
                    }
               }
          }

          int f = size - 1, l = size - 1, count = 0;

          for (int i = (size + size) - 1; i >= 0; i--) {

               if(f >= 0 && l >= 0){
                    if (num1[f] < num2[l]) {
                         num[i] = num2[l];
                         l--;
                    } else {
                         num[i] = num1[f];
                         f--;
                    }
               } else if (f >= 0){
                    num[i] = num1[f];
                    f--;
               } else {
                    num[i] = num2[l];
                    l--;
               }
          }

          System.out.println("First And Second Array Merge with Sorted : ");
          for (int i = 0; i < size + size; i++) {
               System.out.print(num[i] + " ");
          }
     }
}
