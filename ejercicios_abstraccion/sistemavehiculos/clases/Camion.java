package ejercicios_abstraccion.sistemavehiculos.clases;

public class Camion extends Vehiculos{

    public Camion(String marca, String modelo, int kilometros) {
        super(marca, modelo, kilometros);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double calcularMantenimiento() {
        return 1500 + kilometros * 0.30;
    }
    
}
