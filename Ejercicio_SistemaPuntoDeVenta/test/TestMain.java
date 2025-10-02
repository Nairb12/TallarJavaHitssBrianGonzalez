package Ejercicio_SistemaPuntoDeVenta.test;

import java.util.Arrays;
import java.util.List;

import Ejercicio_SistemaPuntoDeVenta.clases.*;
import Ejercicio_SistemaPuntoDeVenta.utils.SupermercadoService;

public class TestMain {
    public static void main(String[] args) {
        SupermercadoService service = new SupermercadoService();

        // Crear objetos
        Producto p1 = new Producto("Leche", 25.0, 10);
        Producto p2 = new Producto("Pan", 15.0, 2);
        Producto p3 = new Producto("Carne", 200.0, 4);
        Producto p4 = new Producto("Huevos", 40.0, 12);
        Producto p5 = new Producto("Cereal", 35.0, 5);
        Producto p6 = new Producto("Jugo", 18.0, 3);
        Producto p7 = new Producto("Queso", 60.0, 7);
        Producto p8 = new Producto("Yogurt", 22.0, 1);
        Producto p9 = new Producto("Galletas", 20.0, 6);

        Cliente c1 = new Cliente("Juan", "Normal");
        Cliente c2 = new Cliente("Ana", "VIP");

        Empleado e1 = new Empleado("Pedro", "Cajero");

        // Crear venta
        List<Producto> productos = Arrays.asList(p1, p2, p3,p4,p5,p6,p7,p8,p9);
        List<Producto> productosVenta = Arrays.asList(p1, p2, p3);
        Venta v1 = new Venta(c2, e1, productosVenta);

        
        // Calcular total
        service.calcularTotal(v1);

        // Imprimir venta
        service.imprimirVenta(v1);

        // Ticket
        service.generarTicket(c2, v1);

        // Notificación
        service.notificarCliente(c2, e1);

        // Ejemplo de filtro stock bajo
        System.out.println("Productos con stock <: " + service.filtrarStockBajo(productos));

        // Ejemplo descuento
        Producto pDescuento = service.aplicarDescuento(p3);
        System.out.println("Producto con descuento: " + pDescuento);

        // Comparar precios
        Producto masCaro = service.productoMasCaro(p1, p3);
        System.out.println("El producto más caro es: " + masCaro);

        // Verificar descuento VIP
        boolean aplicaDesc = service.puedeDescuento(c2, v1.getTotal());
        System.out.println("¿Aplica descuento VIP?: " + aplicaDesc);
        
    }
}
