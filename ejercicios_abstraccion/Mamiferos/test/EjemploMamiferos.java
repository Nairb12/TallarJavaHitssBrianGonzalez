package ejercicios_abstraccion.Mamiferos.test;

import ejercicios_abstraccion.Mamiferos.clases.*;

public class EjemploMamiferos {
    public static void main(String[] args) {
        // Crear arreglo de mamíferos
        Mamifero[] mamiferos = new Mamifero[6];
        
       // Crear instancias de diferentes animales (con el orden corregido de parámetros)
        Mamifero leon = new Leon("Sabana Africana", 1.2, 2.2, 190.0
        , "Panthera leo", 25,50,4,50.0);
        Mamifero tigre = new Tigre("Selva Asiática", 1.1, 2.5, 220.0, "Panthera tigris",15.0,50,"Bengala" );
        Mamifero guepardo = new Guepardo("Llanuras Africanas", 0.9, 1.5, 72.0, "Acinonyx jubatus",15.5,50);
        Mamifero lobo = new Lobo("Bosques de Canadá", 0.8, 1.4, 50, "Canis lupus",
         "Gris", 9.0, 6, "Canadiense");
        Mamifero perroSalvaje = new Perro("Sabanas Africanas", 0.75, 1.1, 40,
         "Lycaon pictus", "Manchado",10.0,50);
        Mamifero otroLeon = new Leon("Serengeti", 1.3, 2.3, 200.0,
         "Panthera leo", 24, 85,4,50.0);

        // Asignar instancias al arreglo
        mamiferos[0] = leon;
        mamiferos[1] = tigre;
        mamiferos[2] = guepardo;
        mamiferos[3] = lobo;
        mamiferos[4] = perroSalvaje;
        mamiferos[5] = otroLeon;

        // Recorrer el arreglo y mostrar datos
        for (Mamifero animal : mamiferos) {
            System.out.println("======================================");
            System.out.println(animal.toString());
            System.out.println(animal.comer());
            System.out.println(animal.dormir());
            System.out.println(animal.correr());
            System.out.println(animal.comunicarse());
            System.out.println();
        }
    }
}
