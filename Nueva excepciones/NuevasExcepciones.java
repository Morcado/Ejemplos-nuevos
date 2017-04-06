public class NuevasExcepciones extends RuntimeException{
    public static void main(String[] args) {
        System.out.println("Ejemplo de finally");
        try{
            Alumno a2 = new Alumno(123, "");
            Alumno a1 = new Alumno(-123, "");
            noLanzaExcepcion();
            lanzaExcepcion();
            //Alumno a3 = new Alumno(, "");
        }
        catch(MiExcepcion ex){
            System.out.println(ex);
        }
    }

    public static void noLanzaExcepcion(){
        try{
            System.out.println("Hola");
            //metodo1();
        }
        catch(MiExcepcion ex){
            System.out.println("No hay nada que atrapar"); /*no la atrapa*/
        }
        finally{
            System.out.println("Se ejecuta finally en noLanzaExcepcion");
        }
    }

    /*se pone el throws si es na excepcion verificada*/
    public static void metodo1(){
        throw new MiExcepcion("Aqui casual lanzando una excepcion");
    }

    public static void lanzaExcepcion(){
        try{
            System.out.println("Metodo lanzaExcepcion");
            throw new MiExcepcion("Probando mi ecepcion"); /*dar mensaje acerca de la excepcion propia*/
        }
        finally{
            System.out.println("Se ejecuta finally en lanzaExcepcion");
        }
    }
}