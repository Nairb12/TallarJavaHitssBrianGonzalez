package Ejercicio_SistemaPuntoDeVenta.clases;

public class Cliente {
    private static int contador = 1;
    private int id;
    private String nombre;
    private String tipo; // "Normal" o "VIP"

    public Cliente(String nombre, String tipo) {
        this.id = contador++;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }

    @Override
    public String toString() {
        return "Cliente {id: " + id + 
        ", nombre: " + nombre + 
        ", tipo: " + tipo + " }";
    }
}
