package Ejercicio_SistemaPuntoDeVenta.clases;

import java.util.Map;
import java.util.UUID;

public class Venta {
     private String id;
    private Cliente cliente;
    private Empleado empleado;
    private Map<Producto, Integer> productos; // Producto -> cantidad
    private double total;


    public Venta(Cliente cliente, Empleado empleado, Map<Producto, Integer> productos) {
        this.id = UUID.randomUUID().toString();
        this.cliente = cliente;
        this.empleado = empleado;
        this.productos = productos;
        this.total = 0;
    }

    public String getId() { return id; }
    public Cliente getCliente() { return cliente; }
    public Empleado getEmpleado() { return empleado; }
    public Map<Producto, Integer> getProductos() { return productos; }
    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }
}
