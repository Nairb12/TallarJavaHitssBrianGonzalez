package ejercicios_abstraccion.Mamiferos.clases;

public class Leon extends Felino {
    private Integer numManada;
    private double potenciaRugidoDecibel;

    

    public Leon(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanoGarras,
            Integer velocidad, Integer numManada, double potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El León (" + nombreCientifico + ") caza junto a su grupo de " + numManada
                + " individuos en las llanuras de " + habitat
                + " usando sus garras de " + tamanoGarras + " cm.";
    }

    @Override
    public String dormir() {
        return "El León duerme en " + habitat + ", midiendo " + altura + " m de altura y "
                + largo + " m de largo, con un peso de " + peso + " kg.";
    }

    @Override
    public String correr() {
        return "El León corre a " + velocidad + " km/h para atrapar presas, mostrando su gran tamaño y fuerza.";
    }

    @Override
    public String comunicarse() {
        return "El León ruge con una potencia de " + potenciaRugidoDecibel + " dB para advertir a rivales en " + habitat
                + ".";
    }

}
