package LoppsInJava;

public class SwitchCaseWithString {

	public static void main(String[] args) {

		String str = "Four";

		switch(str) {

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
			System.out.println("0 or higher than 3");

		}

	}

}
