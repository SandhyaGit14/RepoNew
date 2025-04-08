package Tests;

public class VowelsTest {

	public static void main(String[] args) {
		String str = "Java Test uber in out";
		String s1 = "";
		
		s1 = str.replaceAll("[aeiou]", "");
		System.out.println(s1);
		
		System.out.println("Jai Ganesh Vowels");
	}

}
