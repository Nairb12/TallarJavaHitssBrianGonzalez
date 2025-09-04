package ejercicio_interfaces.clases;

import java.time.LocalDate;

import ejercicio_interfaces.Interfaces.impl.Libro;

public class Comics extends Libro {
    private String personaje;

    public Comics(int precio,LocalDate fechaPublicacion, String autor, String titulo, String editorial,
            String personaje) {
        super(precio,fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    @Override
     public String toString() {
        return "{ Comic: " + getTitulo() 
        + " - Personaje: " + personaje 
        + ", Autor: " + getAutor() 
        +"(" + getEditorial() 
        + "), Publicado: " + getFechaPublicacion()
        +" - Precio base: $" + getPrecio() 
        + ", Precio venta: $" + getPrecioVenta()+" }";
    }
    
    
}
