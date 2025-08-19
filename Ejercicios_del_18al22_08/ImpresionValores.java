package Ejercicios_del_18al22_08;

import java.util.Scanner;

public class ImpresionValores {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int N = 10;
    int[] numeros =new int[N];
    System.out.println("=========Ingrese los numeros=======");
    for (int i = 0; i < numeros.length; i++) {
      System.out.println("Numero "+ (i+1)+": ");
      numeros[i]=sc.nextInt();
    }
    for (int i = 0 ; i < 4; i++) {
      System.out.println(numeros[numeros.length-1 -i]);
      System.out.println(numeros[i]);
    }
    sc.close();
   } 
}
