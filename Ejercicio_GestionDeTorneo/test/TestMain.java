package Ejercicio_GestionDeTorneo.test;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import Ejercicio_GestionDeTorneo.clases.Disciplina;
import Ejercicio_GestionDeTorneo.clases.Jugador;

public class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Disciplina futbol = new Disciplina("Fútbol", new HashSet<>());          // HashSet
        Disciplina basquet = new Disciplina("Básquetbol", new LinkedHashSet<>()); // LinkedHashSet
        Disciplina volei = new Disciplina("Vóleibol", new TreeSet<>());         // TreeSet

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

            switch(opcion) {
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
                    switch(dep) {
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
                case 3 -> {
                    Set<Jugador> fusion = new HashSet<>(futbol.getJugadores());
                    fusion.addAll(basquet.getJugadores());
                    System.out.println("Fusionados: " + fusion);
                }
                case 4 -> {
                    Set<Jugador> comun = new HashSet<>(futbol.getJugadores());
                    comun.retainAll(basquet.getJugadores());
                    System.out.println("En común: " + comun);
                }
                case 5 -> {
                    System.out.print("ID jugador a transferir: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre del jugador: ");
                    String nombre = sc.nextLine();
                    Jugador transfer = new Jugador(id, nombre);

                    if (basquet.eliminarJugador(transfer)) {
                        futbol.registrarJugador(transfer);
                        System.out.println("Jugador transferido de Básquetbol a Fútbol.");
                    } else {
                        System.out.println("Jugador no encontrado en Básquetbol.");
                    }
                }
                case 6 -> {
                    Set<Jugador> todos = new TreeSet<>();
                    todos.addAll(futbol.getJugadores());
                    todos.addAll(basquet.getJugadores());
                    todos.addAll(volei.getJugadores());
                    System.out.println("Todos por nombre: " + todos);
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
        } while(opcion != 9);
        sc.close();
    }
}
