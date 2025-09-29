package Transformaciondatolambda.test;

import Transformaciondatolambda.interfaz.Transformador;

public class TestMain {
    public static void main(String[] args) {
        Transformador<String,String> limpio= s -> s.replaceAll("[ ,.]","").toUpperCase();
        String frase="Hola, grupo. tengo hambre .";
        System.out.println(frase);
        System.out.println(limpio.transformar(frase));
    }
}