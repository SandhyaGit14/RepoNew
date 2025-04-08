package Tests;

public class Practice {
	
	public void basicCalculator(double num1, char op, double num2) {
        
		double sum=0.0;
		
		switch(String.valueOf(op)) {
		case "+" :
			 sum=num1+num2;
			 break;
		case "-":
			sum=num1-num2;
			break;
		default:
			System.out.print("No output");
		}
		
		System.out.print(sum);
		
		/*
		 * if("+".equalsIgnoreCase(String.valueOf(op))) { sum=num1+num2; } // sum =
		 * num1+op+num2; 
		 */
    
    }
    public static void main(String[] args) {
    	Practice m = new Practice();
        m.basicCalculator(5, '-', 3);
        
        
    }
}
