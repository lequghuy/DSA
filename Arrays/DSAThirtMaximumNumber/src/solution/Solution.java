package solution;

import java.util.Arrays;

// 8 2 1 9 4 3

public class Solution {
	public int thirtMax(int[] nums) {
		Integer first = null;
		Integer second = null;
		Integer third = null;
		
		for(Integer num : nums) {
			if(num.equals(third)||num.equals(second)||num.equals(first)) continue;
			
			if(first == null || num> first) {
				third = second;
				second = first;
				first = num;
			}
			
			else if(second == null || num > second) {
				third = second;
				second = num;
			}
			else if(third == null || num>third) {
				third = num;
			}
		}
		return third == null ? first : third;
	}
	//1 3 4 6 8
	public int thirtMax1(int[] nums) {
		Arrays.sort(nums);
		Integer max = nums[nums.length-1];
		int count = 1;
		
		for(int i=nums.length-2; i>=0;i--) {
			if(nums[i] != nums[i+1]) {
				count++;
				if(count == 3) {
					return nums[i];
				}
			}
		}
		
		
		
		return max;
	}
	
	//1 5 3 7 6
	public int thirtMax2(int[] nums) {
		int first = nums[0];
		for(int i=1;i< nums.length;i++) {
			if(nums[i]>first) {
				first = nums[i];
			}
		}
		Integer second = null;
		for(int i = 0; i<nums.length;i++) {
			if(nums[i]!= first) {
				if (second == null || nums[i] > second) {
	                second = nums[i];
	            }
			}
		}
		Integer thirst = null;
		for(int i=0; i<nums.length;i++) {
			if(nums[i] != first && nums[i] != second) {
				if(thirst ==null || nums[i]>thirst) {
					thirst = nums[i];
				}
			}
		
		}
		return thirst ==null ? first : thirst;
	}
	public static void main(String[] args) {
Solution sol = new Solution();
        
        int[] arr1 = {1,2};
        System.out.println("Kết quả: " + sol.thirtMax2(arr1)); 
        

        
	}
}
