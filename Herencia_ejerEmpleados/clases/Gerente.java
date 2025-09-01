package Herencia_ejerEmpleados.clases;

public class Gerente extends Empleado {
    private double presupuesto;

    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion,
            double remuneracion, int empleadoId, double presupuesto) {
        super(nombre, apellido, numeroFiscal, direccion, remuneracion, empleadoId);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public void mostrarInfo() {
        // TODO Auto-generated method stub
        super.mostrarInfo();
        System.out.println("| Presupuesto: " + presupuesto);
    }

}
