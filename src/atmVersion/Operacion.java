package atmVersion;

public abstract class Operacion implements Pantalla{
	
	public abstract void ejecutar(Usuario usuario);
	
	
	@Override
	public String toString() {
		
		return "\n------------------------------------------------------------------------------------------------------";
	}
}
