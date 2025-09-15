package Facturacion.genericos;

import java.util.ArrayList;
import java.util.List;

public class ServicioGenerico<T extends Identificable<ID>, ID > {
    private List<T> datos = new ArrayList<>();
    // public ServicioGenerico(){
    //     datos=new ArrayList<>();
    // }
    //Buscar por elemento de ID
    public T buscarPorId(ID id){
        for (T elemento : datos) {
            if (elemento.getId().equals(id)) {
                return elemento;
            }
        }
        return null;
    }
    //Guardar o agregar elemento sin duplicar
    public void guardar(T elemento) {
        if (buscarPorId(elemento.getId()) != null) {
            System.out.println("Ya existe el elemento con ID: "+elemento.getId());
        }else{
            datos.add(elemento); //Agregar a la lista
            System.out.println("Guardar: "+elemento);
        }
    }
    //Listar todos los elementos
    public List<T> listar(){
        return datos;
    }
    //Actualizar un elemento de dato de acuerdo al ID
    public boolean actualizar (ID id, T nuevoElemento){
        for (int i = 0; i < datos.size(); i++) {
            if (datos.get(i).getId().equals(id)) {//get(i) obtiene el valor del elemento en la posicion i
                // T anteriorElemento = datos.set(i, nuevoElemento);
                System.out.println("Actualizado ID "+id+" con: "+nuevoElemento);
                return true;
            }
        }
        System.out.println("No se encontro ID  "+ id+" para actualizar");
        return false;
    }
    //Eliminar un elemento con ID
    public boolean eliminar(ID id){
        for (int i = 0; i < datos.size(); i++) {
            if (datos.get(i).getId().equals(id)) {
                datos.remove(i);
                System.out.println("Eliminar ID: "+id);
                return true;
            }
        }
        System.out.println("No se encontro ID: "+id);
        return false;
    }
}
