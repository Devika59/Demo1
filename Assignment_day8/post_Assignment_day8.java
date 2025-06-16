package Day8;

public class post_Assignment_day8 {
	

	    
	    public static int countFrequency(int[] nums, int target) {
	        int firstIndex = findFirstOccurrence(nums, target);
	        int lastIndex = findLastOccurrence(nums, target);

	       
	        if (firstIndex == -1 || lastIndex == -1) {
	            return 0;
	        }

	        return lastIndex - firstIndex + 1;
	    }

	    private static int findFirstOccurrence(int[] nums, int target) {
	        int left = 0;
	        int right = nums.length - 1;
	        int result = -1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (nums[mid] == target) {
	                result = mid; 
	                right = mid - 1;
	            } else if (nums[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        return result;
	    }


	    private static int findLastOccurrence(int[] nums, int target) {
	        int left = 0;
	        int right = nums.length - 1;
	        int result = -1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (nums[mid] == target) {
	                result = mid; 
	                left = mid + 1;
	            } else if (nums[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 2, 2, 2, 3, 4, 5};
	        int target = 2;
	        int frequency = countFrequency(nums, target);
	        System.out.println("Frequency of " + target + ": " + frequency);
	    }
	}

	


