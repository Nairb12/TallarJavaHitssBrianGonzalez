package Ejercicio_Carrito_supermercado.clases;

public class Producto{
    protected String nombre;
    protected double precio;
    
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }    
    
}
