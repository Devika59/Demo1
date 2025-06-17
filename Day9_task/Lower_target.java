package Day9;

public class Lower_target {
	public class LowerBound {
	    public static int lowerBound(int[] nums, int target) {
	        int left = 0, right = nums.length;  
	        while (left < right) {
	            int mid = left + (right - left) / 2;
	            if (nums[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid; 
	            }
	        }
	        return left;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 4, 4, 5, 6};
	        int target = 4;
	        int index = lowerBound(arr, target);
	        System.out.println("Lower bound index: " + index);  
	    }
	}


}
