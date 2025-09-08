package ejercicio_excepciones.test;

import ejercicio_excepciones.excepciones.*;

public class TestMainExcept {
    public static void main(String[] args) {
          // Arreglo de tamaño fijo (3 alumnos)
        Alumno[] alumnos = new Alumno[3];

        try {
            // Caso normal (válido)
            alumnos[0] = new Alumno("Ana", 20);

            alumnos[1] = new Alumno("Luis", 25);

            //  Caso edad menor a 18 → EdadInvalidaException
            alumnos[2] = new Alumno("Marta", 15);

            //  Caso exceso de alumnos → ArrayIndexOutOfBoundsException
            // alumnos[3] = new Alumno("Extra", 22); // fuera de rango

        } catch (EdadInvalidaException e) {//personalizada para menores de 18
            System.out.println("Error (EdadInvalidaException): " + e.getMessage());
        } catch (IllegalArgumentException e) {//argumento invalido por ser edad menor a 0
            System.out.println("Error (IllegalArgumentException): " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {//error por querer almacenarr mas de lo que declarre en array
            System.out.println("(ArrayIndexOutOfBoundsException): " + e.getMessage());
        }

        // Mostrar los alumnos válidos registrados
        System.out.println("\n=== Lista de alumnos ===");
        for (Alumno a : alumnos) {
            System.out.println(a);
        }
    }
}
