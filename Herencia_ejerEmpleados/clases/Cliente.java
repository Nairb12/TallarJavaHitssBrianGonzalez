package Herencia_ejerEmpleados.clases;

public class Cliente extends Persona{
    private int clienteId;
    private int contador;

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteId = ++contador;
    }

    public int getClienteId() { return clienteId; }

    @Override
    public void mostrarInfo() {
        System.out.println("ClienteID: " + clienteId);
        super.mostrarInfo();
    }
    
}
