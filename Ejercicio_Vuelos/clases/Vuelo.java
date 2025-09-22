package Ejercicio_Vuelos.clases;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Vuelo {
    private String nombre;
    private String origen;
    private String destino;
    private LocalDateTime fechaLlegada;
    private int numPasajeros;

    public Vuelo(String nombre, String origen, String destino, LocalDateTime fechaLlegada, int numPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechaLlegada = fechaLlegada;
        this.numPasajeros = numPasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public LocalDateTime getFechaLlegada() {
        return fechaLlegada;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    @Override
    public String toString() {
            DateTimeFormatter salidaFormatter = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss yyyy", Locale.ENGLISH);
        return "{ "+nombre + ": " + origen + " -> " + destino +
                ", Aterriza el :" + fechaLlegada.format(salidaFormatter) +
                ", pasajeros: " + numPasajeros+" }";
    }
}