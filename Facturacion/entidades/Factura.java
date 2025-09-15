package Facturacion.entidades;

import java.util.ArrayList;
import java.util.List;

import Facturacion.genericos.Identificable;

public class Factura implements Identificable<Integer>{
    private Integer id;
    private Cliente cliente;
    private List<Producto> productos;
    public Factura(Integer id, Cliente cliente, List<Producto> productos) {
        this.id = id;
        this.cliente = cliente;
        this.productos = new ArrayList<>(productos);
    }
    @Override
    public Integer getId() {
        return id;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public List<Producto> getProductos() {
        return productos;
    }

    //Metodo dinamico para agregar un producto a mi lista de productos
    public void agregarElemento(Producto producto){
        productos.add(producto);
        System.out.println("Producto agregado: "+producto);
    }
    //Eliminar un producto de la lista de prodcutos
    public boolean eliminarProducto(int id){
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId() == id) {
                Producto producto = productos.remove(i);
                System.out.println("Producto eliminado: "+producto);
                return true;
            }
        }
        System.out.println("No se encontro el producto con ID: "+id);
        return false;
    }
    public double calcularTota(){
        double total=0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }
    //Generar el ticket de la factura
    public String generarReporte(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n===========FACTURA #").append(id).append("===============\n");
        sb.append("Cliente: ").append(cliente.getNombre()).append("\n");
        sb.append("-------------------------------------\n");
        for(Producto producto : productos){
            sb.append(producto.getDescripcion()).append("\t\t$").append(producto.getPrecio()).append("\n");
        }
        sb.append("-------------------------------------\n");
        sb.append("Total: $").append(calcularTota()).append("\n");
        sb.append("-------------------------------------\n");
        return sb.toString();
        
    }

    @Override
    public String toString() {
        return "Factura {id: " + id 
        + ", cliente: " + cliente 
        + ", productos:" + productos 
        + ", Total:"+ calcularTota() + "}";
    }
}
