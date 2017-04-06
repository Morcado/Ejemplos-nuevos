import java.io.*;

public class Laptop implements Serializable{
    private String marca;
    private String modelo;
    
    public Laptop(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString(){
        return "" +marca + modelo;
    }
}