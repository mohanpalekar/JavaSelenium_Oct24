package DataTypes;

public class PrimitiveDataType {
	
	public static void main(String[] args) {
		
		byte b = 127;
		
		System.out.println(b);
		
		short s = 32767;
		
		System.out.println(s);
		
		int i = 932823442;
		
		System.out.println(i);
		
		long l = 2147483647;
		
		System.out.println(l);
		
		char c = 'd';
		
		System.out.println(c);
		
		boolean bl = false;
		
		System.out.println(bl);
		
		String str = "My Name is ABC123#@%@^   ";
		
		System.out.println(str);
		
		int [] arr = new int [5];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		for(int k : arr) {
			System.out.println(k);
		}
		
		char [] ch1 = new char[5];	
		
		ch1[0] = 'p';
		ch1[1] = 'd';
		ch1[2] = 'g';
		ch1[3] = 'c';
		ch1[4] = '*';
		
		for(char k : ch1) {
			System.out.println(k);
		}
		
	}

}
