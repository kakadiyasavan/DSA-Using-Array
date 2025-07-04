// LeetCode Question 9
// Palindrome Number
// Given an integer x, return true if x is a palindrome, and false otherwise.

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
// Example 3:

// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

import java.util.*;

public class PalindromeNumber {

     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Number to Check Palondrome : ");
          String num = sc.nextLine();

          if (num.charAt(0) == '-' || num.charAt(num.length() - 1) == '-') {
               System.out.println("Therefore it is not a palindrome");
               return;
          }

          boolean isPalin = true;
          for (int i = 0, j = num.length() - 1; i < j && j > i; i++, j--) {
               if (i == j)
                    break;

               char first = num.charAt(i);
               char last = num.charAt(j);

               if (first != last) {
                    isPalin = false;
                    break;
               }
          }

          if (isPalin) {
               System.out.println("This Number is PalindromeNumber : " + num);
          } else {
               System.out.println("This Number is Not PalindromeNumber : " + num);
          }
     }
}

// Time Complexity O(n)
// Space Complexity O(n) (due to string conversion)