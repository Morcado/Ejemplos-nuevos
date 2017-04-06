public class MiExcepcion extends RuntimeException{

    /**
    * Constructor de miExcepcion
    * @param mensaje Informacion relacionada con la excepcion
    */
    public MiExcepcion(String mensaje){
        super(mensaje);
    }
}