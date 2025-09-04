package ejercicio_interfaces.clases;

import ejercicio_interfaces.Interfaces.impl.Electronico;

public class TvLcd extends Electronico{
    private int pulgada;

    public TvLcd(int precio, String fabricante, int pulgada) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }

    @Override
    public String toString() {
        return "{ TV LCD " + pulgada 
        + " pulgadas - Fabricante: " + getfabricante() 
        + ", Precio base: $" + getPrecio() 
        + ", Precio venta: $" + getPrecioVenta()+" }";
    }
    
}
