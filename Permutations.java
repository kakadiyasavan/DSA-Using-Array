// leetCode 46 Permutations
// Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

// Example 1:

// Input: nums = [1,2,3]
// Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
// Example 2:

// Input: nums = [0,1]
// Output: [[0,1],[1,0]]
// Example 3:

// Input: nums = [1]
// Output: [[1]]
 
import java.util.*;

public class Permutations {

     public static void total_perm(List<List<Integer>> result,int[] nums,int start){

          if(start == nums.length){
               List<Integer> current = new ArrayList<>();

               for(int num : nums) current.add(num);
               result.add(new ArrayList<>(current));
               return;
          }

          for(int i=start ; i<nums.length ; i++){

               int temp = nums[start];
               nums[start] = nums[i];
               nums[i] = temp;

               total_perm(result, nums, start+1);

               temp = nums[start];
               nums[start] = nums[i];
               nums[i] = temp;
          }

     }
     
     public static void main(String[] args){

          Scanner sc = new Scanner(System.in);
          
          System.out.println("Enter Array Size : ");
          int size = sc.nextInt();
          sc.nextLine();

          int[] nums = new int[size];

          System.out.println("Enter Number to Permutation : ");
          for(int i=0 ; i<size ; i++){
               nums[i] = sc.nextInt();
          }

          List<List<Integer>> result = new ArrayList<>();
          total_perm(result,nums,0);

          System.out.println("All Permutations : ");
          for(List<Integer> perm : result){
               System.out.println(perm);
          }
     }
}
