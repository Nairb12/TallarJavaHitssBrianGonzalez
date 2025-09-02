package ejercicios_abstraccion.Mamiferos.clases;

public class Guepardo extends Felino {

    
    public Guepardo(String habitat, double altura, double largo, double peso, String nombreCientifico,
            double tamanoGarras, Integer velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String comer() {
        return "El Guepardo (" + nombreCientifico + ") caza en las llanuras de " + habitat
                + " usando sus garras de " + tamanoGarras + " cm y su cuerpo de " + peso + " kg.";
    }

    @Override
    public String dormir() {
        return "El Guepardo duerme bajo los árboles en " + habitat
                + ", recuperando energías tras correr a gran velocidad.";
    }

    @Override
    public String correr() {
        return "El Guepardo alcanza hasta " + velocidad + " km/h, gracias a su cuerpo de "
                + altura + " m de alto y " + largo + " m de largo.";
    }

    @Override
    public String comunicarse() {
        return "El Guepardo emite sonidos agudos para comunicarse en " + habitat + ".";
    }

}
