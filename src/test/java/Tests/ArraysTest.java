package Tests;

public class ArraysTest {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40};
		int sum=0;
		double avg;
		
		for(int i: arr) {
			System.out.print(i+ " ");
			sum+= i; 
		}
		
		System.out.println();
		System.out.println("Sum of Array is "+sum);
		
		avg = ((double)sum / (double)arr.length);
		System.out.println(avg);
	}

}
