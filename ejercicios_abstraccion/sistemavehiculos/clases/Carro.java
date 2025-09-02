package ejercicios_abstraccion.sistemavehiculos.clases;

public class Carro extends Vehiculos{

    public Carro(String marca, String modelo, int kilometros) {
        super(marca, modelo, kilometros);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double calcularMantenimiento() {
        return 500 + kilometros * 0.10;
    }
    
}
