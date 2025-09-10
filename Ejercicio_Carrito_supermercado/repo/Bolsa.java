package Ejercicio_Carrito_supermercado.repo;

import java.util.ArrayList;
import java.util.List;

import Ejercicio_Carrito_supermercado.clases.Producto;

public class Bolsa <T extends Producto>{
     private List<T> productos;

    public Bolsa() {
        this.productos = new ArrayList<>();
    }

    public void addProducto(T producto) {
        if (productos.size()>5) {
            throw new ArrayIndexOutOfBoundsException("No puedes agregar mas de 5 productos");
        }
        productos.add(producto);
    }

    public List<T> getProductos() {
        return productos;
    }
}
