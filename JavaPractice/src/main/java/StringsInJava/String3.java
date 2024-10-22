package StringsInJava;

public class String3 {

	public static void main(String[] args) {

		String str = "name123";
		
		StringBuilder sb = new StringBuilder(str);
		
		System.out.println(sb.toString());
		
		System.out.println(sb.reverse());
		
		//===============================================
		
		StringBuffer sf = new StringBuffer(str);
		
		System.out.println(sf.toString());
		
		System.out.println(sf.reverse());
		

	}

}
