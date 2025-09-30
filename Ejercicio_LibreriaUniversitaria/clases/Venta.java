package Ejercicio_LibreriaUniversitaria.clases;

import java.time.LocalDate;
import java.util.UUID;
import java.util.function.Supplier;

public class Venta {
    private String codigo;
    private Cliente cliente;
    private Libro libro;
    private LocalDate fecha;

    // Generador de código
    private static final Supplier<String> generarCodigo = () -> UUID.randomUUID().toString();

    public Venta(Cliente cliente, Libro libro) {
        this.codigo = generarCodigo.get();
        this.cliente = cliente;
        this.libro = libro;
        this.fecha = LocalDate.now(); // fecha automática
    }

    public String getCodigo() { return codigo; }
    public Cliente getCliente() { return cliente; }
    public Libro getLibro() { return libro; }
    public LocalDate getFecha() { return fecha; }

    @Override
    public String toString() {
        return "{ Venta numero " + codigo + 
        " Cliente: " + cliente.getNombre() +
        " Libro: " + libro.getTitulo() +
        " Fecha: " + fecha;
    }
}

