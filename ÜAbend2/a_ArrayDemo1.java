
public class a_ArrayDemo1 {

	
/*What to do:
 * Ich lege ein Array mit zahlen an.
 * es soll geprüft werden ob die gesuchte Zahl "search" im Array vorhanden ist.
 * zB: 5: weder in 3,4,7 noch 6. also false
 * zB: 7: kommt vor. also true
 */
	
	public static void main(String[] args) {

		int[] numbers = {3,4,7,6};
		int search = 5;
	
			System.out.println(containsNumber (numbers,search));
			System.out.println(containsNumber (numbers,7));
		}
			
		
		public static boolean containsNumber (int[] numb, int sear){
			for(int i = 0; i < numb.length; i++){
				
				if (numb[i] == sear){
					return true;
				}
			}

					return false;
	}
}
