import java.util.Scanner;
public class DivEnteros{
    public static void main(String[] args){
        Scanner datoConsola = new Scanner(System.in);
        int numerador;
        int denominador;
        int resultado;

        System.out.print("Ingrese numerador: ");
        numerador = datoConsola.nextInt();
        System.out.print("Ingrese denominador: ");
        denominador = datoConsola.nextInt();


        try{
            resultado = numerador/denominador;
        }catch(ArithmeticException errorDiv){
            System.out.println("ERROR, division por 0: "+ errorDiv.getMessage());
            resultado = 0;
        }

        System.out.print("La division entre "+ numerador + " y " + denominador + " es " + resultado + "\n");

        System.out.println("... Fin del programa ...");
        datoConsola.close();
    }
}