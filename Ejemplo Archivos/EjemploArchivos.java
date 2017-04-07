import java.io.*;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class EjemploArchivos{

    public static void leeAlumno(String nombreArchivo){
        File archivo = new File(nombreArchivo);

        try{
            FileInputStream flujoEntrada = new FileInputStream(archivo);
            ObjectInputStream objetoEntrada = new ObjectInputStream(flujoEntrada);
            Alumno a1 = (Alumno)objetoEntrada.readObject();
            System.out.println("Alumno leido desde el archivo...");
            System.out.println("Nombre = " + a1.dimeNombre());
            System.out.println("Clave = " + a1.dimeClave());
            System.out.println("Laptop = " + a1.dimeLaptop());

        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        catch(ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }

    }

    /*escribe un objeto "entero" en el archivo*/
    public static void escribeAlumno(String nombreArchivo){
        File archivo = new File(nombreArchivo);

        try{
            FileOutputStream flujoSalida = new FileOutputStream(archivo);
            ObjectOutputStream objetoSalida = new ObjectOutputStream(flujoSalida);
            Alumno a1 = new Alumno(12345, "Diego", new Laptop("Alienware", "Ni idea"));
            objetoSalida.writeObject(a1);
            objetoSalida.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
            System.out.println("Error al escribir el alumno en el archivo");
        }
    }

    /*este metodo propaga la excepcion hacia quien lo llame*/
    public static void leeArchivo(String nombre) throws IOException, FileNotFoundException{
        File archivo = null;
        Scanner entrada = null;

        archivo = new File(nombre);
        entrada = new Scanner(archivo);

        while(entrada.hasNextLine()){
            int linea = entrada.nextInt();
            System.out.println("Linea: " + linea);
        }
        entrada.close();
    }

    public static void escribeArchivo(String nombre){
        FileWriter archivo = null;
        try{
            archivo = new FileWriter(nombre);
            //Alumno a1 = new Alumno(12345, "Diego");
            //archivo.write(a1);
            //archivo.write(a1.dimeClave());
            //archivo.write(a1.dimeNombre());
            archivo.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        finally{
            try{
                archivo.close();
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Ejemplo de escritura/lectura en archivos");
        //escribeArchivo("prueba");

        try{
            escribeArchivo("Alumnos.txt");
            escribeAlumno("Alumnos.dat");
            leeAlumno("Alumnos.dat");
            //leeArchivo("Alumnos.txt");
        }

        /*primero se colocan las subclases en caso de tener muchos catches*/
 /*       catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }*/
        catch(NoSuchElementException ex){
            System.out.println(ex.getMessage());
        }
    }
}