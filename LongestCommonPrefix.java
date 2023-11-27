package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    String[] array = new String[3];
	    
	    System.out.println("Please enter 3 names to sort");

	    for (int i = 0; i < array.length; i++) {
	        array[i] = s.nextLine();
	    }
	    LongestCommonPrefix obj = new LongestCommonPrefix();
	    obj.longestCommonPrefix(array);
	    //System.out.println(obj.longestCommonPrefix(array));
	}
	
	public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++) {
        	System.out.println(strs[i]);
        }
        return prefix;
    }

}
