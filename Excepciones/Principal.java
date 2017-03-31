import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    /**
     * Este método realiza la división de dos numeros
     * @param num1 valor del primer numero
     * @param num2 valor del segundo numero
     * @return regresa la division de los numeros
     *
     */
    public static int divideNumeros(int num1, int num2){
        return num1/num2;
    }

    public static void main(String[] args){
        Boolean correcto = false;
        Scanner entrada = new Scanner(System.in);
        do {
            try {
                System.out.print("Valor del primer numero: ");
                int numero1 = entrada.nextInt();
                System.out.print("Valor del segundo numero: ");
                int numero2 = entrada.nextInt();
                int resultado = divideNumeros(numero1, numero2);
                System.out.println("Resultado = " + resultado);
                correcto = true;
            } catch (InputMismatchException excepcionEntreada) {
                System.out.println("La entrada no concuerda con un numero :v");
                entrada.next();
            } catch
        }while(!correcto);
    }
}
