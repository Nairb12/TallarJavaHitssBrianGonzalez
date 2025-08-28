package SistemaPedidos.enums;

public enum paymentMethod {
    CASH("Efectivo"),
    CARD("Tarjeta de crédito/débito"),
    TRANSFER("Transferencia bancaria");

    private final String tippago;

    paymentMethod(String tippago) {
        this.tippago = tippago;
    }

    public String gettippago() {
        return tippago;
    }
}
