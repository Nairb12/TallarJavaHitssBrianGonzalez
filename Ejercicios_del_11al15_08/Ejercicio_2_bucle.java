package Ejercicios_del_11al15_08;

import java.util.Scanner;

public class Ejercicio_2_bucle {
//Ejercicio de encontrar el numero menor a partir de 10 numeros minimos
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // peticion de datos
        System.out.print("Cantidad de números a comparar (mínimo 10): ");
        int cantidad = entrada.nextInt();

        // Validar que sea mínimo 10 numeros
        if (cantidad < 10) {
            System.out.println("Debe ingresar al menos 10 números.");
        } else {
            //pedimos el primer numero para hacer comparacion
            System.out.print("Número: ");
            int menor = entrada.nextInt();
            //realizamos el ciclo para la comparacion
            for (int i = 1; i < cantidad; i++) {
                //volvemos a pedir el numero 
                System.out.print("Número: ");
                int num = entrada.nextInt();
                //se realiza la comparacion para saber cual es mas chico, si es verdad, guarda el valor 
                if (num < menor)menor = num;
            }
            //Compara si es menor o mayor que 10 e imprime el resultado
            System.out.println("El número menor es: " + menor + (menor < 10 ? " y es menor que 10" 
                                                                            : " y es igual o mayor que 10"));
        }
        entrada.close();
    }
}