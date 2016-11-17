
public class ÜAbend2_b_ArrayDemo2 {
	
	//ich will die Summe aller Zahlen im Array ausgeben.

	public static void main(String[] args) {

		int[] numbers = {10, 17, 13, 2 ,8};
		int result = sum (numbers);

		System.out.println("sum of Array is " +result);
	}
	
	public static int sum (int[] num){
		
		int sum = 0;
		
		for (int i = 0; i < num.length; i++){
			sum = sum + num[i];
		}
		return sum;
	}

}
