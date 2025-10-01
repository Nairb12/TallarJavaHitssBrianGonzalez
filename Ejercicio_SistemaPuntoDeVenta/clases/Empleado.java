package Ejercicio_SistemaPuntoDeVenta.clases;

public class Empleado {
    private static int contador = 1;
    private int id;
    private String nombre;
    private String puesto;

    public Empleado(String nombre, String puesto) {
        this.id = contador++;
        this.nombre = nombre;
        this.puesto = puesto;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getPuesto() { return puesto; }

    @Override
    public String toString() {
        return "Empleado {id: " + id + 
        ", nombre: " + nombre + 
        ", puesto: " + puesto + " }";
    }
}
