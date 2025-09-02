package ejercicios_abstraccion.sistemavehiculos.clases;

public class Bus extends Vehiculos{

    public Bus(String marca, String modelo, int kilometros) {
        super(marca, modelo, kilometros);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double calcularMantenimiento() {
        return 1000 + kilometros * 0.20;
    }
    
}
