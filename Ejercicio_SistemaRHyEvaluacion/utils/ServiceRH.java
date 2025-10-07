package Ejercicio_SistemaRHyEvaluacion.utils;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Ejercicio_SistemaRHyEvaluacion.models.Empleados;
import Ejercicio_SistemaRHyEvaluacion.models.Evaluacion;

public class ServiceRH {
    /*
     * Requisitos empresariales  
     */
    // 1. Listar todos los empleados de un departamento específico (ej: "IT"), ordenados alfabéticamente. 
    public void listarPorDepartamento(List<Empleados> empleados, String depto) {
        System.out.println("=== Empleados del departamento: " + depto + " ===");
        empleados.stream()
            .filter(e -> e.getDepartamento().equalsIgnoreCase(depto))
            .sorted(Comparator.comparing(Empleados::getNombre))
            .forEach(System.out::println);
    }

    // 2. Calcular salario promedio por departamento
    public void salarioPromedioPorDepto(List<Empleados> empleados) {
        System.out.println("\n=== Salario promedio por departamento ===");
        empleados.stream()
            .collect(Collectors.groupingBy(
                Empleados::getDepartamento,
                Collectors.averagingDouble(Empleados::getSalario)))
            .forEach((d, p) -> System.out.println(d + " -> $" + String.format("%.2f", p)));
    }

    // 3. Obtener el empleado con mayor salario en toda la empresa. 
    public void empleadoMayorSalario(List<Empleados> empleados) {
        System.out.println("\n=== Empleado con mayor salario ===");
        empleados.stream()
            .max(Comparator.comparing(Empleados::getSalario))
            .ifPresent(System.out::println);
    }

    // 4. Listar todos los empleados con más de 5 años de experiencia y salario mayor a 50,000. 
    public void empleadosExperienciaAlta(List<Empleados> empleados) {
        System.out.println("\n=== Empleados con >5 años de experiencia y salario > 50,000 ===");
        empleados.stream()
            .filter(e -> e.getExperiencia() > 5 && e.getSalario() > 50000)
            .forEach(System.out::println);
    }

    // 5. Obtener el top 3 de empleados con mejor puntaje en la última evaluación (último año). 
    public void top3UltimaEvaluacion(List<Empleados> empleados) {
        System.out.println("\n=== Top 3 empleados con mejor puntaje (último año) ===");
        empleados.stream()
            .filter(e -> !e.getEvaluaciones().isEmpty())
            .sorted((a, b) -> {
                int puntA = a.getEvaluaciones().get(a.getEvaluaciones().size() - 1).getPuntaje();
                int puntB = b.getEvaluaciones().get(b.getEvaluaciones().size() - 1).getPuntaje();
                return Integer.compare(puntB, puntA);
            })
            .limit(3)
            .forEach(e -> {
                int puntaje = e.getEvaluaciones().get(e.getEvaluaciones().size() - 1).getPuntaje();
                System.out.println(e.getNombre() + " -> " + puntaje);
            });
    }

    // 6. Contar cuántos empleados tienen al menos una evaluación superior a 90 puntos. 
    public void contarEvaluacionesAltas(List<Empleados> empleados) {
        List<Empleados> destacados = empleados.stream()
                .filter(e -> e.getEvaluaciones().stream()
                        .anyMatch(ev -> ev.getPuntaje() > 90))
                .toList();

        long cantidad = destacados.size();

        System.out.println("Total de empleados con evaluaciones > 90: " + cantidad);
        System.out.println("=== Empleados destacados ===");
        destacados.forEach(e -> System.out.println(e.getNombre() +" - "+e.getDepartamento()));

    }

    // 7. Generar un ranking de promedio de puntajes por empleado.
    public void rankingPromedioEvaluaciones(List<Empleados> empleados) {
        System.out.println("\n=== Ranking de promedio de evaluaciones ===");
        empleados.stream()
            .collect(Collectors.toMap(
                Empleados::getNombre,
                e -> e.getEvaluaciones().stream()
                      .mapToInt(Evaluacion::getPuntaje)
                      .average()
                      .orElse(0)
            ))
            .entrySet().stream()
            .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
            .forEach(e -> System.out.println(e.getKey() + " -> " + String.format("%.2f", e.getValue())));
    }
}
