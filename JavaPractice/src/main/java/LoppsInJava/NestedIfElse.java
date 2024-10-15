package LoppsInJava;

public class NestedIfElse {

	public static void main(String[] args) {


		int i = -10;

		if(i>0) {

			if(i >= 10) {

				System.out.println("Number is greater than 10");

			}else {

				System.out.println("Number is less than 10");

			}

		}else {

			if(i <= -10 ) {

				System.out.println("Number is less than or equal to -10");

			}else {

				System.out.println("Number is greatter than -10");

			}

		}

	}

}
