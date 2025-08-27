package SistemaBancario.clases;

public class cuentasBancarias {
    private final int idUni;
    private String nombreTitular;
    private Double saldo;
    private String historial; // Guardamos transacciones en un String acumulado

    // atributo estatico
    private static int contador;

    public cuentasBancarias(String nombreTitular, Double saldo) {
        this.idUni = ++contador;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        this.historial = "=== Historial de transacciones para " + nombreTitular + " ===\n";
    }

    public int getIdUni() {
        return idUni;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public void agregarAlHistorial(String movimiento) {
        historial += movimiento + "\n";
    }
    public String getHistorial() {
        return historial;
    }

    @Override
    public String toString() {
        return "{ idUni: " + idUni
                + ", nombreTitular: " + nombreTitular
                + ", saldo: $" + saldo + "}";
    }

}
