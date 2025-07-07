// leetCode 274 H-Index
// Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper, return the researcher's h-index.

// According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h such that the given researcher has published at least h papers that have each been cited at least h times.

// Example 1:

// Input: citations = [3,0,6,1,5]
// Output: 3
// Explanation: [3,0,6,1,5] means the researcher has 5 papers in total and each of them had received 3, 0, 6, 1, 5 citations respectively.
// Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, their h-index is 3.
// Example 2:

// Input: citations = [1,3,1]
// Output: 1

import java.util.*;

public class H_Index {

     public static void MaxIndex(int[] arr) {

          int n = arr.length;

          int[] sumArr = new int[n + 1];

          for (int a : arr) {
               if (n < a) {
                    sumArr[n]++;
               } else {
                    sumArr[a]++;
               }
          }

          int totalSum = 0;

          for (int i = sumArr.length - 1; i >= 0; i--) {
               totalSum += sumArr[i];
               if (totalSum >= i) {
                    System.out.println("Max researcher citations is : " + i);
                    return;
               }
          }
     }

     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Array Size : ");
          int size = sc.nextInt();
          sc.nextLine();

          int[] arr = new int[size];

          System.out.println("Enter Resarch paper citations : ");
          for (int i = 0; i < size; i++) {
               arr[i] = sc.nextInt();
          }

          MaxIndex(arr);
     }
}
// [3,0,6,1,5]
