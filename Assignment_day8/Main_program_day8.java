package Day8;

public class Main_program_day8 {
	

	    
	    public enum SearchType {
	        BINARY,
	        LINEAR,
	        ROTATED_SORTED
	    }

	
	    public static int search(int[] nums, int target, SearchType searchType) {
	        switch (searchType) {
	            case BINARY:
	                return binarySearch(nums, target);
	            case LINEAR:
	                return linearSearch(nums, target);
	            case ROTATED_SORTED:
	                return rotatedSortedSearch(nums, target);
	            default:
	                throw new IllegalArgumentException("Invalid search type");
	        }
	    }

	    
	    private static int binarySearch(int[] nums, int target) {
	        int left = 0;
	        int right = nums.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (nums[mid] == target) {
	                return mid;
	            } else if (nums[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        return -1; 
	    }

	   
	    private static int linearSearch(int[] nums, int target) {
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] == target) {
	                return i;
	            }
	        }
	        return -1; 
	    }

	   
	    private static int rotatedSortedSearch(int[] nums, int target) {
	        int left = 0;
	        int right = nums.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (nums[mid] == target) {
	                return mid;
	            }

	           
	            if (nums[left] <= nums[mid]) { 
	                if (nums[left] <= target && target < nums[mid]) {
	                    right = mid - 1;
	                } else {
	                    left = mid + 1; 
	                }
	            } else { 
	                if (nums[mid] < target && target <= nums[right]) {
	                    left = mid + 1; 
	                } else {
	                    right = mid - 1; 
	                }
	            }
	        }
	        return -1; 
	    }

	    public static void main(String[] args) {
	        int[] binarySortedArray = {1, 2, 3, 4, 5};
	        int[] linearSortedArray = {1, 2, 3, 4, 5};
	        int[] rotatedSortedArray = {4, 5, 6, 7, 0, 1, 2};

	        int target = 3;

	     
	        System.out.println("Binary Search Index: " + search(binarySortedArray, target, SearchType.BINARY));

	        
	        System.out.println("Linear Search Index: " + search(linearSortedArray, target, SearchType.LINEAR));

	       
	        System.out.println("Rotated Sorted Search Index: " + search(rotatedSortedArray, target, SearchType.ROTATED_SORTED));
	    }
	}



