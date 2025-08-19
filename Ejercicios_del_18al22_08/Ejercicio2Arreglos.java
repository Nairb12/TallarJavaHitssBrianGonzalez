package Ejercicios_del_18al22_08;

import java.util.Scanner;

public class Ejercicio2Arreglos {
    public static void main(String[] args) {
        // buscar mayo ocurrencia en un arreglo
        Scanner sc = new Scanner(System.in);
        final int N =10;
        int n,max = 0, num = 0;
        int[] datos = new int[N]; // aquí guardamos los 10 números ingresados
        int[] frec = new int[N]; // arreglo de frecuencias (índices 1 a 9)

        // Leer los 10 números con validación
        for (int i = 0; i < 10; i++) {
            do {
                System.out.print("Ingrese número " + (i + 1) + " (1-9): ");
                n = sc.nextInt();
                if (n < 1 || n > 9) {
                    System.out.println("Número inválido, solo se pueden enteros del 1-9");
                }
            } while (n < 1 || n > 9);
            datos[i] = n; // lo guardamos en el array de datos
            frec[n]++; // aumentamos su frecuencia
        }
        System.out.print("\nNumeros ingresados: ");
        // Mostrar los datos ingresados        
        for (int mos : datos) {
            System.out.print(mos+", ");    
        }
        // Buscar el número más repetido
        for (int i = 0; i < 10; i++) {
            if (frec[i] > max) {
                max = frec[i];
                num = i;
            }
        }
        // Mostrar resultados
        System.out.println("\n1. La mayor ocurrencia es: " + max);
        System.out.println("2. El elemento que más se repite es: " + num);
        sc.close();
    }

}