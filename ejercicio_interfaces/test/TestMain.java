package ejercicio_interfaces.test;

import java.time.LocalDate;

import ejercicio_interfaces.Interfaces.IProducto;
import ejercicio_interfaces.Interfaces.impl.Libro;
import ejercicio_interfaces.clases.*;

public class TestMain {
    public static void main(String[] args) {
        IProducto[] productos = new IProducto[5];

        productos[0] = new Iphone(15000, "Apple", "Negro", "14 Pro Max");
        productos[1] = new TvLcd(8000, "Samsung", 55);
        productos[2] = new Libro(500, LocalDate.of(1967, 5, 30),"Gabriel García Márquez", "Cien Años de Soledad", "Sudamericana");
        productos[3] = new Comics(300,LocalDate.of(1962, 8, 10),"Stan Lee", "Spider-Man", "Marvel", "Peter Parker");
        productos[4] = new Iphone(12000, "Apple", "Blanco", "13 Mini");

        for (IProducto p : productos) {
            System.out.println("====================================");
            System.out.println(p.toString());
        }
    }
}
