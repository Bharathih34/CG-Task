import java.util.Arrays;

public class Task1 {
		// TODO Auto-generated method stub
		public int[] twoSum(int[] nums, int target) {
	        // Sort the array (This step is necessary for the two-pointer approach)
	        
	        
	        // Initialize two pointers: one at the beginning and one at the end of the array
	        int left = 0;
	        int right = nums.length - 1;
	        
	        // Iterate through the array while the two pointers don't cross each other
	        while (left < right) {
	            int sum = nums[left] + nums[right];
	            // If the sum is equal to the target, return the indices of the two numbers
	            if (sum == target) {
	                return new int[]{left, right};
	            } else if (sum > target) {
	                // If the sum is less than the target, move the left pointer to the right
	                left++;
	            } else {
	                // If the sum is greater than the target, move the right pointer to the left
	                right--;
	            }
	        }
	        
	        // If no such pair is found, return an empty array
	        return new int[0];
	    }
		

	    public static void main(String[] args) {
	        Task1 solution = new Task1();
	        int[] nums = {3,2,4};
	        int target = 6;
	        int[] result = solution.twoSum(nums, target);
	        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
		
	    }
	}
