package com.hcl.java.operators;

public class JavaOperators {

	public static void main(String[] args) {
		//aritmeticOperators(10, 5);
		//unaryOperators();
		//equivalenceOperators(3);
		//relationalOperators(5,6);
		//logicOperators(2, 4);
	}
	public static void aritmeticOperators(int a, int b){
		System.out.println("a -> "+a+" \nb -> "+b);
		//addition
		System.out.println("Addition -> "+ (a+b));
		//subtraction
		System.out.println("Subtraction -> "+ (a-b));
		//multiplication
		System.out.println("Multiplication -> "+ (a*b));
		//Division
		System.out.println("Division -> "+ (a/b));
		//Mod
		System.out.println("Mod -> "+ (a%b));
	}
	public static void unaryOperators(){
		int a = 5;
		int b = 10;
		System.out.println("a -> "+a);
		++a;// pre increment
		System.out.println("a pre increment -> "+a);
		a++; //post increment
		System.out.println("a post increment -> "+a);
		
		System.out.println("a -> "+ b);
		b--;//post decrement	
		System.out.println("b post decrement -> "+b);
		--b; // pre decrement
		System.out.println("b pre decrement -> "+b);
	}
	public static void equivalenceOperators(int a){
		int b = 3;
		System.out.println("base num "+b);
		System.out.println("base < += > = "+ (b+=a));
		System.out.println("base < -= > = "+ (b-=a));
		System.out.println("base < *= > = "+ (b*=a));
		//note at this point b = 9
		System.out.println("base < /= > = "+ (b/=a));
		System.out.println("base < %= > = "+ (b%=a));
	}
	public static void relationalOperators(int a, int b){
		System.out.println("arg a -> "+a+"\narg b-> "+b);
		System.out.println("a > b = "+ (a > b));
		System.out.println("a < b = "+ (a < b));
		System.out.println("a >= b = "+ (a >= b));
		System.out.println("a <= b = "+ (a <= b));
		System.out.println("a == b = "+ (a == b));
	}
	public static void logicOperators(int a, int b){
		System.out.println("arg a -> "+a+"\narg b-> "+b);
		System.out.println("a < b and(&&) b > 0 = "+ (a < b && b > 0));
		System.out.println("a < b and(&&) b < 0 = "+ (a < b && b < 0));
		System.out.println("a < b or(||) b > 0 = "+ (a < b || b > 0));
		System.out.println("a < b or(||) b > 0 = "+ (a < b || b > 0));
		System.out.println("!(a < b)"+ !(a < b));
	}
}
