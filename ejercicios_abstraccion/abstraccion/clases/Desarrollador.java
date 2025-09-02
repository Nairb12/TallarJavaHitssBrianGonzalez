package ejercicios_abstraccion.abstraccion.clases;

public class Desarrollador extends Empleado{

    public Desarrollador(String nombre, Double salario) {
        super(nombre, salario);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double calcularBono() {
        //Desarrollador recibe el 10% de bono
        return salario * 0.10;
    }
    
}
