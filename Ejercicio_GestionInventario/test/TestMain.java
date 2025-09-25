package Ejercicio_GestionInventario.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import Ejercicio_GestionInventario.clases.Producto;

public class TestMain {
    public static void main(String[] args) {
       // 1. Registrar productos en el inventario (LinkedHashMap mantiene el orden de inserción)
        Map<String, Producto> inventario = new LinkedHashMap<>();
        inventario.put("SKU001", new Producto("SKU001", "Balón de fútbol", "Fútbol", 50));
        inventario.put("SKU002", new Producto("SKU002", "Camiseta de básquetbol", "Básquetbol", 30));
        inventario.put("SKU003", new Producto("SKU003", "Red de voleibol", "Voleibol", 15));
        inventario.put("SKU004", new Producto("SKU004", "Tenis para correr", "Running", 40));
        inventario.put("SKU005", new Producto("SKU005", "Gafas de natación", "Natación", 20));
        inventario.put("SKU006", new Producto("SKU006", "Raqueta de tenis", "Tenis", 25));

        // 2. Consultar un producto en O(1) usando su código SKU
        String clave = "SKU004";
        System.out.println("=== Consulta rápida por SKU ===");
        if (inventario.containsKey(clave)) {
            System.out.println(clave + " --> " + inventario.get(clave));
        } else {
            System.out.println("El producto con código " + clave + " no existe.");
        }

        // 3. Generar un reporte de productos en el orden en que fueron agregados
        System.out.println("\n=== Reporte: Productos en orden de inserción ===");
        for (Map.Entry<String, Producto> p : inventario.entrySet()) {
            System.out.println(p.getKey() + " --> " + p.getValue());
        }

        // 4. Generar un reporte de productos ordenados alfabéticamente por nombre
        System.out.println("\n=== Reporte: Productos ordenados por nombre ===");
        List<Producto> listaOrdenada = new ArrayList<>(inventario.values());
        listaOrdenada.sort(Comparator.comparing(Producto::getNombre));
        for (Producto p : listaOrdenada) {
            System.out.println(p.getSku() + " --> " + p);
        }

        // 5. Actualizar stock cuando se registren ventas o lleguen nuevas unidades
        System.out.println("\n=== Actualización de stock ===");
        String ventaSku = "SKU002"; // Camiseta de básquetbol
        int vendidos = 5;
        if (inventario.containsKey(ventaSku)) {
            Producto prod = inventario.get(ventaSku);
            prod.setStock(prod.getStock() - vendidos); // se restan las ventas
            System.out.println("Venta realizada de " + vendidos + " unidades de " + prod.getNombre());
            System.out.println("Nuevo stock: " + prod.getStock());
        }

        String llegadaSku = "SKU005"; // Gafas de natación
        int nuevasUnidades = 10;
        if (inventario.containsKey(llegadaSku)) {
            Producto prod = inventario.get(llegadaSku);
            prod.setStock(prod.getStock() + nuevasUnidades); // se suman las nuevas unidades
            System.out.println("Ingreso de " + nuevasUnidades + " nuevas unidades de " + prod.getNombre());
            System.out.println("Nuevo stock: " + prod.getStock());
        }

        // Mostrar inventario final
        System.out.println("\n=== Inventario Final ===");
        for (Map.Entry<String, Producto> p : inventario.entrySet()) {
            System.out.println(p.getKey() + " --> " + p.getValue());
        }
    }
}

