package com.java.learning;

public class Ana2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "aab";
		String b = "aba";
		
		boolean isAnagram=false;
		
		int[] al = new int[256];
		//int[] bl = new int[256];
		
		for(char c : a.toCharArray()) {
			int index = (int)c;
			al[index]++;
		}
		for(char c : b.toCharArray()) {
			int index=(int)c;
			//bl[index]++;
			al[index]--;
		}
		
		for(int i=0;i<256;i++) {
//			if(al[i]==bl[i]) {
//				isAnagram =true;
//				break;
//			}
			if(al[i]==0) {
				isAnagram=true;
			}
		}
		
		System.out.println(isAnagram);

	}

}
