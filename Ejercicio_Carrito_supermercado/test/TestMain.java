package Ejercicio_Carrito_supermercado.test;

import Ejercicio_Carrito_supermercado.clases.*;
import Ejercicio_Carrito_supermercado.repo.Bolsa;

public class TestMain {
    public static void main(String[] args) {
        try {
            // Bolsa de lacteos
            Bolsa<Lacteos> bolsaLacteos = new Bolsa<>();
            bolsaLacteos.addProducto(new Lacteos("Leche", 20.5, 1, 8));
            bolsaLacteos.addProducto(new Lacteos("Yogurt", 15.0, 1, 5));
            bolsaLacteos.addProducto(new Lacteos("Queso", 40.0, 1, 10));
            bolsaLacteos.addProducto(new Lacteos("Crema", 25.0, 1, 6));
            bolsaLacteos.addProducto(new Lacteos("Mantequilla", 30.0, 1, 4));
            // bolsaLacteos.addProducto(new Lacteos("Mantequilla", 30.0, 1, 4));


            // Bolsa de frutas
            Bolsa<Fruta> bolsaFrutas = new Bolsa<>();
            bolsaFrutas.addProducto(new Fruta("Manzana", 10.0, 0.2, "Rojo"));
            bolsaFrutas.addProducto(new Fruta("Plátano", 8.0, 0.25, "Amarillo"));
            bolsaFrutas.addProducto(new Fruta("Naranja", 12.0, 0.3, "Naranja"));
            bolsaFrutas.addProducto(new Fruta("Pera", 11.0, 0.22, "Verde"));
            bolsaFrutas.addProducto(new Fruta("Uva", 18.0, 0.05, "Morado"));

            // Bolsa de limpieza
            Bolsa<Limpieza> bolsaLimpieza = new Bolsa<>();
            bolsaLimpieza.addProducto(new Limpieza("Jabón", 25.0, "Aloe Vera", 0.5));
            bolsaLimpieza.addProducto(new Limpieza("Cloro", 18.0, "Hipoclorito", 1.0));
            bolsaLimpieza.addProducto(new Limpieza("Shampoo", 30.0, "Hierbas", 0.75));
            bolsaLimpieza.addProducto(new Limpieza("Detergente", 22.0, "Multiusos", 1.5));
            bolsaLimpieza.addProducto(new Limpieza("Limpiador", 28.0, "Pino", 1.2));

            // Bolsa de no perecibles
            Bolsa<NoPerecible> bolsaNoPerecibles = new Bolsa<>();
            bolsaNoPerecibles.addProducto(new NoPerecible("Arroz", 35.0, 1000, 3500));
            bolsaNoPerecibles.addProducto(new NoPerecible("Frijoles", 40.0, 900, 3000));
            bolsaNoPerecibles.addProducto(new NoPerecible("Lentejas", 28.0, 850, 2900));
            bolsaNoPerecibles.addProducto(new NoPerecible("Harina", 32.0, 1000, 3600));
            bolsaNoPerecibles.addProducto(new NoPerecible("Azúcar", 27.0, 950, 3800));

            // Mostrar contenidos
            System.out.println("=== Bolsa de Lacteos ===");
            for (Lacteos lac : bolsaLacteos.getProductos()) {
                System.out.println(lac);
            }

            System.out.println("\n=== Bolsa de Frutas ===");
            for (Fruta fru : bolsaFrutas.getProductos()) {
                System.out.println(fru);
            }

            System.out.println("\n=== Bolsa de Limpieza ===");
            for (Limpieza lim : bolsaLimpieza.getProductos()) {
                System.out.println(lim);
            }

            System.out.println("\n=== Bolsa de No Perecibles ===");
            for (NoPerecible per : bolsaNoPerecibles.getProductos()) {
                System.out.println(per);
            }
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
