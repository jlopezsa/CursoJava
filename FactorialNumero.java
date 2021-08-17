public class FactorialNumero {
    public static void main(String[] args) {
        long numero = 8;
        
        System.out.println(factorialNumero(numero));
    }

    public static long factorialNumero(long n){
        if(n>0){
            return factorialNumero(n-1)*n;
        }else{
            return 1;
        }
    }
}
