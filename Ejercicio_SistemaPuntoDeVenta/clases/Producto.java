package Ejercicio_SistemaPuntoDeVenta.clases;

import java.util.UUID;
import java.util.function.Supplier;

public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int stock;
    private static final Supplier<String> generarId = () -> UUID.randomUUID().toString();
    

    public Producto(String nombre, double precio, int stock) {
        this.id = generarId.get();
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    @Override
    public String toString() {
        return "Producto {id:" + id + 
        ", nombre: " + nombre + 
        ", precio: $" + precio + 
        ", stock: " + stock + "}";
    }
}
