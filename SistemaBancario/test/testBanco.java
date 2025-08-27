package SistemaBancario.test;

import SistemaBancario.clases.Transacciones;
import SistemaBancario.clases.cuentasBancarias;

public class testBanco {
    public static void main(String[] args) {
        cuentasBancarias cuentaAna = new cuentasBancarias("Ana", 5000.0);
        cuentasBancarias cuentaLuis = new cuentasBancarias("Luis", 10000.0);

        // Transacciones (ahora se ejecutan dentro de la clase Transaccion)
        Transacciones.deposito(cuentaAna, 2000);
        Transacciones.retiro(cuentaAna, 1000);

        Transacciones.retiro(cuentaLuis, 3000);
        Transacciones.deposito(cuentaLuis, 1500);

        // Mostrar resultados
        System.out.println("\n=== Resumen Cuentas ===");
        System.out.println(cuentaAna);
        System.out.println(cuentaLuis);

        System.out.println(cuentaAna.getHistorial());

        System.out.println(cuentaLuis.getHistorial());
    }

}
