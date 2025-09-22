package Ejercicios_del_18al22_08;

import java.util.Scanner;

public class Ejercicio3Arreglos {
    public static void main(String[] args) {
        // matriz de n para arrojar una x con x
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("introduce los parametros de la matriz");
        n = sc.nextInt();

        if (n == 0) {
            System.out.println("ERROR");                    
            sc.close();
            return;
        }
        String[] matriz = new String[n];
        for (int i = 0; i < n; i++) {
            String fila = "";
            for (int j = 0; j < n; j++) {
                if (i == j || j == n - 1 - i) {
                    fila += "X";
                } else {
                    fila += "_";
                }
            }
            matriz[i] = fila;
        }
        for (String equis : matriz) {
            System.out.println(equis);
        }
        sc.close();
    }
}
