package Ejercicio_LambdaMap.test;

import java.util.HashMap;
import java.util.Map;

import Ejercicio_LambdaMap.Interfaces.Contador;

public class TestMain {
    /*
        Para la tarea se pide como requerimiento escribir una expresión lambda que cuenta la
        cantidad de veces que se repiten las palabras de una frase y devuelva la más repetida, según lo siguiente:
        --
        La expresión lambda debe recibir por argumento una frase u oración y devolver un objeto Map que contenga 
        la palabra más repetida de la frase como llave y la cantidad de veces que se repite como valor.

        Tiene que devolver un objeto Map de java
        Mostras el resultado en consola iterando el map o bien obteniendo el primer elemento con get().
     */
    public static void main(String[] args) {
        // Lambda que encuentra la palabra más repetida y devuelve un Map
        Contador<String, Map<String, Integer>> masRepetida = frase -> {
            // Normalizar texto: quitar comas, puntos y pasar a minúsculas
            frase = frase.toLowerCase().replaceAll("[^a-záéíóúüñ ]", "");
            String[] palabras = frase.split("\\s+");
            Map<String, Integer> conteo = new HashMap<>();

            // Contar ocurrencias con un for
            for (String p : palabras) {
                conteo.put(p, conteo.getOrDefault(p, 0) + 1);
            }

            // Buscar la palabra más repetida
            String palabraMax = null;
            int max = 0;
            for (Map.Entry<String, Integer> entry : conteo.entrySet()) {
                if (entry.getValue() > max) {
                    palabraMax = entry.getKey();
                    max = entry.getValue();
                }
            }

            // Retornar un Map solo con la palabra más repetida
            return Map.of(palabraMax, max);
        };

        // Ejemplo
        // String frase = "fútbol baloncesto tenis fútbol fútbol tenis baloncesto fútbol running tenis";
        String frase = "taca taca taca la petaca, taca taca, la petaca";
        Map<String, Integer> resultado = masRepetida.contar(frase);

        System.out.println(frase);
        // Mostrar el resultado
        resultado.forEach((palabra, veces) -> System.out.println("La palabra más repetida es: " + palabra + " (" + veces + " veces)"));

    }
}
