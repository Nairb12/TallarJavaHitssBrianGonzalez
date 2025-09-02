package ejercicios_abstraccion.sistemavehiculos.clases;

public abstract class Vehiculos {
    protected String Marca;
    protected String Modelo;
    protected int kilometros;
    public Vehiculos(String marca, String modelo, int kilometros) {
        this.Marca = marca;
        this.Modelo = modelo;
        this.kilometros = kilometros;
    }
    public abstract double calcularMantenimiento();
    @Override
    public String toString() {
        return "{Marca: " + Marca + ", Modelo: " + Modelo + ", kilometros:" + kilometros + "}";
    }
    
} 
