package ejercicios_abstraccion.Mamiferos.clases;

public class Tigre extends Felino{
    private String especieTigre;

    
    public Tigre(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanoGarras,
            Integer velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    @Override
public String comer() {
    return "El Tigre (" + nombreCientifico + ") de la especie " + especieTigre 
        + " caza en " + habitat + " gracias a su peso de " + peso + " kg y sus garras de " 
        + tamanoGarras + " cm.";
}

@Override
public String dormir() {
    return "El Tigre duerme en la selva de " + habitat 
        + " con un tamaño de " + altura + " m y " + largo + " m de largo.";
}

@Override
public String correr() {
    return "El Tigre puede alcanzar velocidades de hasta " + velocidad + " km/h para sorprender a su presa.";
}

@Override
public String comunicarse() {
    return "El Tigre ruge fuertemente en " + habitat + " para marcar su territorio.";
}

}
