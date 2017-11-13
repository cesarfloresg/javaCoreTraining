package com.hcl.string.functions;

public class StringFunctions {
	
	public static int getNumericalValue(String str){
		return Integer.valueOf(str);
	}
	
	public static String getSubstring(String str, int a, int b){
		//a -> starting index
		//b -> ending index 
		return str.substring(a, b);
	}
	
	public static char getStringChar(String str, int index){
		return str.charAt(index);
	}
	public static int stringLength(String str){
		return str.length();
	}
	public static String[] splitString(String str){
		return str.split(" ");
	}
	
	public static void main(String[] args) {
		String str = "using strings";
		String numStr = "20";
		System.out.println("Original String -> "+str+"\n Splited string -> "+(splitString(str)[0].toString() + splitString(str)[1].toString()));
		System.out.println("String length -> "+ stringLength(str));
		System.out.println("get char from String -> "+ getStringChar(str, 4));
		System.out.println("get substring from index 5 to 10 -> "+ getSubstring(str, 5, 10));
		System.out.println("get numerical value of string 20 -> "+ (getNumericalValue(numStr)));
	}
}