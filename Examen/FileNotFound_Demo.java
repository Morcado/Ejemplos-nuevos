import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileNotFound_Demo{
    public static void main(String[] args){
        try{
            File file = new File("File.txt");
            FileWriter fw = new FileWriter(file);
            FileReader fr = new FileReader(file);

        }
        catch(IOException e){
            System.out.println(e);
            
        }
        finally{
            System.out.println("Excepcion no atrapada, entra en finally");
        }
    }
}