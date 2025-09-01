package Herencia_ejerEmpleados.clases;

public class Empleado extends Persona {
    private double remuneracion;
    private int empleadoId;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion,
            double remuneracion, int empleadoId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void aumentarRemuneracion(int porcentaje) {
        this.remuneracion += remuneracion * porcentaje / 100.0;
    }

    @Override
    public void mostrarInfo() {
         super.mostrarInfo();
         System.out.println("| EmpleadoID: " + empleadoId +", Remuneración: " + remuneracion);
    }
}
