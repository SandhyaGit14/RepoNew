package Tests;

public class Matrix {
	
	static int r=3;
	static int c=4;
	
	public static boolean isMatrix(int arr[][]) {
		
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				if(!(arr[i][j] == 0 || arr[i][j]==1)) {
					return false;
				}
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		 int mat[][] = { { 1, 0, 1, 1 },
                 { 0, 1, 0, 1 },
                 { 1, 1, 1, 0 } };
		 if(isMatrix(mat)) {
			 System.out.println("True ");
		 } else {
			 System.out.println("false");
		 }
		 
	}

}
