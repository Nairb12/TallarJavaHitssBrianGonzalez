package ejercicio_interfaces.Interfaces.impl;

import ejercicio_interfaces.Interfaces.IElectronico;

public abstract class Electronico extends Producto implements IElectronico {
    private String fabricante; 
    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    @Override
    public double getPrecioVenta() {
        // TODO Auto-generated method stub
        return getPrecio()*1.15;//ganancia de 15%
    }

    @Override
    public String getfabricante(){
        return " El fabricante es: "+fabricante;
    }
}
