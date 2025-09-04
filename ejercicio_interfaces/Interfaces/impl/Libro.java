package ejercicio_interfaces.Interfaces.impl;

import java.time.LocalDate;

import ejercicio_interfaces.Interfaces.ILibro;

public class Libro extends Producto implements ILibro {
    private LocalDate fechaPublicacion;
    private String autor;
    private String titulo;
    private String editorial;
    public Libro(int precio, LocalDate fechaPublicacion,String autor, String titulo, String editorial) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }
    @Override
    public double getPrecioVenta() {
        return getPrecio()*1.10;
    }
    @Override
    public String getAutor() {
        // TODO Auto-generated method stub
        return autor;
    }
    @Override
    public String getEditorial() {
        // TODO Auto-generated method stub
        return editorial;
    }
    @Override
    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }
    @Override
    public String getTitulo() {
        // TODO Auto-generated method stub
        return titulo;
    }
    @Override
    public String toString() {
        return "{ Libro: " + titulo + " de " + autor + " (" + editorial + 
               "), Publicado: " + fechaPublicacion 
               + " - Precio base: $" + getPrecio() 
               + ", Precio venta: $" + getPrecioVenta()+" }";
    }
    
}
