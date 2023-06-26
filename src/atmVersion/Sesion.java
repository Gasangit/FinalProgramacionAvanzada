package atmVersion;

public class Sesion implements Pantalla{
	
	private Boolean usuLog = false;
	private final static Sesion  INSTANCE = new Sesion();
	public static int posicionMenu = 0;
	 
	public static Sesion getInstance() {
	    	
	   	return INSTANCE;
	}
	
	private void abrirSesion() {
		usuLog = true;
	}
	
	private void cerrarSesion() {
		usuLog = false;
	}
	
	public boolean verificarSesion() {
		
		return usuLog;
	}

	//------------------------------------------------------------------------------------------

	
	public Usuario controlInicioSesion() {
		
		Usuario usuarios [] = BaseDeDatos.getBaseDeDatos();
	
		while (usuLog == false) {
			
			
			mostrarMensaje("saludo", null);
			int caracteres;
			String nip;
			String numeroCuenta; 
			
			do {
				mostrarMensaje("ingresoNip", null);
				nip = Teclado.ingresoDatoTeclado();
				caracteres = nip.length();
				
			}while(caracteres != 5);
			
			
			do {
				mostrarMensaje("ingresoCuenta", null);
				numeroCuenta = Teclado.ingresoDatoTeclado();
				caracteres = numeroCuenta.length();
				
			}while(caracteres != 5);
			
			
			for(Usuario unUsuario : usuarios) {
				
				if(nip.equalsIgnoreCase(unUsuario.obtenerNip()) && 
					numeroCuenta.equalsIgnoreCase(unUsuario.obtenerCuenta().obtenerNumeroCuenta())) {
											
						this.abrirSesion();
						mostrarMensaje("sesionOk", unUsuario);
						return unUsuario;
				}		
			}
			
			if(usuLog == false) {mostrarMensaje("errorInicio", null);}
		}
		
		 return null;
	}
	
	//------------------------------------------------------------------------------------------
	
	public void mostrarMensaje(String tipoMensaje, Usuario usuario) {
		
		switch (tipoMensaje) {
			case "saludo":
				System.out.println("\n----------***** Bienvenido a la red de cajeros de LAGBank.S.A. *****----------");
			break;
			case "ingresoNip":
				System.out.println("\nIngrese su número de NIP : ");
			break;
			case "ingresoCuenta":
				System.out.println("\nIngrese su número de CUENTA : ");
			break;
			case "errorInicio":
				System.out.println("\nNo puede iniciar sesión, ha ingresado datos incorrectos");
			break;
			case "sesionOk":
				System.out.println("\nHa ingresado a su sesión " + usuario.toString());
			break;
			case "menu":
				System.out.println("\n------------------------------------------------------------------------------------------------------" 
								+ "\n\nIngrese el número de alguna de las opciones"
								+ "\n\n1 - Solicitud de Saldo"
								+ "\n2 - Retiro"
								+ "\n3 - Deposito"
								+ "\n4 - Cerrar Sesión"
								+ "\n\n->[ ]<-");
			break;
			case "despedida":
				System.out.println("\nMuchas gracias por utilizar nuestra red de cajeros");
			break;
		}
	}
	
	public void abrirMenu(Usuario usuario) {
		
		int numero; 
		
		if(posicionMenu == 0) {
			do {
				mostrarMensaje("menu", null);
				numero = Integer.parseInt(Teclado.ingresoDatoTeclado());
				
			} while (numero < 1 || numero > 4);
		}else {
			numero = posicionMenu;
		}
		
		switch (numero) {
			case 1:
				ConsultaSaldo consulta = new ConsultaSaldo();
				System.out.println(consulta);
				consulta.ejecutar(usuario);
			break;
			case 2:
				//retiro
				Dispensador dispensador = new Dispensador();
				Retiro retiro = new Retiro();
				System.out.println(retiro);
				dispensador.emularDia();
				retiro.ejecutar(usuario);
			break;
			case 3:
				Deposito deposito = new Deposito();
				System.out.println(deposito);
				deposito.ejecutar(usuario);
			break;
			case 4:
				cerrarSesion();
				mostrarMensaje("despedida", null);
			break;
		}
	}
}
