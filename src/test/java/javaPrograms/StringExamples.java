package javaPrograms;

public class StringExamples {
	
	public static void main(String[] args) {
		String str = "Sandhya";
		
		if(str.isEmpty()) {
			System.out.println("String is empty");
		} else {
			System.out.println("String isnt Empty "+str);
		}
		
		if(str.startsWith("S")) {
			System.out.println("String starts with S : "+str);
		}
		
		String str1 = str.substring(1, 4);
		System.out.println("String is "+str1);
	}

}
