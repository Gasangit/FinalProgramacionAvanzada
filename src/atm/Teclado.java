package atm;

import java.util.Scanner;

public class Teclado  {

	Scanner ingresoUsuario = new Scanner(System.in);
	
	private final static Teclado INSTANCE = new Teclado();
	
	
	public String ingresoDatoTeclado() {
		
		String dato = ingresoUsuario.nextLine();
		
		return dato;
	};
	
	public double ingresoMontoTeclado() {
		
		double monto = Double.parseDouble(ingresoUsuario.nextLine());
		
		return monto;
	};
	
	public static Teclado getInstance() {
    	
    	return INSTANCE;
	}
	
//	Pantalla pantalla = Pantalla.getInstance();
//	
//	private final static Teclado  INSTANCE = new Teclado();
//	 
//	 
//	
//	public String [] ingresarNipCuenta() {
//		
//		pantalla.mostrarMensaje("Bienvenidos a LAG BANKING S.A, tú banco digital");
//		
//		pantalla.mostrarMensaje("Ingrese su CUENTA : ");
//		String cuenta = ingresoUsuario.nextLine();
//		if(cuenta.length() == 5) {
//			if(cuenta.) {
//				
//			}
//		}
//		
//		pantalla.mostrarMensaje("Ingrese su NIP : ");
//		String nip = ingresoUsuario.nextLine();
//				
//		String datosUsuario [] = {nip, cuenta};
//		
//		return datosUsuario;
//	}
//	
//	public static Teclado getInstance() {
//    	
//    	return INSTANCE;
//	}
//	
//	
//	public double ingresarMontoDepositar() {
//		
//		System.out.println("Ingrese el MONTO a DEPOSITAR : ");
//		double  montoDepositar = Double.parseDouble(ingresoUsuario.nextLine());
//		  
//		return montoDepositar;
//	};
}

