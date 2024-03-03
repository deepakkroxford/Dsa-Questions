import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class allduplicate {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> map = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.contains(nums[i])) {
                ans.add(nums[i]);
            } else {
                map.add(nums[i]);
            }
        }
        return ans;
    }
}

public class Q2_FindAllDuplicatesArray {
    public static void main(String[] args) {

        /*
         * Given an integer array nums of length n where all the integers of nums are in
         * the range [1, n] and each integer appears once or twice, return an array of
         * all the integers that appears twice.
         * 
         * You must write an algorithm that runs in O(n) time and uses only constant
         * extra space.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: nums = [4,3,2,7,8,2,3,1]
         * Output: [2,3]
         * Example 2:
         * 
         * Input: nums = [1,1,2]
         * Output: [1]
         * Example 3:
         * 
         * Input: nums = [1]
         * Output: []
         * 
         * 
         * Constraints:
         * 
         * n == nums.length
         * 1 <= n <= 105
         * 1 <= nums[i] <= n
         * Each element in nums appears once or twice.
         * 
         * 
         */

         allduplicate ans = new allduplicate();
         int arr[]={4,3,2,7,8,2,3,1};
         System.out.println(ans.findDuplicates(arr));
    }
}
