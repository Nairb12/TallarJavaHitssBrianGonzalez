package Ejercicio_SistemaRHyEvaluacion.test;

import java.util.List;

import Ejercicio_SistemaRHyEvaluacion.models.Empleados;
import Ejercicio_SistemaRHyEvaluacion.models.Evaluacion;
import Ejercicio_SistemaRHyEvaluacion.utils.ServiceRH;

public class TestRH {
    /*
     * Requisitos empresariales  
        1. Listar todos los empleados de un departamento específico (ej: "IT"), ordenados alfabéticamente. 
        2. Calcular el salario promedio por departamento. 
        3. Obtener el empleado con mayor salario en toda la empresa. 
        4. Listar todos los empleados con más de 5 años de experiencia y salario mayor a 50,000. 
        5. Obtener el top 3 de empleados con mejor puntaje en la última evaluación (último año). 
        6. Contar cuántos empleados tienen al menos una evaluación superior a 90 puntos. 
        7. Generar un ranking de promedio de puntajes por empleado.
     */
    public static void main(String[] args) {
     ServiceRH service = new ServiceRH();

        // Evaluaciones
        List<Evaluacion> eva1 = List.of(new Evaluacion(2023, 88), new Evaluacion(2024, 92));
        List<Evaluacion> eva2 = List.of(new Evaluacion(2023, 95), new Evaluacion(2024, 98));
        List<Evaluacion> eva3 = List.of(new Evaluacion(2022, 70), new Evaluacion(2024, 75));
        List<Evaluacion> eva4 = List.of(new Evaluacion(2023, 85), new Evaluacion(2024, 89));
        List<Evaluacion> eva5 = List.of(new Evaluacion(2023, 90), new Evaluacion(2024, 94));

        // Empleados
        List<Empleados> empleados = List.of(
            new Empleados(1, "Ana", "IT", 60000, 6, eva1),
            new Empleados(2, "Luis", "IT", 45000, 3, eva3),
            new Empleados(3, "Pedro", "Ventas", 80000, 7, eva2),
            new Empleados(4, "Marta", "Recursos Humanos", 55000, 8, eva4),
            new Empleados(5, "Eloy", "IT", 70000, 10, eva5)
        );

        // Ejecutar reportes
        
        service.listarPorDepartamento(empleados, "IT");
        service.salarioPromedioPorDepto(empleados);
        service.empleadoMayorSalario(empleados);
        service.empleadosExperienciaAlta(empleados);
        service.top3UltimaEvaluacion(empleados);
        service.contarEvaluacionesAltas(empleados);
        service.rankingPromedioEvaluaciones(empleados);
       
    }
}

