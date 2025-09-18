package Ejercicio_Vuelos.test;

import Ejercicio_Vuelos.clases.Vuelo;
import Ejercicio_Vuelos.clases.lecturaArchivo;

import java.util.*;

public class TestMain {
    public static void main(String[] args) {
        // 1. Leer vuelos desde el archivo CSV
        List<Vuelo> vuelos = lecturaArchivo.leerCSV("Ejercicio_Vuelos/vuelos.csv");

        // 2. Ordenar por llegada ascendente
        vuelos.sort(Comparator.comparing(Vuelo::getFechaLlegada));

        System.out.println("=== Listado de vuelos ordenados por llegada ASC ===");
        vuelos.forEach(System.out::println);

        // 3. Último vuelo en llegar
        Vuelo ultimo = vuelos.get(vuelos.size()-1);
        System.out.println("\nÚltimo vuelo en llegar: " + ultimo);

        // 4. Vuelo con menor número de pasajeros
        Vuelo menor = Collections.min(vuelos, Comparator.comparingInt(Vuelo::getNumPasajeros));
        System.out.println("\nVuelo con menor número de pasajeros: " + menor);
    }
}
