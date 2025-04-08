package Tests;

import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
String str = "Sandhya is an idiot";
		
		 //Remove Duplicates
		  System.out.println("Original String "+str); 
		  LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		  
		  for(int i=0; i<str.length(); i++) { 
			  set.add(str.charAt(i));
			  }
		  
		 for(Character x: set) { System.out.print(x); }
		 

	}

}
