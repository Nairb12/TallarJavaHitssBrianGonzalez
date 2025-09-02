package ejercicios_abstraccion.Mamiferos.clases;

public abstract class Caninos extends Mamifero{
    protected String color;
    protected double tamanoColmillos;
    
    public Caninos(String habitat, double altura, double largo, double peso, String nombreCientifico, String color,
            double tamanoColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }
    
}
