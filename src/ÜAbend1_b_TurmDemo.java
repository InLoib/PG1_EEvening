
public class ÜAbend1_b_TurmDemo {

	public static void main(String[] args) {

		int a = 2;
		int b = 2;
		int ergebnis = 0;
		
		while (b <10){
			ergebnis = a * b;
			System.out.println (a +" * " +b +" = " +ergebnis);
			b+=1;
			a = ergebnis;
		}
		
		b=2;
		
		while (b <10){
			a = ergebnis / b;
			System.out.println (ergebnis +" / " +b +" = " +a);
			b+=1;
			ergebnis = a;
		}

	}
}


