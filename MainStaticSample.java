package com.hcl.saticsample;
/*static import*/
import static java.lang.System.out;
/************************************/

public class MainStaticSample {
	/*
	 * this class is to demonstrate how the static block is loaded just before the main method
	 * and how in this method we're able to create instances from the application classes   
	 * 
	 * this java file refers to Static Sample Class. java 
	 */
	static{
		StaticSampleClass sample = new StaticSampleClass("Sent from static block");
		out.println("--> " + sample.getMessage());
	}

	public static void main(String[] args) {
		out.println("main method initiated -------");

	}

}