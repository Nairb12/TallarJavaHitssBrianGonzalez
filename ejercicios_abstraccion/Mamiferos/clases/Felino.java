package ejercicios_abstraccion.Mamiferos.clases;

public abstract class Felino extends Mamifero{
    protected double tamanoGarras;
    protected Integer velocidad;
    public Felino(String habitat, double altura, double largo, double peso, String nombreCientifico,
            double tamanoGarras, Integer velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }
    
}
