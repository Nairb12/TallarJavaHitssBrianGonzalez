package SistemaBancario.clases;

public class Transacciones {
    private final int idUniA;
    private Double monto;
    private String tipo;
    private cuentasBancarias cuenta;
    // atributo estatico
    private static int contador;

    public Transacciones(String tipo, Double monto, cuentasBancarias cuenta) {
        this.idUniA = ++contador;
        this.tipo = tipo;
        this.monto = monto;
        this.cuenta = cuenta;
    }

    public static void deposito(cuentasBancarias cuenta, double monto) {
        Transacciones t = new Transacciones("Depósito", monto, cuenta);
        cuenta.setSaldo(cuenta.getSaldo()+monto);
        cuenta.agregarAlHistorial(t.toString());
        System.out.println(t);
        System.out.println("Saldo actual de la cuenta de" + cuenta.getNombreTitular() + ": $" + cuenta.getSaldo());
    }

    public static void retiro(cuentasBancarias cuenta, double monto) {
        if (cuenta.getSaldo()>monto) {
            cuenta.setSaldo(cuenta.getSaldo()-monto);
            Transacciones t = new Transacciones("Retiro", monto, cuenta);
            cuenta.agregarAlHistorial(t.toString());
            System.out.println(t);
            System.out.println("Saldo actual de " + cuenta.getNombreTitular() + ": $" + cuenta.getSaldo());
        } else {
            System.out.println("Fondos insuficientes en la cuenta de " + cuenta.getNombreTitular());
        }
    }
    @Override
    public String toString() {
        return "{ idUniA: " + idUniA
                + ", monto: $" + monto
                + ", tipo: " + tipo
                + ", ID de cuenta:" + cuenta.getIdUni()
                + "}";
    }
}
