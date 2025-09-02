package ejercicios_abstraccion.abstraccion.clases;
public class Gerente extends Empleado{

    public Gerente(String nombre, Double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularBono() {
        // un gerente recibe el 20% de bono
        return salario* 0.20;
    }
    
    
}
