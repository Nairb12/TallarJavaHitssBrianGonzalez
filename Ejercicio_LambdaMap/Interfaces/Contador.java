package Ejercicio_LambdaMap.Interfaces;
@FunctionalInterface
public interface Contador<T,R> {
    R contar(T dato);
}
