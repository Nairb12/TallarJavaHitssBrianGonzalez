package ejercicio_interfaces.Interfaces.impl;

import ejercicio_interfaces.Interfaces.IProducto;

public abstract class Producto implements IProducto{
    private int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public abstract double getPrecioVenta();

    @Override
    public int getPrecio(){
        return precio;
    }
    
}
