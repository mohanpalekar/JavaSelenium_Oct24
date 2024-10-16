package LoppsInJava;

public class SwitchCaseInJava1 {

	public static void main(String[] args) {

		int [] numbers = {1,2,3,4,6};

		//1 - One
		//2 - Two
		//3 - Three
		//4 or higher number --> greater than 3

		for(int i =0; i<numbers.length; i++) {

			System.out.print(numbers[i]+ " : ");

			if(numbers[i]==1) {
				System.out.print("One");
			}else if(numbers[i]==2) {
				System.out.print("Two");
			}else if(numbers[i]==3) {
				System.out.print("Three");
			}else {
				System.out.print("greater than 3");
			}
			System.out.println();
		}
	}

}
