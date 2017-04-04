import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class EjemploArchivos{

    /*este metodo propaga la excepcion hacia quien lo llame*/
    public static void leerArchivo(String nombre) throws IOException, FileNotFoundException{
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
            archivo.write("Hola mundo");
            archivo.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Ejemplo de escritura/lectura en archivos");
        //escribeArchivo("prueba");

        try{
            leerArchivo("prueba.txt");
        }

        /*primero se colocan las subclases en caso de tener muchos catches*/
        catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        catch(NoSuchElementException ex){
            System.out.println(ex.getMessage());
        }
    }
}