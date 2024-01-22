package com.edu;

public class ReverseSent {

	public static void main(String[] args) {
		String s = "hello world"; //olleh dlrow
		//dlrow olleh
		//split(), reverse() function of StringBuffer or StringBuilder class
		String word[]=s.split(" "); //{"hello","world"}
		
		for(int i=word.length-1;i>=0;i--) {
			System.out.print(word[i]+" ");
		}

	}

}
