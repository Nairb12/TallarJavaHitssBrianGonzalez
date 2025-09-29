package Transformaciondatolambda.interfaz;

@FunctionalInterface
public interface Transformador<T,R>{
    R transformar(T dato);
}
