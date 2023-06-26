package atm;


public class Sesion {
	
	private Boolean usuLog = false;
	
	 private final static Sesion  INSTANCE = new Sesion();
	 
	 public static Sesion getInstance() {
	    	
	    	return INSTANCE;
	 }
	
	private void abrirSesion() {
		usuLog = true;
	}
	
	private void cerrarSesion() {
		usuLog = false;
	}
	
	public boolean validarSesion() {
		
		System.out.println("El estado de la sesion es " + usuLog);
		return usuLog;
	}
	
	
}
