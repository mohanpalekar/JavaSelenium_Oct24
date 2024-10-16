package LoppsInJava;

public class PrintFibonacciSeries {
	
	public static void main(String[] args) {
		
		int first_number = 0;
		
		int second_number = 1;
		
		int next_number = 0;
		
		System.out.print(first_number +" , "+ second_number+" , ");
		
		for(int i=1; i<9; i++) {
			
			next_number = first_number + second_number;
			
			first_number = second_number;
			
			second_number = next_number;
			
			System.out.print(next_number+" , ");
			
			
		}
		
	}

}
