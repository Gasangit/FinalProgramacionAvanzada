package atmVersion;

public class Cajero{

	public static void main(String args[]) {
		
		Usuario usuario = null;
		
		do {
			
			Sesion sesion = Sesion.getInstance();
						
			if(sesion.verificarSesion() == true) {
				
				sesion.abrirMenu(usuario);
			}else {
				
				usuario = sesion.controlInicioSesion();	
			}
				
		} while (1 == 1);
		
		//Emula el funcionamiento continuo de un cajero automático
	}		
}
