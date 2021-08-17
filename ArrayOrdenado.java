public class ArrayOrdenado {
    public static void main(String[] args) {
        int vector [] = {6,4,8,9,6};
        //int vecOrdenado [] = new int [vector.length];
        int aux;

        System.out.println("Vector original");
        for(int i=0; i<vector.length;i++){
            System.out.print(vector[i] + "  " );
        }

        for(int i=0; i<vector.length;i++){
            for (int j = i+1; j < vector.length; j++) {
                if(vector[i]<=vector[j]){
                    aux = vector[i];
                    vector[i] = vector[j];
                    vector[j]=aux;
                }
            }
        }
        
        System.out.println("\nVector ordenado");
        for(int i=0; i<vector.length;i++){
            System.out.print(vector[i] + "  " );
        }
    }
}

