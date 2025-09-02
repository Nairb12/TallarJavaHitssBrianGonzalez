package ejercicios_abstraccion.Mamiferos.clases;

public class Lobo extends Caninos {
    private Integer numCamada;
    private String especieLobo;

    public Lobo(String habitat, double altura, double largo, double peso, String nombreCientifico, String color,
            double tamanoColmillos, Integer numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() {
        return "El Lobo (" + nombreCientifico + ") de la especie " + especieLobo
                + " caza en " + habitat + " junto a su camada de " + numCamada
                + ", usando sus colmillos de " + tamanoColmillos + " cm.";
    }

    @Override
    public String dormir() {
        return "El Lobo " + color + " duerme en cuevas de " + habitat
                + ", midiendo " + altura + " m y con un peso de " + peso + " kg.";
    }

    @Override
    public String correr() {
        return "El Lobo corre grandes distancias resistiendo gracias a su cuerpo de "
                + largo + " m de largo y fuerza en sus patas.";
    }

    @Override
    public String comunicarse() {
        return "El Lobo aúlla en " + habitat + " para reunir a su manada y advertir a intrusos.";
    }

}
