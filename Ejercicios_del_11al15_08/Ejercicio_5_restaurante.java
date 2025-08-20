package Ejercicios_del_11al15_08;
import java.util.Scanner;
public class Ejercicio_5_restaurante {
    public static void main(String[] args) {
        /*
         * Un restaurante necesita un programa que permita al cajero: Mostrar un menú de
         * opciones:
         * 1. Registrar un pedido.
         * 2. Mostrar el total de ventas.
         * 3. Salir del sistema.
         * Cada pedido se registra ingresando el precio.
         * El programa debe seguir mostrando el menú hasta que el cajero elija Salir.
         * Validar que el precio sea positivo antes de sumarlo a las ventas
         */
        Scanner sc = new Scanner(System.in);
        int op, numeroVentas = 0;
        double totalVentas = 0, precioPedido;
        do {
            System.out.print("""
                    Ingrese el numero de alguna opcion
                        1. Registrar un pedido
                        2. Mostrar el total de ventas
                        3. Salir del sistema
                    : """);
            op = sc.nextInt();
            switch (op) {
                // Registrar pedido
                case 1 -> {
                    System.out.print("Ingrese el precio del pedido: ");
                    precioPedido = sc.nextDouble();
                    if (precioPedido > 0) {
                        totalVentas += precioPedido;
                        System.out.println("Pedido registrado con éxito");
                        numeroVentas++;
                    } else {
                        System.out.println("Error: El precio debe ser positivo, vuelva a realizarlo");
                    }
                }
                // Mostrar total de ventas
                case 2 -> System.out.println(
                        "Numero de ventas realizadas: " + numeroVentas + "\nCantitad total de ventas: " + totalVentas);
                // Salir del sistema
                case 3 -> System.out.println("Saliendo del programa");
                default -> System.out.println("Coloca una opcion valida");
            }
            System.out.println("*******************************************");
            sc.nextLine();
        } while (op != 3);
        sc.close();
    }
}
