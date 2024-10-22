package StringsInJava;

import java.util.StringTokenizer;

public class StringTokens {

	public static void main(String[] args) {

		String str = "My 1|Name|is|PQR";

		StringTokenizer tokens = new StringTokenizer(str, "|");

		while(tokens.hasMoreTokens()) {
			System.out.println(tokens.nextToken());
		}



	}

}
