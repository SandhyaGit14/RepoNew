package Tests;

public class StringTest {

	public static void checkIfEmpty(String str) {
        if(str.isEmpty()) {
        	System.out.println("String is EMPTY");
        } else {
        	System.out.println("String isn't empty");
        }
		
    }
	
	public static void main(String[] args) {
		StringTest.checkIfEmpty("Hello World!");
	}

}
