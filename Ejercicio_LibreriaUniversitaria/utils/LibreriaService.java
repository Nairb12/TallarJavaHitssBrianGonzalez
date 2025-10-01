package Ejercicio_LibreriaUniversitaria.utils;

import Ejercicio_LibreriaUniversitaria.clases.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class LibreriaService {
    private List<Libro> libros = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<Venta> ventas = new ArrayList<>();

    // Validaciones con Predicate
    private Predicate<Libro> validarLibro = l -> l.getAnioPublicacion() > 1900 && l.getPrecio() > 0;
    private Predicate<Cliente> validarCliente = c -> c.getEdad() >= 18;

    // Transformar objetos con Function
    private Function<Libro, String> resumenLibro = l -> "Resumen: " + l.getTitulo() + " de " + l.getAutor() +
            " (" + l.getAnioPublicacion() + ") $" + l.getPrecio();

    private Function<Venta, String> generarFactura = v -> "Factura {" + v.getCodigo() + "}\nCliente: "
            + v.getCliente().getNombre() +
            "\nLibro: " + v.getLibro().getTitulo() +
            "\nPrecio: $" + v.getLibro().getPrecio() +
            "\nFecha: " + v.getFecha();

    // Acciones con Consumer
    private Consumer<String> notificar = msg -> System.out.println("Notificación: " + msg);
    private Consumer<String> imprimir = msg -> System.out.println(msg);

    // Métodos de gestión
    public void agregarLibro(Libro libro) {
        if (validarLibro.test(libro)) {
            libros.add(libro);
            notificar.accept("Libro agregado: " + libro.getTitulo());
        }
    }

    public void agregarCliente(Cliente cliente) {
        if (validarCliente.test(cliente)) {
            clientes.add(cliente);
            notificar.accept("Cliente agregado: " + cliente.getNombre());
        }
    }

    public void registrarVenta(Cliente cliente, Libro libro) {
        Venta venta = new Venta(cliente, libro);
        ventas.add(venta);
        cliente.agregarCompra(venta);
        notificar.accept("Venta registrada: " + venta);
    }

    // Cálculos
    public double promedioPrecios() {
        if (libros.isEmpty())
            return 0;
        double suma = 0;
        for (Libro l : libros) {
            suma += l.getPrecio();
        }
        return suma / libros.size();
    }

    public Libro libroMasCaro() {
        if (libros.isEmpty())
            return null;
        Libro mayor = libros.get(0);
        for (Libro l : libros) {
            if (l.getPrecio() > mayor.getPrecio()) {
                mayor = l;
            }
        }
        return mayor;
    }

    public Libro libroMasBarato() {
        if (libros.isEmpty())
            return null;
        Libro menor = libros.get(0);
        for (Libro l : libros) {
            if (l.getPrecio() < menor.getPrecio()) {
                menor = l;
            }
        }
        return menor;
    }

    public double aplicarDescuento(Libro libro, double porcentaje) {
        return libro.getPrecio() - (libro.getPrecio() * (porcentaje / 100));
    }

    // Reportes
    public void imprimirResumenLibro(Libro libro) {
        imprimir.accept(resumenLibro.apply(libro));
    }

    public void imprimirFactura(Venta venta) {
        imprimir.accept(generarFactura.apply(venta));
    }
}
