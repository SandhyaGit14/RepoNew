package Tests;

import java.util.*;

public class BoschPracticeTest {
	
	public static void main(String[] args) {
		String str = "Sandhya is an idiot";
		
		//str= str.toLowerCase();
		//Remove Duplicates
		/*
		 * LinkedHashSet<Character> set = new LinkedHashSet<Character>(); for(int i=0;
		 * i<str.length(); i++) { set.add(str.toLowerCase().charAt(i)); }
		 * 
		 * for(Character ch: set) { System.out.print(ch); }
		 */
		
		//Count characters
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		System.out.println(map);
		
		
		//Count words
		/*
		 * String[] words = str.split(" "); HashMap<String, Integer> map = new
		 * HashMap<String, Integer>(); for(int i=0; i<words.length; i++) {
		 * if(map.containsKey(words[i])) { map.put(words[i], map.get(words[i])+1); }
		 * else { map.put(words[i], 1); } }
		 * 
		 * System.out.println(map);
		 */
		
		//Reverse words in its position
		/*
		 * String[] words = str.split(" "); String revWords="";
		 * 
		 * for(int i=0; i<words.length;i++) { String word = words[i]; String revWo ="";
		 * 
		 * for(int j=word.length()-1; j>=0; j--) { revWo = revWo+ word.charAt(j); }
		 * revWords = revWords+revWo+" "; } System.out.println(revWords);
		 */
		
			
		
		
		
		
		
		
		
		
		
		
	}

}
