import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;
import  Facturacion.entidades.Factura;

public class facturaTxt {
    private static final Path ruta = Paths.get("Facturacion/facturas");
    // Crear carpeta si no existe
    static {
        try {
            if (!Files.exists(ruta)) {
                Files.createDirectories(ruta);
            }
        } catch (IOException e) {
            System.err.println("Error al crear directorio de facturas: " + e.getMessage());
        }
    }
    // 1. Guardar en archivo
    public static String guardarFactura(Factura factura) {
        String nombreArchivo = "factura_" + factura.getId() + ".txt";
        Path rutaArchivo = ruta.resolve(nombreArchivo);

        try {
            Files.writeString(rutaArchivo, factura.generarReporte(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING);

            System.out.println("Factura guardada en: " + rutaArchivo);
            return rutaArchivo.toAbsolutePath().toString();
        } catch (IOException e) {
            System.err.println("Error al guardar factura: " + e.getMessage());
            return null;
        }
    }

    // 2. Leer factura desde archivo
    public static void leerFactura(Factura factura) {
        String nombreArchivo = "factura_" + factura.getId() + ".txt";
        Path rutaArchivo = ruta.resolve(nombreArchivo);

        if (!Files.exists(rutaArchivo)) {
            System.out.println("Factura con ID " + factura.getId() + " no encontrada.");
            return;
        }

        try {
            String contenido = Files.readString(rutaArchivo);
            System.out.println("=== Contenido de " + nombreArchivo + " ===");
            System.out.println(contenido);
        } catch (IOException e) {
            System.err.println("Error al leer factura: " + e.getMessage());
        }
    }

    // 3. Listar facturas en carpeta
    public static void listarFacturas() {
        try (Stream<Path> archivos = Files.list(ruta)) {
            System.out.println("Facturas en carpeta:");
            archivos.filter(Files::isRegularFile)
                    .forEach(archivo -> System.out.println(archivo.getFileName()));
        } catch (IOException e) {
            System.err.println("Error al listar facturas: " + e.getMessage());
        }
    }
}