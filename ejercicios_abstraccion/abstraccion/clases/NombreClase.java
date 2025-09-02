package ejercicios_abstraccion.abstraccion.clases;

public abstract class NombreClase { // una clase normal no puede tener abstractos, solo las clases abstr
    //Atributos comunes 
    protected String nombre;
    //Método(s) abstractos ==> sin cuerpo, lo deben de implementar las subclases
    public abstract void metodoAbstracto(String nombre);
    
    //Método(s) concreto(s) => con cuerpo 
    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre);
    }
}
