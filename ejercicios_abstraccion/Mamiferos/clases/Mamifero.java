package ejercicios_abstraccion.Mamiferos.clases;

public abstract class Mamifero {
    protected String habitat;
    protected double altura;
    protected double largo;
    protected double peso;
    protected String nombreCientifico;
    
    public Mamifero(String habitat, double altura, double largo, double peso, String nombreCientifico) {
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        this.nombreCientifico = nombreCientifico;
    }

    public abstract String comer();
    public abstract String dormir();
    public abstract String correr();
    public abstract String comunicarse();

    @Override
    public String toString() {
        return "{Habitat: " + habitat 
        + ", altura: " + altura 
        + ", largo: " + largo 
        + ", peso: " + peso
        + ", nombreCientifico: " + nombreCientifico + "}";
    }

    
    
} 
