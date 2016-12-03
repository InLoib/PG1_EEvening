
public class a_Winterreifen {

	public static void main(String[] args) {
	
	int temperatur = 3;
	boolean rutschigeFahrbahn = false;
		
	if (isWinterreifenPflicht (temperatur, rutschigeFahrbahn)) {
		System.out.println("Bitte Winterreifen verwenden");
	}
	else {
		System.out.println("Winterreifen sind nicht erforderlich");
	}
		
}
	
	public static boolean isWinterreifenPflicht (int temperatur, boolean rutschigeFahrbahn){
		
		if (temperatur <10 && rutschigeFahrbahn == true){
			return true;
		}
		else if (temperatur <4){
			return true;
		}
		else {
			return false;
	}
		
	
	}
}
