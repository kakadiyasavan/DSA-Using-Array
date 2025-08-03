// leetCode 204 Count Primes
// Given an integer n, return the number of prime numbers that are strictly less than n.

// Example 1:

// Input: n = 10
// Output: 4
// Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
// Example 2:

// Input: n = 0
// Output: 0
// Example 3:

// Input: n = 1
// Output: 0

import java.util.*;

public class Count_Primes {

     public static void countPrime(int n){

          if(n <= 2){
               System.out.println("Total Number of Prime : 0 ");
               return;
          }

          boolean[] comp = new boolean[n];
          int limit = (int)Math.sqrt(n);
          
          for(int i=2 ; i<=limit ; i++){
               if(comp[i] == false){
                    for(int j=i*i ; j<n ; j+=i){
                         comp[j] = true;
                    }
               }
          }

          int count = 0;
          for(int i=2 ; i<n ; i++){
               if(comp[i] == false)
                    count++;
          }

          System.out.println("Total Number of Prime : " + count);
     }
     
     public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Number You Can Find Prime : ");
          int n = sc.nextInt();
          sc.nextLine();

          countPrime(n);
     }
}
