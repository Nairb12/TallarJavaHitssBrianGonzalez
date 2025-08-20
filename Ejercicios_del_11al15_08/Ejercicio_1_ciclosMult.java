package Ejercicios_del_11al15_08;

import java.util.Scanner;

public class Ejercicio_1_ciclosMult {
    public static void main(String[] args) {
        //ejercicio bucle for *multiplicar 2 numeros positivos o negativos sin el simbolo*
        //ejercicio, pedir 2 numeros y multiplicarlos sin usar *
        //obedenciendo las leyes de los simbolos
      Scanner sc = new Scanner(System.in);
        int num1, num2, resul = 0;
        boolean neg = false;
        System.out.println("Ingresa el primer numero");
        num1 = sc.nextInt();
        System.out.println("Ingresa el segundo numero");
        num2 = sc.nextInt();
        //convertimos el numero a positivo y el booleano a verdadero
        if (num1 < 0) { num1 = -num1; neg = !neg; }
        if (num2 < 0) { num2 = -num2; neg = !neg; }
        for (int i = 0; i < num2; i++) resul += num1;
        System.out.println(neg ? -resul : resul);
        sc.close();
    }
}
