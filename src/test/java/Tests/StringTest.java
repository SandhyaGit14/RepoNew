package Tests;

public class StringTest {

	public static void checkIfEmpty(String str) {
        if(str.isEmpty()) {
        	System.out.println("String is EMPTY");
        } else {
        	System.out.println("String isn't empty");
        }
		
        System.out.println("Git Post 1");
        System.out.println("Git Post 2");
        System.out.println("Git Post 3");
    }
	
	public static void main(String[] args) {
		StringTest.checkIfEmpty("Hello World!");
	}

}
