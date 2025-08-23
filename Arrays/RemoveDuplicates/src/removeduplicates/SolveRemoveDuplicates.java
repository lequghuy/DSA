package removeduplicates;

public class SolveRemoveDuplicates {
	private int RemoveDuplicate(int[] nums) {
		int n = nums.length;
		if(n==0 || n==1) {
			return n;
		}
		int i=1,j=1;
		while(j<n) {
			if(nums[j]>nums[j-1]) {
				i++;
			}
			j++;
		}
		return i;
	}
	
	public static void main(String[] args) {
		SolveRemoveDuplicates sd = new SolveRemoveDuplicates();
		int[] test= {0,0,1,1,1,2,2,3,3,4,4,4,9};
		System.out.println("Phan tu khong trung lap trong mang: " + sd.RemoveDuplicate(test));
	}
}
