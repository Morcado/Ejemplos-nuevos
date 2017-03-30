public class Principal{
	public static void main(String[] args) {
		System.out.println("Ejemplo de alumnos con clave unica");
		Alumno a1 = new Alumno("Juan");
		Alumno a2 = new Alumno("Karen");
		Alumno a3 = new Alumno("Ivan");

		System.out.println(a1.comoTeLlamas() + ": " + a1.cualEsTuClave());
		System.out.println(a2.comoTeLlamas() + ": " + a2.cualEsTuClave());
		System.out.println(a3.comoTeLlamas() + ": " + a3.cualEsTuClave());

		System.out.println(Alumno.dimeTotalAlumnos());
	}
}