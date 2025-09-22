package Ejercicio_GestionDeTorneo.clases;

import java.util.*;

public class Disciplina {
    private String nombre;
    private Set<Jugador> jugadores;

    public Disciplina(String nombre, Set<Jugador> jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
    }

    public String getNombre() { return nombre; }
    public Set<Jugador> getJugadores() { return jugadores; }

    public boolean registrarJugador(Jugador jugador) {
        return jugadores.add(jugador); // evita duplicados
    }

    public boolean eliminarJugador(Jugador jugador) {
        return jugadores.remove(jugador);
    }

    public boolean buscarJugador(Jugador jugador) {
        return jugadores.contains(jugador);
    }

    public int contarJugadores() {
        return jugadores.size();
    }
}