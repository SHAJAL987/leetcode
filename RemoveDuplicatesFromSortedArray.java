package leetcode;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Array Length: ");
		int len = scn.nextInt();
		int[] arr = new int[len];
		for(int i=0; i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray();
		System.out.println(obj.removeDuplicates(arr));
		
	}
	public int removeDuplicates(int[] nums) {
	     int k=0;
	     for(int i=0; i<nums.length;i++) {
	    	 if(nums[k]!=nums[i]) {
	    		 nums[k+1]=nums[i];
	    		 k++;
	    	 }
	     }
	     return k+1;
	}
}
