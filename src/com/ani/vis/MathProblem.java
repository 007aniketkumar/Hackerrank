package com.ani.vis;

import java.util.Arrays;

public class MathProblem {

	
	public static void main(String[] args) {
		//list of inputs
		
		int happy[] = new int[] {1,2,3,5,7,6,8,4};
		
		//sort the array
		
		Arrays.sort(happy);
		
		int threshold = 4;
		int min = happy[0];
		int max = happy[happy.length-1];
		int happiness = max-min;
		if(happiness >= threshold) {
		// find min , max and mid
	
			System.out.println( 2+(happy.length-2)/2);
			
			
			
		} else {
			System.out.println(happy.length);
		}
		
		
	}
	
	
	
}
