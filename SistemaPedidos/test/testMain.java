package SistemaPedidos.test;

import SistemaPedidos.clases.Order;
import SistemaPedidos.enums.*;

public class testMain {
    public static void main(String[] args) {
        Order p1 = new Order("Ana", orderStatus.NEW, orderPriority.HIGH, paymentMethod.CARD);
        Order p2 = new Order("Luis", orderStatus.SHIPPED, orderPriority.MEDIUM, paymentMethod.CASH);
        Order p3 = new Order("Marta", orderStatus.DELIVERED, orderPriority.LOW, paymentMethod.TRANSFER);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
}
