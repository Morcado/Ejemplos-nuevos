import java.io.Serializable;

public class Alumno implements Serializable{
    private int clave;
    private String nombre;
    private Laptop portatil;

    public Alumno(int clave, String nombre, Laptop portatil){
  
        this.clave = clave;
        this.nombre = nombre;
        this.portatil = portatil;
    }

    public Laptop dimeLaptop(){
        return portatil;
    }

    public int dimeClave(){
        return clave;
    }

    public String dimeNombre(){
        return nombre;
    }
}