package Ejercicio_LibreriaUniversitaria.clases;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class Cliente {
    private String id;
    private String nombre;
    private int edad;
    private List<Venta> historialCompras;


    // Generador de ID con lambda
    private static final Supplier<String> generarId = () -> UUID.randomUUID().toString();

    public Cliente(String nombre, int edad) {
        if (edad < 18) {
            throw new IllegalArgumentException("El cliente debe ser mayor de edad");
        }
        this.id = generarId.get();
        this.nombre = nombre;
        this.edad = edad;
        this.historialCompras = new ArrayList<>();
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public List<Venta> getHistorialCompras() { return historialCompras; }

    public void agregarCompra(Venta venta) {
        historialCompras.add(venta);
    }

 @Override
    public String toString() {
        return "{ "+id + " - " +
        "Nombre: "+nombre + 
        "Edad: " + edad + " años, " + 
        historialCompras.size() + " compras }";
    }
}

