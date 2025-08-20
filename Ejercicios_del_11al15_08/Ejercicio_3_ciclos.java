package Ejercicios_del_11al15_08;
import java.util.Scanner;

public class Ejercicio_3_ciclos {
    public static void main(String[] args) {
        // ejercico de notas finales
        // declaracion de variables
        Scanner entrada = new Scanner(System.in);
        double sumaMayores = 0, sumaMenores = 0, sumaTotal = 0;
        int contMayores = 0, contMenores = 0, contIguales1 = 0;
        // ciclo para la operacion y colocar las 20 notas
        for (int i = 1; i <= 20; i++) {
            // peticion de notas
            System.out.print("Ingrese la Nota numero: " + i + ": ");
            double nota = entrada.nextDouble();
            // si la nota menor que 1 o mayor que 10 finaliza el programa
            if (nota < 0 || nota > 10) {
                System.out.println("Error: nota erronea,rango de notas 1-10 programa finalizado.");
                return;
            }
            // se van sumando todas las notas, para el promedio general
            sumaTotal += nota;
            // si es mayor que 6 o igual lo guarda
            if (nota >= 6) {
                sumaMayores += nota;
                contMayores++;
            } else { // sino tambien lo guarda en otro
                sumaMenores += nota;
                contMenores++;
            }
            // rango para contar las notas con valores de 1
            if (nota >= 1 && nota < 2)
                contIguales1++;
        }
        // printf es para numeros manejar una salida especifica
        // el %f es para numeros flotantes y el %n es para el salto de linea
        // el .2 en %.2f indica que se deben mostrar 2 decimales.
        System.out.printf("Promedios de mayores o iguales a 6: %.2f%n",
                         (contMayores > 0 ? sumaMayores / contMayores : 0));
        System.out.printf("Promedio menores a 6: %.2f%n", 
                         (contMenores > 0 ? sumaMenores / contMenores : 0));
        System.out.println("Cantidad de notas iguales a 1: " + contIguales1);
        System.out.printf("Promedio total: %.2f%n", (sumaTotal / 20));
        entrada.close();
    }
}