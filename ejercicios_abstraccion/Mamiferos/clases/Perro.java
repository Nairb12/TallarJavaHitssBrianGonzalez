package ejercicios_abstraccion.Mamiferos.clases;

public class Perro extends Caninos {
    private Integer fuerzaMordida;

    public Perro(String habitat, double altura, double largo, double peso, String nombreCientifico, String color,
            double tamanoColmillos, Integer fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El Perro Salvaje Africano (" + nombreCientifico + ") caza en grupo en las sabanas de "
                + habitat + " usando sus colmillos de " + tamanoColmillos + " cm y mordida de " + fuerzaMordida
                + " psi.";
    }

    @Override
    public String dormir() {
        return "El Perro Salvaje Africano de color " + color
                + " duerme en madrigueras cercanas a " + habitat
                + " con un peso de " + peso + " kg.";
    }

    @Override
    public String correr() {
        return "El Perro Salvaje Africano recorre largas distancias en " + habitat
                + "alcanzando una valocidad impresionan te gracias a su cuerpo de " + largo + " m.";
    }

    @Override
    public String comunicarse() {
        return "El Perro Salvaje Africano se comunica mediante chillidos y ladridos, organizando la caza en " + habitat
                + ".";
    }

}
