package javaPrograms;

public class Recursion {
	
	int result=0;
	
	public Recursion(int a, int b) {
		result =a*b;
		System.out.print(result);
	}

	public static void main(String[] args) {
		//result = factorial(num);
		//System.out.println(result+ "  result is");
		Recursion r = new Recursion(2,3);
		
	}

}
