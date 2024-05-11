package com.practice;

public class AllDuplicates {

	public static void main(String[] args) {
		
		int[] a = {6,8,10,12,14,2,4,8,18,2,2,2,24,6};
		int[] b = new int[a.length];
		
		for(int i=0; i<a.length; i++) {
			int count=1;
			
			for(int j=i+1; j<a.length; j++) {
				if(a[i] == a[j]) {
					count++;
					b[j] = -1;
				}
			}
			
			if(b[i] != -1) {
				b[i] = count;
			}
		}
		
		boolean isFirst = true;
		for(int i=0; i<a.length; i++) {
			
			if(b[i] != -1 && b[i] > 1) {
				
				if(!isFirst) {
					System.out.print(",");
				}
				
				System.out.print(a[i]);
				isFirst=false;
			}
		}
	}

}
