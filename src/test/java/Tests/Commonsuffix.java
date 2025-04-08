package Tests;

import java.util.*;

public class Commonsuffix {
	
	public static void checkSuffix(String arr[]) {
		
		String word="";
		String name="";
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<String> noIngWords = new ArrayList<String>();
		
		
		for(int i=0; i<arr.length; i++) {
			word = arr[i];
			name = word.substring(word.length() - 3);
			if(name.contentEquals("ing")){
				words.add(word);
			} else {
				noIngWords.add(word);
			}
		}
		
		for(String w: words) {
			System.out.println("Words are "+w);
		}
		
		for(String num: noIngWords) {
			/*
			 * if(num.contentEquals("ing")) {
			 * System.out.println(" All the Strings end with ing"); } else {
			 */
				System.out.println("This word doesnt contain ing -  "+ num);
			//}
		}
		
	}
	
	
	public static void main(String args[]) {
		
		String arr[] = {"Calling", "Sending", "eating", "resonating", "Sandhya"};
		checkSuffix(arr);
		
	}

}
