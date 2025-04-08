package Tests;

import java.util.*;

import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) {
		String str = "Sandhya is an idiot";
		
		/* Remove Duplicates
		 * System.out.println("Original String "+str); LinkedHashSet<Character> set =
		 * new LinkedHashSet<Character>();
		 * 
		 * for(int i=0; i<str.length(); i++) { set.add(str.charAt(i)); }
		 * 
		 * for(Character x: set) { System.out.print(x); }
		 */
		
		//Count characters
		/*
		 * HashMap<Character, Integer> map = new HashMap<Character, Integer>(); for(int
		 * i=0; i<str.length(); i++) { if(map.containsKey(str.charAt(i))) {
		 * map.put(str.charAt(i), map.get(str.charAt(i))+1); } else {
		 * map.put(str.charAt(i), 1); } } System.out.println(map);
		 */
		
		//count words
		/*
		 * String[] words = str.split(" "); HashMap<String, Integer> map = new
		 * HashMap<String, Integer>(); for(int i=0; i<words.length; i++) {
		 * if(map.containsKey(words[i])) { map.put(words[i], map.get(words[i])+1); }
		 * else { map.put(words[i], 1); } } System.out.println(map);
		 */
		
		//Reverse words in same position
		/*
		 * String[] words = str.split(" "); String revWords="";
		 * 
		 * for(int i=0; i<words.length; i++) {
		 * 
		 * String revW = ""; String wod = words[i];
		 * 
		 * for(int j=wod.length()-1; j>=0; j--) { revW = revW+ wod.charAt(j); }
		 * 
		 * revWords = revWords + revW+ " "; } System.out.println("learnnnnnn   "
		 * +revWords);
		 * 
		 */
		
		//Given the string 'ahud12iebn6578hdj89', what is the sum of all the integer values?

		String s1 = "ahud12iebn6578hdj89";
		String str1 = s1.replaceAll("[^A-Za-z]", "");
		int num = Integer.parseInt(s1.replaceAll("[^0-9]", ""));
		System.out.println(str1);
		System.out.println(num);
		int sum=0, digit=0;
		while(num>0) {
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		
		System.out.println(sum);
		
		/*
		 * public static void SelectByValue(WebDriver Driver, By Locator, String value)
		 * { WebElement ele = driver.findElement(Locator); Select sel = new Select(ele);
		 * sel.selectByValue(value); }
		 */
		
		
		
		
		
	}

}
