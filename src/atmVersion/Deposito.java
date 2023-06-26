package atmVersion;

public class Deposito extends Operacion {

	
	public  void ejecutar(Usuario usuario) {
		RanuraDeposito dinero  = new RanuraDeposito();
		
		if(dinero.depositado() == true) {
			mostrarMensaje("ingresoMonto", usuario);
			double montoDouble = Double.parseDouble(Teclado.ingresoDatoTeclado());
			
			if(montoDouble != 0) {
				usuario.obtenerCuenta().establecerSaldoDisp(usuario.obtenerCuenta().obtenerSaldoDisp() + montoDouble);
				mostrarMensaje("saldoConDeposito", usuario);
				
			}else {
				Sesion.posicionMenu = 0;
			}
			
		}
	};
	
	
	public void mostrarMensaje(String mensaje, Usuario usuario){
		
		switch (mensaje) {
			case "ingresoMonto":
				System.out.println("\nIngrese el MONTO a depositar o presione 0 para CANCELAR: "
									+ "\n\n->[ ]<-");
			break;
			case "saldoConDeposito":
				System.out.println("\n==> Su saldo luego del deposito es : " + usuario.obtenerCuenta().obtenerSaldoDisp());
			break;
		}
	}
	
	@Override
	public String toString() {
		
		return super.toString();
	}
}
