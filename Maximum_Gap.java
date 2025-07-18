// leetcode 164 Maximum Gap  3 6 9 1 10

import java.util.*;

public class Maximum_Gap {

     public static void Find_Gap(int[] arr) {

          if (arr.length < 2) {
               System.out.println("Maximum Number Gap : 0");
               return;
          }

          Arrays.sort(arr);

          int max_gap = 0;

          for (int i = 1; i < arr.length; i++) {
               max_gap = Math.max(max_gap, arr[i] - arr[i - 1]);
          }

          System.out.println("Maximum Number Gap : " + max_gap);
     }

     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Array Size : ");
          int size = sc.nextInt();
          sc.nextLine();

          int[] nums = new int[size];

          System.out.println("Enter Array Element And Find Maximum diffrent : ");
          for (int i = 0; i < size; i++) {
               nums[i] = sc.nextInt();
          }

          Find_Gap(nums);
     }
}
