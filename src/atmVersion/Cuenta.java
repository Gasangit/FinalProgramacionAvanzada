package atmVersion;

public class Cuenta {
	private String nroCta;
	private double saldoDisp;
	
	public Cuenta(String nroCta, double saldoDisp) {
		
		if(nroCta.length() == 5) {
		this.nroCta = nroCta;
		}else {
			throw new IllegalArgumentException("El número de cuenta debe tener 5 dígitos");
		}
		
		establecerSaldoDisp(saldoDisp);
		
	}
	
	public void establecerSaldoDisp(double saldoDisp) {
		this.saldoDisp = saldoDisp;
	}
	
	public double obtenerSaldoDisp() {
		return saldoDisp;
	}
	
	public String obtenerNumeroCuenta() {
		return nroCta;
	}
	
	@Override
	public String toString() {
		return "Numero de cuenta: " + nroCta + "\nSaldo disponible: " + saldoDisp
				+ "\n";
	}	
}
