package Unit_01;

public class P6_Task01_ArraysInJava {

	public static void main(String[] args) {
	
		//Declaration 
				int array1[]; 
				
				int[] array2;
				int []array3;
				
				array1 = new int[6];
				for(int i = 0; i < array1.length; i++)
					array1[i] = i;
				
				int array4[] = {33, 3, 4, 5}; 
				
				//passing array to method
				arrayAsParameter(array4);
				
				//passing anonymous array in a method
				arrayAsParameter(new int[] {33, 3, 4, 5});
				
				//returning array from then method 
				int[] array5 = arrayAsReturnType();
				System.out.println(array5.toString());
				
				//ArrayIndexOutOfBoundsExceotion
				int arr[] = {50, 60, 70, 80};
				for(int i = 0; i <= arr.length; i++) {
					System.out.println(arr[i]); 
				} 
			
			//multidimensional array in java
			int[][] arr6 = new int[3][3]; // 3row and 3column 
			
			for(int i = 0, j = 0; i < 3 && j < 3; i++, j++) {
				System.out.println(arr6[i][j]);
			}
			
			int counter = 0; 
			for(int i = 0, j = 0; i < 3 && j < 3; i++, j++) {
				counter++;
				arr6[i][j] = counter;
			}
				for(int i = 0, j = 0; i < 3 && j < 3; i++, j++) {
					System.out.println(arr6[i][j]);
				}
		  }
		 static void arrayAsParameter(int arr[]) {
			 for(int i= 0; i < arr.length; i++)
				 System.out.println(arr[i]);
		 } 
		 
		 //returning array from the method
		  static int[] arrayAsReturnType() {
			 int array4[] = {33, 3, 4, 5};
			  return array4;

	}

}
