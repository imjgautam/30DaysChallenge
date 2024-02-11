import java.util.HashSet;

public class Contains_Duplicate {
    //Leetcode 217. Contains Duplicate
    /* Example 1:
            Q. Given an integer array nums, return true if any value appears at least twice in the array,
            and return false if every element is distinct.

            Input: nums = [1,2,3,1]
            Output: true
            Example 2:

            Input: nums = [1,2,3,4]
            Output: false
            Example 3:

            Input: nums = [1,1,1,3,3,4,3,2,4,2]
            Output: true
    */
    public boolean solution(int[] nums){
        // We can use Hashset, HashSet does not store duplicate items,
        // if you give two Objects that are equal then it stores only the first one

        HashSet<Integer> result = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++) {
            if (result.contains(nums[i])) { //Returns true if the set contains the specified element.
                return true;
            }
            result.add(nums[i]);//Adds the specified element to the set if it is not already present.
        }
        return false;
    }

    public static void main(String[] args) {
        // Hardcoded Test case.

        int[] nums1 = {1,2,3,1};
        int[] nums2 = {1,2,3,4};
        int[] nums3 = {1,1,1,3,3,4,3,2,4,2};

        Contains_Duplicate c = new Contains_Duplicate();
        System.out.println(c.solution(nums1));
        System.out.println(c.solution(nums2));
        System.out.println(c.solution(nums3));
    }
}