package com.java.interview;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str = "The Sky is blue.  ";
//		String rev = "";
//		String[] words = str.split(" ");
//		
//		for(int i=words.length-1; i>=0; i--) {
//			rev += words[i]+ " ";
//		}
//		
//		System.out.println(rev);
		
		String str = "The sky is blue.";
		String rev = "";
		
		int i = str.length()-1;
		
		
		while(i>=0) {
			while(i>=0 && str.charAt(i)== ' ') {
				i--;
			 }
			int j=i;
			while(i>=0 && str.charAt(i)!= ' ') i--;
				
				if(rev.isEmpty()) {
					rev = rev.concat(str.substring(i+1, j+1));
				}
				else {
					rev = rev.concat(" " + str.substring(i+1, j+1));
				}
		
		}
		System.out.println(rev);
		
				
			
		

	}

}
