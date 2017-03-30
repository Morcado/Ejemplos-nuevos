public class Alumno{
	private String nombre;
	private int clave;
	private static int contador = 0;

	public Alumno(String nombre){
		this.nombre = nombre;
		this.clave = ++contador;
	}

	public String comoTeLlamas(){
		return nombre;
	}

	public int cualEsTuClave(){
		return clave;
	}

	public static int dimeTotalAlumnos(){
		/*
		No se puede utilizar this dentro de un método estático
		System.out.println(this.nombre)
		*/
		return contador;
	}
}