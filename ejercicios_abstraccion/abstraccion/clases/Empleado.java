package ejercicios_abstraccion.abstraccion.clases;
public abstract class Empleado {
    protected String nombre;
    protected Double salario;

    public Empleado(String nombre, Double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    //metodo abstract -> que lo implementa cada tipo de empleado
    public abstract double calcularBono();

    public void mostrarInfo(){
        System.out.println("{Empleado: "+nombre+", Salario: $"+salario+"}");
    }
}
