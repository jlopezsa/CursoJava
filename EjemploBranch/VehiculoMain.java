package EjemploBranch;

public class VehiculoMain {
    public static void main(String[] args) {
        Vehiculo carro = new Vehiculo();
        carro.imprimeValores();

        Vehiculo vecCarros [] = new Vehiculo[3];

        System.out.println("--- vector de Vehiculos ---");
        for (int i = 0; i < vecCarros.length; i++) {
            vecCarros[i] = new Vehiculo();
            vecCarros[i].imprimeValores();
        }

        System.out.println("--- Alterando valores ---");
        vecCarros[0].setMarca("Renault");
        vecCarros[0].setVelocidad(110);
        vecCarros[1].setMarca("Fiat");
        vecCarros[1].setVelocidad(90);
        vecCarros[2].setMarca("Mazda");
        vecCarros[2].setVelocidad(150);

        

        for (int i = 0; i < vecCarros.length; i++) {
            vecCarros[i].isVeloz(vecCarros);
            vecCarros[i].imprimeValores();
        }
    }
}
