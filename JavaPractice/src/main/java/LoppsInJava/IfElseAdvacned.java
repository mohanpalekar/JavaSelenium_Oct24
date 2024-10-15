package LoppsInJava;

public class IfElseAdvacned {
	
	public static void main(String[] args) {
		
		int i = 0;
		
		//And -- &&
		//OR -- ||
		
		
		if(i>0) {
			
			if(i>0 && i<=10) {
				
				System.out.println("Number is between 0-10");
				
			}else if(i>10 && i<26) {
				
				System.out.println("Number is between 11-25");
				
			}else if(i>25 && i <51) {
				
				System.out.println("Number is between 26-50");
				
			}else if(i>50 && i<101) {
				
				System.out.println("Number is between 51-100");
				
			}else {
				
				System.out.println("Number is greatter than 100");
				
			}
			
		}else {
			
			if(i == 0) {
				
				System.out.println("Number is 0");
			}else {
				System.out.println("Number is negative");
			}
			
		}
		
		
		
	}

}
