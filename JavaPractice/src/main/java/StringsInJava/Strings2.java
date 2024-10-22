package StringsInJava;

public class Strings2 {

	public static void main(String[] args) {

		String str = "named";

		char [] ch = str.toCharArray();


		System.out.println(ch.length);

		//		for(char c: ch) {
		//			System.out.println(c);
		//		}
		
		for(int i=0; i<ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		System.out.println("===================================");
		
		for(int i=ch.length-1; i>=0; i--) {
			System.out.print(ch[i]);
		}

	}



}
