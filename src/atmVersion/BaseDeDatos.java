package atmVersion;


public class BaseDeDatos {

	public static Usuario [] getBaseDeDatos() {
		
		Usuario dario = new Usuario("Dario","Musopapa", "23467","78967");
		Usuario juliana = new Usuario("Juliana","Peña","67543","89076");
		Usuario jorge = new Usuario("Marta","Melillo","12345","12345");
		Usuario isabel = new Usuario("Isabel","Perón","90876","67543");
		Usuario bernardo = new Usuario("Bernardo","Puelles","78654","34786");
		
		Usuario arrayUsuarios[] = {dario, juliana,jorge, isabel,bernardo};
		
		return arrayUsuarios;
	} 
}
