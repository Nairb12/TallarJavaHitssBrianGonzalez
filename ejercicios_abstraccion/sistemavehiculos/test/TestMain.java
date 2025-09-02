package ejercicios_abstraccion.sistemavehiculos.test;

import ejercicios_abstraccion.sistemavehiculos.clases.Bus;
import ejercicios_abstraccion.sistemavehiculos.clases.Camion;
import ejercicios_abstraccion.sistemavehiculos.clases.Carro;
import ejercicios_abstraccion.sistemavehiculos.clases.Vehiculos;

public class TestMain {
    public static void main(String[] args) {
        Vehiculos carro = new Carro("Toyota", "Corolla 2025", 20000);
        Vehiculos bus = new Bus("BMW", "van 2025", 50000);
        Vehiculos camion = new Camion("Kenwordth", "Kenwordth", 60000);
        System.out.println(carro);
        System.out.println("Mantenimiento: "+carro.calcularMantenimiento());
        
        System.out.println(bus);
        System.out.println("Mantenimiento: "+bus.calcularMantenimiento());
        
        System.out.println(camion);
        System.out.println("Mantenimiento: "+camion.calcularMantenimiento());
    }
}
