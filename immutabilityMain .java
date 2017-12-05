/**
 * 
 */
package com.hcl.strings.immutability;

/**
 * @author oscar.cv
 * This class demonstrate in a practical way what is the string immutability in java
 * 
 *  an String is immutable because of:
 *  Securty: Typically parameters are represented as String in network,database connections and urls.
 *           if it were mutable these parameters could be easily changed  
 *           
 *  Synchronization and 
 *  Concurrency: Making String objects automatically makes them thread safe 
 *  			 thereby solving synchronization issues
 *     
 *  Caching:	When compiler optimizes your String objects it sees that if two objects have same value 
 *  			and thus you need only one String object, so both string object variable will point to the same 
 *  			string object in the string pool
 *  
 *  Class loading: String is used as arguments for class loading. if it where mutable  could result in a wrong class 
 *  			   being loaded (because mutable objects change their state).
 *   
 *
 */
public class immutabilityMain {

	public static void main(String[] args) {
		String strA = "test";
		String strB = "test";
		String strC = new String("test");
		
		
		System.out.println(strA == strB);
		System.out.println(strA == strC.concat(strA));
		System.out.println(strA == strC.concat(strA));
		System.out.println(strA == strC.concat(strB));
		
		System.out.println("strA  ->  "+ strA.hashCode());
		System.out.println("strB  ->  "+ strB.hashCode());
		System.out.println("strC  ->  "+ strC.hashCode());
		
		strA+= "adding";
		strB+= "adding";
		
		//by alter the original string we can see that a new string object is created
		//we can say this because of the hashcode of the object 
		
		System.out.println("strA  ->  "+ strA.hashCode());
		System.out.println("strB  ->  "+ strB.hashCode());
		
		System.out.println(strA == strB);
		System.out.println("strA equals strB: ->  " + strA.equals(strB));
	}

}