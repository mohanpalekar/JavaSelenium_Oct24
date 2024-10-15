package DataTypes;

public class FoorLoopC1 {
	
	public static void main(String[] args) {
		
		int [] arr = {12,4,678,80,23,76};
		
		// int [] arr1 = new int[]{12,4,678,80,23,76};
		
		int sum = 0;
		
		for(int i=0; i<arr.length;i++) {
			
			sum = sum + arr[i];
		}
		
		
		System.out.println(sum);
		
	}

}
