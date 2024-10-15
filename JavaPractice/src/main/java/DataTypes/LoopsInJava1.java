package DataTypes;

import java.util.Arrays;

public class LoopsInJava1 {

	public static void main(String[] args) {

		String [] str = {"Mango", "Guava", "Kiwi", "Apple", "Banana"};

		//Arrays.sort(str);
		
		for(int i=0; i<str.length; i++) {
			
			if(str[i] == "Kiwi") {
				System.out.println(i);
				break;
			}
			
			System.out.println();
			
		}
		
		


	}

}
