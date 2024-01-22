package com.edu;

public class ReverseEachWorldSentence {

	public static void main(String[] args) {
		String s = "Hello World";
//		StringBuffer bf = new StringBuffer(s);
//		String rev= bf.reverse().toString();
//		System.out.println(rev);
		
		String word[]=s.split(" "); //{"Hello","World"}
		for(String w1:word) { //Hello World
			String s1 = w1;
			StringBuffer bf = new StringBuffer(s1);
		   String rev= bf.reverse().toString();
		   System.out.print(rev+" "); //olleH dlroW
			
		}
		
	}

}
