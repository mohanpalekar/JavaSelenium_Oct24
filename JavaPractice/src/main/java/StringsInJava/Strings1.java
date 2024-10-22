package StringsInJava;

public class Strings1 {

	public static void main(String[] args) {

		String str = "Hello World2";

		String str1 = new String("Hello1");

		System.out.println(str);

		System.out.println(str1);

		int i = 9;

		i = 10;

		System.out.println(i);
		
		System.out.println(str.replace("l", "L").replace("H", "y"));
		
		str = str.replace("l", "L").replace("H", "y");
		
		System.out.println(str);
		

	}

}
