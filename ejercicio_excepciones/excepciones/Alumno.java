package ejercicio_excepciones.excepciones;

public class Alumno {
    private String nombre;
    private int edad;

    public Alumno(String nombre, int edad) throws EdadInvalidaException {
        if (edad < 0)
            throw new IllegalArgumentException("Edad no puede ser negativa");
        if (edad < 18)
            throw new EdadInvalidaException("Edad mínima requerida: 18");
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno: " + nombre + " (" + edad + " años)";
    }
}
