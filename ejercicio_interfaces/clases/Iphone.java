package ejercicio_interfaces.clases;

import ejercicio_interfaces.Interfaces.impl.Electronico;

public class Iphone extends Electronico{
    private String modelo;
    private String color;
    public Iphone(int precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public String toString() {
        return "{ iPhone " + modelo + " (" + color 
        + ") - Fabricante: " + getfabricante() 
        + ", Precio base: $" + getPrecio() 
        + ", Precio venta: $" + getPrecioVenta()+" }";
    }
    
    
    
}
