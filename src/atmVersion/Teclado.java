package atmVersion;

import java.util.*;

public class Teclado  {
	
	public static String ingresoDatoTeclado() {
		
		String dato = "";
		
		while(dato.isEmpty()) {
			Scanner scanner = new Scanner(System.in);
			
			dato = scanner.nextLine();
		}
		
		return dato;
	}
}

