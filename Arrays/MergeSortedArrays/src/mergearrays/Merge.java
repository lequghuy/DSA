package mergearrays;
import java.util.Arrays;

public class Merge {
	//O(1)
	private void mergeSortedArrays(int nums1[], int m, int nums2[], int n) {
		int i = m-1;
		int j = n-1;
		int k = m+n-1;
		
		while(j>=0) {
			if(j>=0 && nums1[i]>nums2[j]) {
				nums1[k]=nums1[i];
				i--;
			}else {
				nums1[k] = nums2[j];
				j--;
			}
			k--;
		}
				
	}
	//O(nlogn)
	private void merge2(int nums1[], int m, int nums2[], int n) {
		for(int i=0;i<n;i++) {
			nums1[m+i]= nums2[i];
		}
		
		Arrays.sort(nums1);
		
	}
	
	private void merge3(int nums1[], int m,int nums2[],int n) {
		int[] temp = new int[m+n];
		int i=0,j=0,k=0;
		while(i<m && j<n) {
			if(nums1[i]<=nums2[j]) {
				temp[k] = nums1[i];				
				i++;
			}else {
				temp[k] = nums2[j];
				j++;
			}
			k++;
		}
		while(i<m) {
			temp[k] = nums1[i];
			k++;
			i++;
		}
		while(j<n) {
			temp[k] = nums2[j];
			k++;
			j++;
		}
		for(int t=0;t<m+n;t++) {
			nums1[t] = temp[t];
		}
	}
	public static void main(String[] args) {
        Merge mergeObj = new Merge();

        int nums1[] = {1,2,3,0,0,0};
        int m=3;
        int nums2[] = {2,5,6};
        int n = nums2.length;
        
        mergeObj.merge3(nums1, m, nums2, n);
        System.out.println("Merge sorted arrays: " + Arrays.toString(nums1));
       
        
        
        
    }

}
