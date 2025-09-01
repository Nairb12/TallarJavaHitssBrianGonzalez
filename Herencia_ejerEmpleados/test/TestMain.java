package Herencia_ejerEmpleados.test;

import Herencia_ejerEmpleados.clases.Cliente;
import Herencia_ejerEmpleados.clases.Gerente;

public class TestMain {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Brian", "Gonzalez", "NF12345", "Hgo", 5000,
                101, 20000);
        Cliente cl1 = new Cliente("Miguel", "Torres", "NF34567", "Av. Juárez 99");
        // =========================cliente================
        System.out.println("=== Datos del Cliente ===");
        cl1.mostrarInfo();

        // ==========================Gerente===================
        // Antes de aumentar la remuneración
        System.out.println("=== Datos del Gerente ===");
        gerente.mostrarInfo();
        // Aumentar sueldo en 10%
        gerente.aumentarRemuneracion(10);
        // Cambiar presupuesto
        gerente.setPresupuesto(25000);
        System.out.println("\n=== Después del aumento y cambio de presupuesto ===");
        gerente.mostrarInfo();
    }
}
