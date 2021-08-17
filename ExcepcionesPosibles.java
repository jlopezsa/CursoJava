
public class ExcepcionesPosibles {
    public static void main(String[] args){
        int numerador = 4;
        int denominador = 0;
        int resultado = 0;
        //resultado = numerador/denominador;
        System.out.println("antes del error");
        System.out.println("resultado = " + resultado);

        float [] vector = {0,0};

        //System.out.println("Vector en pos 1 = "+vector[5]);

        System.out.println("Despues del error");

        vector[0] = 3/8;
        vector[1] = 6/2;
        try{
            vector[2] = 4/0;
        }catch(ArithmeticException e){
            System.out.println("Error, division por 0");
        }catch(ArrayIndexOutOfBoundsException f){
            System.out.println("Altrapasa tamanho de vector");
        }
        


    }
}
