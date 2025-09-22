package Ejercicio_Vuelos.clases;

import java.time.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Paths;
import java.time.format.DateTimeFormatter;

public class lecturaArchivo {
    public static List<Vuelo> leerCSV(String nombreArchivo) {
        List<Vuelo> vuelos = new ArrayList<>();

        // Ruta del archivo CSV
        String ruta = Paths.get(nombreArchivo).toAbsolutePath().toString();

        // Formatos de fecha y hora
        DateTimeFormatter formatterFecha = DateTimeFormatter.ofPattern("dd MMM yyyy", Locale.forLanguageTag("es-MX"));
        DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm");

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            br.readLine(); // Saltar encabezado

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(","); // separador CSV
                String nombre = datos[0].trim();
                String origen = datos[1].trim();
                String destino = datos[2].trim();

                String fechaTexto = datos[3].substring(4).trim().toLowerCase();
                String horaTexto = datos[4].replace("hrs", "").trim();

                LocalTime hora = LocalTime.parse(horaTexto, formatterHora);
                LocalDate fecha = LocalDate.parse(fechaTexto,formatterFecha);
                LocalDateTime fechaLlegada = LocalDateTime.of(fecha, hora);

                int pasajeros = Integer.parseInt(datos[5].trim());

                vuelos.add(new Vuelo(nombre, origen, destino, fechaLlegada, pasajeros));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return vuelos;
    }
}
