package atm;

public class Cuenta {
	private String nroCta;
	private double saldoDisp;
	private double saldoTotal;
	
	public Cuenta(String nroCta, double saldoDisp, double saldoTotal) {
		
		if(nroCta.length() == 5) {
		this.nroCta = nroCta;
		}else {
			throw new IllegalArgumentException("El número de cuenta debe tener 5 dígitos");
		}
		
		establecerSaldoDisp(saldoDisp);
		establecerSaldoTotal(saldoTotal);
	}
	
	public void establecerSaldoDisp(double saldoDisp) {
		this.saldoDisp = saldoDisp;
	}
	
	public double obtenerSaldoDisp() {
		return saldoDisp;
	}
	
	public void establecerSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}
	
	public double obtenerSaldoTotal() {
		return saldoTotal;
	}
	


	@Override
	public String toString() {
		return "Numero de cuenta: " + nroCta + "\nSaldo disponible: " + saldoDisp + "\nSaldo total: " + saldoTotal
				+ "\n";
	}	
}
