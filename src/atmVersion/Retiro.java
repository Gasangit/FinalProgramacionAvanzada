package atmVersion;

public class Retiro extends Operacion {
	
	public void ejecutar(Usuario usuario) {
		
		mostrarMensaje("montoRetiro", usuario);
		double dineroDouble = Double.parseDouble(Teclado.ingresoDatoTeclado());
		
		if(dineroDouble != 0) {
			if(controlRetiro(dineroDouble, usuario) == true) {
				
				usuario.obtenerCuenta().establecerSaldoDisp(usuario.obtenerCuenta().obtenerSaldoDisp() - dineroDouble);
				Dispensador.montoEnDispensador -= dineroDouble;
				Sesion.posicionMenu = 0;
				
				mostrarMensaje("confirmarRetiro", usuario);
			}else {
				
				Sesion.posicionMenu = 2;
			}
		}else {
			Sesion.posicionMenu = 0;
		}
	}
	
	private boolean controlRetiro(double montoRetiro, Usuario usuario) {
		
		boolean habilitarRetiro;
		
		if(Dispensador.montoEnDispensador < 20) {
			mostrarMensaje("cajeroSinDinero", null);
			habilitarRetiro = false;
			
		}else if(montoRetiro > Dispensador.montoEnDispensador) {
			mostrarMensaje("dineroInsuficienteCajero", null);
			habilitarRetiro = false;
			
		}else if(montoRetiro > usuario.obtenerCuenta().obtenerSaldoDisp()) {
			mostrarMensaje("dineroInsuficienteCuenta", usuario);
			habilitarRetiro = false;
			
		}else if((montoRetiro % 20) != 0) {
			mostrarMensaje("multiplo20", usuario);
			habilitarRetiro = false;
			
		}else {
			habilitarRetiro = true;
				
		}
		
		return habilitarRetiro;
	}
	
	
	public void mostrarMensaje(String mensaje, Usuario usuario) {
		
		switch (mensaje) {
		
			case "montoRetiro":
			System.out.println("\nPor favor " + usuario.obtenerNombre() + " ingrese el monto a RETIRAR o presione 0 para CANCELAR: "
								+ "\n\n->[ ]<-");
			break;
			case "dineroInsuficienteCajero":
				System.out.println("\n==> El CAJERO no cuenta con el dinero suficiente para realizar el retiro. Pruebe con un monto menor.");
			break;
			case "dineroInsuficienteCuenta":
				System.out.println("\n==> Su CUENTA no cuenta con el dinero suficiente para realizar el retiro. Pruebe con un monto menor.");
			break;
			case "cajeroSinDinero":
				System.out.println("\n==> El CAJERO no puede entregar DINERO en este momento. Puede realizar otras operaciones.");
			break;
			case "multiplo20":
				System.out.println("\n==> El CAJERO solo entrega billetes de $20. Por favor ingrese un MONTO múltiplo de ese valor.");
			break;
			case "confirmarRetiro":
				System.out.println("\n==> El RETIRO se ha efectuado exitosamente");
			break;
		}
	}
	
	@Override
	public String toString() {
		
		return super.toString();
	}
}
