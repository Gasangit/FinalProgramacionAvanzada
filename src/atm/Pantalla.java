package atm;

public class Pantalla {
	
	private final static Pantalla INSTANCE = new Pantalla();
	
	
	public void mostrarMensaje(String mensaje) {
		
		System.out.println(mensaje);
	};
	
	public static Pantalla getInstance() {
    	
    	return INSTANCE;
	}

	
}
