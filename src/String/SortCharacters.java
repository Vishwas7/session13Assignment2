package String;

import java.util.Arrays;

public class SortCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * In here taking string
		 */
		String str="My name is vishwas";
		// window console
		System.out.println("\nprinting separately word");
		/**
		 * 
		 * The string split() method breaks a string
		 * Breaking String by space
		 */
		String[]arrStr=str.split(" ");
		/**
		 * 
		 * using for-each loop
		 * declare a variable elements
		 */
		for(String elements : arrStr){
			
			System.out.println(elements);
		}
			
			
			String str1="My name is vishwas";
			System.out.println("\nprinting the character of each word.");
			String[]arrStr1=str1.split(" ");
			/**
			 * sort String array using sort method
			 */
			Arrays.sort(arrStr1);
			
			/** 
			 * using for-each loop
			 * declare a variable elements1
			 */
			for(String elements1 : arrStr){
			char[] character = elements1.toCharArray();
			Arrays.sort(character);
			System.out.println(character);
		}
	}
}


