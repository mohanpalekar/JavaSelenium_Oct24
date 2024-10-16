package LoppsInJava;

public class SwitchCaseWithArray {

	public static void main(String[] args) {

		String [] numbers = {"One", "Two", "Three", "Five"};

		//		for(String str : numbers) {
		//			System.out.println(str);
		//		}
		//		
		//		int [] arr = {1,2,4,5,6};
		//		
		//		for(int x : arr) {
		//			System.out.println(x);
		//		}
		//		
		//		char [] ch = {'c','5','*'};
		//		
		//		for(char c : ch) {
		//			System.out.println(c);
		//		}

		for(String str : numbers) {

			switch(str) {

			case "Zero":
				System.out.println(0);
				break;

			case "One":
				System.out.println(1);
				break;

			case "Two":
				System.out.println(2);
				break;

			case "Three":
				System.out.println(3);
				break;

			default:
				System.out.println("more than 3");

			}
			
			System.out.println("====================================");

		}

	}

}
