package Ejercicio_GestionDeTorneo.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import Ejercicio_GestionDeTorneo.clases.Disciplina;
import Ejercicio_GestionDeTorneo.clases.Jugador;

public class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Disciplina futbol = new Disciplina("Fútbol", new HashSet<>()); // HashSet
        Disciplina basquet = new Disciplina("Básquetbol", new LinkedHashSet<>()); // LinkedHashSet
        Disciplina volei = new Disciplina("Vóleibol", new TreeSet<>()); // TreeSet
        // Jugadores precargados
        futbol.registrarJugador(new Jugador(1, "Carlos Pérez"));
        futbol.registrarJugador(new Jugador(2, "Luis Hernández"));
        futbol.registrarJugador(new Jugador(3, "Andrés Gómez"));

        basquet.registrarJugador(new Jugador(1, "Juan López"));
        basquet.registrarJugador(new Jugador(2, "Luis Hernández"));
        basquet.registrarJugador(new Jugador(3, "Miguel Torres"));

        volei.registrarJugador(new Jugador(1, "Alejandro Ruiz"));
        volei.registrarJugador(new Jugador(2, "Diego Sánchez"));
        volei.registrarJugador(new Jugador(3, "Pedro Martínez"));

        int opcion;
        do {
            System.out.println("""
                    \n ===========MENU===========
                    0. Ingresar jugador
                    1. Mostrar jugadores por deporte
                    2. Contar jugadores en cada disciplina
                    3. Fusionar equipos
                    4. Ver jugadores en común
                    5. Transferir jugador
                    6. Mostrar jugadores ordenados por nombre
                    7. Mostrar jugadores en orden de inscripción
                    8. Ranking por ID
                    9. Salir
                    """);
            System.out.print("Elige opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 0 -> {
                    System.out.println("\n--- Ingresar nuevo jugador ---");
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    Jugador j = new Jugador(id, nombre);

                    System.out.println("Selecciona disciplina:");
                    System.out.println("1. Fútbol");
                    System.out.println("2. Básquetbol");
                    System.out.println("3. Vóleibol");
                    int dep = sc.nextInt();

                    boolean registrado = false;
                    switch (dep) {
                        case 1 -> registrado = futbol.registrarJugador(j);
                        case 2 -> registrado = basquet.registrarJugador(j);
                        case 3 -> registrado = volei.registrarJugador(j);
                        default -> System.out.println("Disciplina no válida.");
                    }

                    if (registrado) {
                        System.out.println("Jugador registrado con éxito.");
                    } else {
                        System.out.println("El jugador ya está inscrito en esta disciplina.");
                    }
                }
                case 1 -> {
                    System.out.println("Fútbol: " + futbol.getJugadores());
                    System.out.println("Básquetbol: " + basquet.getJugadores());
                    System.out.println("Vóleibol: " + volei.getJugadores());
                }
                case 2 -> {
                    System.out.println("Fútbol: " + futbol.contarJugadores());
                    System.out.println("Básquetbol: " + basquet.contarJugadores());
                    System.out.println("Vóleibol: " + volei.contarJugadores());
                }
                case 3 -> {// fusion
                    List<Jugador> fusion = new ArrayList<>();
                    Set<String> nombresAgregados = new HashSet<>();
                    int nuevoId = 1;
                    // Jugadores de fútbol
                    for (Jugador j : futbol.getJugadores()) {
                        if (nombresAgregados.add(j.getNombre())) { // Solo agrega si el nombre no está repetido
                            fusion.add(new Jugador(nuevoId++, j.getNombre()));
                        }
                    }
                    // Jugadores de básquet
                    for (Jugador j : basquet.getJugadores()) {
                        if (nombresAgregados.add(j.getNombre())) {
                            fusion.add(new Jugador(nuevoId++, j.getNombre()));
                        }
                    }

                    System.out.println("Fusionados Básquetbol y Fútbol (sin nombres duplicados):");
                    fusion.forEach(System.out::println);
                }
                case 4 -> {// Ver jugadores en comun
                    Set<String> nombresFutbol = new HashSet<>();
                    for (Jugador j : futbol.getJugadores()) {
                        nombresFutbol.add(j.getNombre());
                    }

                    Set<String> comunes = new HashSet<>();
                    for (Jugador j : basquet.getJugadores()) {
                        if (nombresFutbol.contains(j.getNombre())) {
                            comunes.add(j.getNombre());
                        }
                    }

                    System.out.println("Jugadores en común entre Fútbol y Básquet:");
                    if (comunes.isEmpty()) {
                        System.out.println("No hay jugadores repetidos en ambos deportes.");
                    } else {
                        comunes.forEach(System.out::println);
                    }
                }
                case 5 -> { // Mueve a jugador por id y lo elimina de la otra
                    System.out.print("Ingrese el ID del jugador a transferir de Básquetbol a Fútbol: ");
                    int idTransferir = sc.nextInt();
                    sc.nextLine(); // limpiar buffer

                    Jugador jugadorEncontrado = null;
                    for (Jugador j : basquet.getJugadores()) {
                        if (j.getId() == idTransferir) {
                            jugadorEncontrado = j;
                            break;
                        }
                    }

                    if (jugadorEncontrado != null) {
                        futbol.registrarJugador(jugadorEncontrado);
                        basquet.getJugadores().remove(jugadorEncontrado);
                        System.out.println("Jugador " + jugadorEncontrado + " transferido a Fútbol.");
                    } else {
                        System.out.println("El jugador con ID " + idTransferir + " no está inscrito en Básquetbol.");
                    }
                }
                case 6 -> {//Ordenados por nombrre
                    Set<Jugador> todosOrdenados = new TreeSet<>(Comparator.comparing(Jugador::getNombre));
                    todosOrdenados.addAll(futbol.getJugadores());
                    todosOrdenados.addAll(basquet.getJugadores());
                    todosOrdenados.addAll(volei.getJugadores());

                    System.out.println("=== Jugadores ordenados por nombre con su disciplina ===");
                    for (Jugador j : todosOrdenados) {
                        String disciplina = "";
                        if (futbol.getJugadores().contains(j))
                            disciplina = "Fútbol";
                        else if (basquet.getJugadores().contains(j))
                            disciplina = "Básquetbol";
                        else if (volei.getJugadores().contains(j))
                            disciplina = "Vóleibol";

                        System.out.println(j.getNombre() + " (" + disciplina + ")");
                    }
                }
                case 7 -> {
                    Set<Jugador> inscripcion = new LinkedHashSet<>();
                    inscripcion.addAll(futbol.getJugadores());
                    inscripcion.addAll(basquet.getJugadores());
                    inscripcion.addAll(volei.getJugadores());
                    System.out.println("En orden de inscripción: " + inscripcion);
                }
                case 8 -> {
                    TreeSet<Jugador> ranking = new TreeSet<>(Comparator.comparingInt(Jugador::getId));
                    ranking.addAll(futbol.getJugadores());
                    ranking.addAll(basquet.getJugadores());
                    ranking.addAll(volei.getJugadores());
                    System.out.println("Ranking por ID: " + ranking);
                }
            }
        } while (opcion != 9);
        sc.close();
    }
}
