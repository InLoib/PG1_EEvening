
public class c_ArrayDemo3 {

	/*Array ist: [7,8,12,13,27]
	 * wir wollen jetzt ein ganzes Array aus einer Mothode heraus returnieren.
	 * aber die Zahlen sollen von hinten nach vorn angeschrieben werden, also [27,13,12,8,7]
	 */
	
	
	public static void main(String[] args) {

		int[]array1 = {7,8,12,13,27};
		
		//printArray (array1);
		printArray (reverse(array1));
	}

	public static void printArray (int[] arr){
		for (int  i= 0; i < arr.length; i++){
		System.out.println(arr[i]+", ");	
		}
	}
	
	public static int[] reverse (int[] arr1){
		
		//in Kommentar wär die Variante, wenn man zusätzlich eine Hilfsvariable setzt.
		
		int[]array2 = new int [arr1.length];
		//int ii = arr1.length-1;
				
		for (int  i= 0; i < arr1.length; i++){
		//array2[ii] = arr1[i];
			array2[arr1.length-1-i] = arr1[i];
			}
			return array2;
		}

}
