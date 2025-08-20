package Ejercicios_del_11al15_08;
import java.util.Scanner;

public class Ejercicio_4_bucle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("""
                Selecciona una opción:
                1. Actualizar
                2. Eliminar
                3. Crear
                4. Listar
                5. Salir
                """);
            System.out.print("coloca el numero de la opcion: ");
            op = sc.nextInt();
            switch (op) {
                //Actualizar
                case 1->System.out.println("Usuario Actualizando Correctamente");
                //Eliminar
                case 2->System.out.println("Usuario Eliminado Correctamente");
                //Crear
                case 3->System.out.println("Usuario Creado Correctamente");
                //Listar
                case 4->System.out.println("Usuario Listado Correctamente");
                //Salir
                case 5->System.out.println("Saliendo del programa");
                default->System.out.println("Coloca una opcion valida");
            }
            sc.nextLine();
        } while (op != 5);
        sc.close();

    }
}