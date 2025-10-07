package Ejercicio_SistemaRHyEvaluacion.models;

import java.util.List;

public class Empleados {
    private int id;
    private String nombre;
    private String departamento;
    private double salario;
    private int experiencia; 
    private List<Evaluacion> evaluaciones;

    public Empleados(int id, String nombre, String departamento, double salario, int experiencia, List<Evaluacion> evaluaciones) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
        this.experiencia = experiencia;
        this.evaluaciones = evaluaciones;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDepartamento() { return departamento; }
    public double getSalario() { return salario; }
    public int getExperiencia() { return experiencia; }
    public List<Evaluacion> getEvaluaciones() { return evaluaciones; }

    @Override
    public String toString() {
        return nombre + " (" + departamento + ") - $" + salario + " - " + experiencia + " años exp.";
    }
}
