package Ejercicio_SistemaPuntoDeVenta.utils;

import Ejercicio_SistemaPuntoDeVenta.clases.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class SupermercadoService {
    // 1. Filtrar productos con stock bajo (< 5)
    public List<String> filtrarStockBajo(List<Producto> productos) {
        List<String> resultado = new ArrayList<>();
        Predicate<Producto> pred = x -> x.getStock() < 5;
        productos.forEach(p -> {
            if (pred.test(p))
                resultado.add("\n Producto: " + p.getNombre() + " | Stock: " + p.getStock());
        });
        return resultado;
    }

    // 2. Calcular el total de una venta (precio * cantidad)
    public double calcularTotal(Venta v) {
        Function<Venta, Double> func = x -> {
            double suma = 0;
            for (Map.Entry<Producto, Integer> entry : x.getProductos().entrySet()) {
                suma += entry.getKey().getPrecio() * entry.getValue();
            }
            x.setTotal(suma);
            return suma;
        };
        return func.apply(v);
    }

    // 3. Imprimir detalles de la venta
    public void imprimirVenta(Venta v) {
        Consumer<Venta> cons = x -> {
            System.out.println("\n=== DETALLE DE VENTA ===");
            System.out.println("Cliente: " + x.getCliente().getNombre());
            System.out.println("Empleado: " + x.getEmpleado().getNombre());
            for (Map.Entry<Producto, Integer> entry : x.getProductos().entrySet()) {
                Producto p = entry.getKey();
                int cantidad = entry.getValue();
                System.out.println(p.getNombre() + " x" + cantidad + " = $" + (p.getPrecio() * cantidad));
            }
            System.out.println("TOTAL: $" + x.getTotal());
        };
        cons.accept(v);
    }

    // 4. Generar producto de muestra
    public Producto generarProductoMuestra() {
        Supplier<Producto> sup = () -> new Producto("ProductoDemo", 10.0, 3);
        return sup.get();
    }

    // 5. Aplicar descuento del 10%
    public Producto aplicarDescuento(Producto p) {
        UnaryOperator<Producto> op = x -> new Producto(x.getNombre(), x.getPrecio() * 0.9, x.getStock());
        return op.apply(p);
    }

    // 6. Comparar dos productos y devolver el más caro
    public Producto productoMasCaro(Producto p1, Producto p2) {
        BinaryOperator<Producto> op = (x, y) -> x.getPrecio() > y.getPrecio() ? x : y;
        return op.apply(p1, p2);
    }

    // 7. Verificar descuento para cliente VIP con compra > 1000
    public boolean puedeDescuento(Cliente c, double total) {
        BiPredicate<Cliente, Double> pred = (cli, tot) -> cli.getTipo().equals("VIP") && tot > 1000;
        return pred.test(c, total);
    }

    // 8.- Generar ticket y actualizar inventario del main
    public void generarTicket(Cliente c, Venta v, List<Producto> inventario) {
        BiConsumer<Cliente, Venta> cons = (cli, ven) -> {
            System.out.println("=== TICKET DE VENTA ===");
            System.out.println("Cliente: " + cli.getNombre() + " (" + cli.getTipo() + ")");
            System.out.println("Venta #" + ven.getId());

            for (Map.Entry<Producto, Integer> entry : ven.getProductos().entrySet()) {
                Producto vendido = entry.getKey();
                int cantidad = entry.getValue();
                System.out.println(vendido.getNombre() + " x" + cantidad + " = $" + (vendido.getPrecio() * cantidad));

                // Actualizar stock en inventario
                for (Producto p : inventario) {
                    if (p.getNombre().equals(vendido.getNombre())) {
                        p.setStock(p.getStock() - cantidad);
                    }
                }
            }

            System.out.println("TOTAL: $" + ven.getTotal());
            System.out.println("Inventario actualizado!");
        };
        cons.accept(c, v);
    }

    // 9. Notificar cliente sobre compra procesada
    public void notificarCliente(Cliente c, Empleado e) {
        BiConsumer<Cliente, Empleado> cons = (cli, emp) -> {
            System.out.println("Notificación: Estimado " + cli.getNombre() +
                    ", su compra fue procesada por el empleado " + emp.getNombre());
        };
        cons.accept(c, e);
    }

}
