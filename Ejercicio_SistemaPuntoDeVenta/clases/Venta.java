package Ejercicio_SistemaPuntoDeVenta.clases;

import java.util.List;

public class Venta {
    private static int contador = 1;
    private int id;
    private Cliente cliente;
    private Empleado empleado;
    private List<Producto> productos;
    private double total;

    public Venta(Cliente cliente, Empleado empleado, List<Producto> productos) {
        this.id = contador++;
        this.cliente = cliente;
        this.empleado = empleado;
        this.productos = productos;
    }

    public int getId() { return id; }
    public Cliente getCliente() { return cliente; }
    public Empleado getEmpleado() { return empleado; }
    public List<Producto> getProductos() { return productos; }
    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }

    @Override
    public String toString() {
        return "Venta {id:" + id + 
        ", cliente: " + cliente.getNombre() +
        ", empleado: " + empleado.getNombre() +
        ", total: " + total + " }";
    }
}
