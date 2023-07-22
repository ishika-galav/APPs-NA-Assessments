package com.java.learning;
import java.util.*;

public class StringProg {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	
	String rev ="";
	int i = s.length()-1;
	
	while(i>=0) {
		while(i>=0 && s.charAt(i)==' ')i--;
		int j=i;
		//if (i==0)break;
		while(i>=0 && s.charAt(i)!=' ')i--;
		if(rev.isEmpty()) {
			rev = rev.concat(s.substring(i+1, j+1));
		}
		else
			rev = rev.concat(" " + s.substring(i+1, j+1));
	}
	
	System.out.print(rev);
	

}
}