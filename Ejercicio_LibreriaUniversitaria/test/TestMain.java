package Ejercicio_LibreriaUniversitaria.test;

import Ejercicio_LibreriaUniversitaria.clases.*;
import Ejercicio_LibreriaUniversitaria.utils.LibreriaService;

public class TestMain {
     public static void main(String[] args) {
        LibreriaService libreria = new LibreriaService();

        // Crear libros
        Libro l1 = new Libro("Programación en Java", "E. Gamma", 2020, 450.0);
        Libro l2 = new Libro("Algoritmos", "T. Cormen", 2015, 600.0);
        libreria.agregarLibro(l1);
        libreria.agregarLibro(l2);

        // Crear clientes
        Cliente c1 = new Cliente("Ana López", 21);
        Cliente c2 = new Cliente("Pedro Ruiz", 30);
        libreria.agregarCliente(c1);
        libreria.agregarCliente(c2);

        // Registrar ventas
        libreria.registrarVenta(c1, l1);
        libreria.registrarVenta(c2, l2);

        // Reportes
        System.out.println("\n--- REPORTES ---");
        libreria.imprimirResumenLibro(l1);
        libreria.imprimirFactura(c1.getHistorialCompras().get(0));

        System.out.println("Promedio de precios: $" + libreria.promedioPrecios());
        System.out.println("Libro más caro: " + libreria.libroMasCaro());
        System.out.println("Libro más barato: " + libreria.libroMasBarato());
        System.out.println("Precio con 10% de descuento: $" + libreria.aplicarDescuento(l2, 10));
    }
}
