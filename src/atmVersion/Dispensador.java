package atmVersion;

public class Dispensador {

	public static double montoEnDispensador; //el monto del cajero es uno siempre y es una propiedad del dispensador en si, por eso static
	public static int conteoDiaEnMinutos; //static porque el conteo para el día es uno solo en cualquier caso (es un dato absoluto)
	
	
	private void cargaDiaria() { //private porque solo accede a este método el método enularDia()
		
		montoEnDispensador = 500;
	}
	
	
	public void emularDia() {
		
		if(conteoDiaEnMinutos > 1440 || conteoDiaEnMinutos == 0) {
			cargaDiaria();
			conteoDiaEnMinutos = 0;
		}
		conteoDiaEnMinutos += (int) (Math.random() * 180 + 1);
		
		System.out.println("\nHorario del retiro -  " + ((int) (conteoDiaEnMinutos / 60)) + ":" + (conteoDiaEnMinutos % 60));
		System.out.println("\n											" + 
							"Mensaje interno sistema - Dinero en DISPENSADOR : " +  montoEnDispensador);
	}
}
