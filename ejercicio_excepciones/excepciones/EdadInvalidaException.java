package ejercicio_excepciones.excepciones;

public class EdadInvalidaException extends Exception{
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}
