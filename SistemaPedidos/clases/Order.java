package SistemaPedidos.clases;

import SistemaPedidos.enums.*;


public class Order {
    private int id;
    private String customer;
    private orderStatus status;
    private orderPriority priority;
    private paymentMethod paymentMethod;
     
    // atributo estatico
    private static int contador;

    public Order(String customer, orderStatus status, orderPriority priority, paymentMethod paymentMethod) {
        this.id = ++contador;
        this.customer = customer;
        this.status = status;
        this.priority = priority;
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "{id: #" + id 
        + "\n, customer: " + customer 
        + "\n, status: " + status +" -> "+status.getMensaje()
        + "\n, priority=" + priority+ " (Nivel " + (priority.ordinal()+1) + ")"
        + "\n, paymentMethod=" + paymentMethod + "}";
    }
    
}
