package Ejercicio_LibreriaUniversitaria.test;

import Ejercicio_LibreriaUniversitaria.clases.*;
import Ejercicio_LibreriaUniversitaria.utils.LibreriaService;

public class TestMain {
     public static void main(String[] args) {
        LibreriaService libreria = new LibreriaService();

       System.out.println("=== PRUEBAS DEL SISTEMA ===");

        // 1. Validación de datos --------------------------
        try {
            Libro invalido = new Libro("Historia Antigua", "Autor Desconocido", 1850, 300.0);
            libreria.agregarLibro(invalido);
        } catch (IllegalArgumentException e) {
            System.out.println("Error validación libro: " + e.getMessage());
        }

        try {
            Cliente menor = new Cliente("Juanito", 15);
            libreria.agregarCliente(menor);
        } catch (IllegalArgumentException e) {
            System.out.println("Error validación cliente: " + e.getMessage());
        }

        // Libros válidos
        Libro l1 = new Libro("Programación en Java", "E. Gamma", 2020, 450.0);
        Libro l2 = new Libro("Algoritmos", "T. Cormen", 2015, 600.0);
        Libro l3 = new Libro("Estructuras de Datos", "R. Lafore", 2018, 350.0);

        libreria.agregarLibro(l1);
        libreria.agregarLibro(l2);
        libreria.agregarLibro(l3);

        // Clientes válidos
        Cliente c1 = new Cliente("Ana López", 21);
        Cliente c2 = new Cliente("Pedro Ruiz", 30);
        libreria.agregarCliente(c1);
        libreria.agregarCliente(c2);

        // 2. Registrar ventas --------------------------
        libreria.registrarVenta(c1, l1);
        libreria.registrarVenta(c2, l2);
        libreria.registrarVenta(c1, l3);

        // 3. Transformar objetos --------------------------
        System.out.println("\n=== TRANSFORMACIONES ===");
        libreria.imprimirResumenLibro(l1);
        libreria.imprimirFactura(c1.getHistorialCompras().get(0));

        // 4. Ejecutar acciones (reportes / notificaciones) --------------------------
        System.out.println("\n=== ACCIONES ===");
        System.out.println("Historial de compras de Ana:");
        for (Venta v : c1.getHistorialCompras()) {
            System.out.println(v);
        }

        // 5. Generar información automática --------------------------
        System.out.println("\n=== IDs y códigos generados ===");
        System.out.println("ID Libro 1: " + l1.getId());
        System.out.println("ID Cliente 1: " + c1.getId());
        System.out.println("Código Venta 1: " + c1.getHistorialCompras().get(0).getCodigo());
        System.out.println("Fecha Venta 1: " + c1.getHistorialCompras().get(0).getFecha());

        // 6. Realizar cálculos --------------------------
        System.out.println("\n=== CÁLCULOS ===");
        System.out.println("Promedio de precios: $" + libreria.promedioPrecios());
        System.out.println("Libro más caro: " + libreria.libroMasCaro());
        System.out.println("Libro más barato: " + libreria.libroMasBarato());
        System.out.println("Descuento 10% en 'Algoritmos': $" + libreria.aplicarDescuento(l2, 10));
    }
}
