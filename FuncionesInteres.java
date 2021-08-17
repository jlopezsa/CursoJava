// https://www.alphacodingskills.com/java/java-util-scanner.php Site con descripcion de metodos java

import java.util.Scanner;
import javax.swing.*;

public class FuncionesInteres{
    public static void main(String[] args){

        //comparaString();        
        datosPorVentana();
        //ejemploTryDivision();
       // ejemploTryVector();
    }

    // Metodo que realiza la comparación de una palabra ingresada por el usuario y
    // una palabra que se encuentra almacenada en memoria.
    public static void comparaString(){
        Scanner consolaIn = new Scanner(System.in);
        String datoConsola;
        String compara = ":)";
        boolean verificar = false;
    
        System.out.print("Digite la palaba 'verificar' para efectos de comparacion: ");
        datoConsola = consolaIn.nextLine();
        verificar = compara.equals(datoConsola);
        
        if(verificar)
            System.out.println("Comparacion Correcta");
        else
            System.out.println("Comparacion Errada");
                
        consolaIn.close();  //close the scanner
    }

    // Ingresando datos por ventana
    public static void datosPorVentana(){
            //String mensajeVentana = "Ingrese numerador: ";
            String numeradorString;
            String denominadorString;
            int numeradorInt;
            int denominadorInt;
            double resultado;
            numeradorString = JOptionPane.showInputDialog(null, "Ingrese numerador");
            denominadorString = JOptionPane.showInputDialog(null, "Ingrese denominador");

            numeradorInt = Integer.parseInt(numeradorString);
            denominadorInt = Integer.parseInt(denominadorString);

            resultado = (double) numeradorInt/denominadorInt;
            System.out.println("La division entre de sus numeros es: " + resultado);
    }

    public static void ejemploTryDivision(){
        Scanner entradaConsola = new Scanner(System.in);
        int numerador;
        int denominador;
        int resultado;
        System.out.print("Digite numerador: ");
        numerador = entradaConsola.nextInt();
        System.out.print("Digite denominador: ");
        denominador = entradaConsola.nextInt();

        try{
            resultado = numerador/denominador;
        }catch(Exception err){
            System.out.println("Error, division por 0");
            resultado = 0;
        }finally{
            System.out.println("Datos ingresados ok");
        }
        System.out.println("El resultado de la division es: " + resultado);
        entradaConsola.close();
        System.out.println("Fin del programa");
    }

    public static void ejemploTryVector(){
        Scanner entradaConsola = new Scanner(System.in);
        int indice;
        int datoUsuario;
        //int vector [] = {0,0,0,0,0};
        int vector[] = new int[5];
        
        System.out.println("indique la posicion: ");
        indice = entradaConsola.nextInt();
        System.out.println("indique el valor: ");
        datoUsuario = entradaConsola.nextInt();

        try{
            vector[indice] = datoUsuario;
        }catch(Exception err){
            System.out.println("ERROR: Ultrapaso el tamanho del vector: " + err.getMessage());
            indice = 0;
        }
        entradaConsola.close();
        System.out.println("vector["+indice+"] = " + vector[indice]);
        System.out.println("...Fin del programa");

    }
}