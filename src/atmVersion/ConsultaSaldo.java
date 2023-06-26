package atmVersion;

public class ConsultaSaldo extends Operacion{

	
	@Override
	public void ejecutar(Usuario usuario) {
		
		mostrarMensaje("saldo", usuario);
	};
	
	
	public void mostrarMensaje(String mensaje, Usuario usuario){
		
		switch (mensaje) {
			case "saldo":
				System.out.println("\n==> Su saldo es : " + usuario.obtenerCuenta().obtenerSaldoDisp());
			break;
		}
	}
		
	@Override
	public String toString() {
		
		return super.toString();
	}
}
