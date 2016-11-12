
public class ÜAbend1_d_Wuerfelspiel {

	public static void main(String[] args) {
				
		triesUntilTherrOnes();
		
}

	public static int triesUntilTherrOnes() {

		int oneVers = 0;
		int One = 0;
		int wurf = 0;
		
		
		while (One < 3){
			wurf = 1 + (int)(Math.random() *6);
			if (wurf == 1){
		System.out.println ("Versuch = "+oneVers);
			}
			oneVers++;
	}
		return oneVers;
}

}


