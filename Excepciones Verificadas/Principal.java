import java.io.IOException;

public class Principal{

	public static void lanzaExcepcion() throws IOException{
		throw new IOException("Excepcion verificada");
	}

	public static void lanzaNoVerificada() throws RuntimeException{
		throw new RuntimeException("Excepcion no verificada");
	}

	public static void main(String[] args){
		System.out.println("Excepciones verificadas y no verificadas");
		
		/*Es obligatorio utilizar try-catch en excepciones verificadas
		es decir, aquellas excepciones que no son subclase de RuntimeException*/
		try{
			lanzaExcepcion();
		}
		catch(IOException e){
			System.out.println("Atrapa la exepcion");
			e.printStackTrace();
		}

		/*Es opcional usar try-catch en excepciones no verificadas,
		es decir, aquellas excepciones que son sublase de RuntimeException*/
		lanzaNoVerificada();
	}
}