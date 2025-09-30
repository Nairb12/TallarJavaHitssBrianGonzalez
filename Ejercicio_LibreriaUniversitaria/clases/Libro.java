package Ejercicio_LibreriaUniversitaria.clases;
import java.util.UUID;
import java.util.function.Supplier;

public class Libro {
    private String id;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private double precio;

    // Generador de IDs con lambda
    private static final Supplier<String> generarId = () -> UUID.randomUUID().toString();

    public Libro(String titulo, String autor, int anioPublicacion, double precio) {
        if (anioPublicacion < 1900) {
            throw new IllegalArgumentException("El año debe ser mayor a 1900");
        }
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor que 0");
        }
        this.id = generarId.get(); // ID único
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.precio = precio;
    }

    public String getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnioPublicacion() { return anioPublicacion; }
    public double getPrecio() { return precio; }

    @Override
    public String toString() {
        return "{ ID: "+id + " - " +
        "Titulo: " + titulo +
        " Autor:" + autor + 
        " Año de publicacion: " + anioPublicacion + 
        " $" + precio+" }";
    }
}


