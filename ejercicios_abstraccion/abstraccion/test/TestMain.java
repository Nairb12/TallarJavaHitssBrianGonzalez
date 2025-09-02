package ejercicios_abstraccion.abstraccion.test;

import ejercicios_abstraccion.abstraccion.clases.*;

public class TestMain {
    public static void main(String[] args) {
        /*En una empresa existen distintos tipos de empleados
         *Todos tienen nombre y salario
         pero el calculo de bono es diferente segun el tipo de empleado 
        */
        Gerente gerente=new Gerente("Eloy", 15000.00);
        Empleado dev=new Desarrollador("Brian", 20000.00);
        Empleado vendedor=new Vendedor("Bingo", 5000.00,50000);
        gerente.mostrarInfo();
        System.out.println("Bono: $"+gerente.calcularBono());
        dev.mostrarInfo();
        System.out.println("Bono: $"+dev.calcularBono());
        vendedor.mostrarInfo();
        System.out.println("Bono: $"+vendedor.calcularBono());

    }
}
