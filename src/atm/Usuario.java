package atm;

public class Usuario {
	private String nombre; 
	private String apellido; 
	private Cuenta cuenta; 
	private String nip; 
	
	public Usuario(String n, String a, String numeroCuenta, String nip) { 
		nombre = n; 
		apellido = a;
		this.cuenta = new Cuenta(numeroCuenta, 0, 0);
		this.nip = nip;
	}
	
	public String obtenerNombre() {
		return nombre;
	}
	
	public String obtenerApellido() {
		return apellido;
	}
	
	public Cuenta obtenerCuenta() { 
		return cuenta; 
	}
	
	public void establecerCuenta (Cuenta c) {
		cuenta = c;
	}

	@Override
	public String toString() { 
		return "Cliente: " + nombre + ", " + apellido + "\n" + cuenta;
	}
	
}
