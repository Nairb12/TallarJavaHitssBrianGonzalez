# Sistema de Pedidos con Enumeraciones en Java

## Descripción General
Este ejercicio consiste en implementar un sistema de pedidos sencillo utilizando **enumeraciones (enum)** en Java.  
El objetivo es aprender cómo los `enum` permiten modelar **valores constantes con significado**, y cómo se integran en una clase para representar información real.

---

## Enums

1. **OrderStatus**  
   Define los posibles estados de un pedido (creado, en proceso, enviado, entregado o cancelado).  
   Cada estado lleva asociado un mensaje descriptivo, lo que permite mostrar información más clara al usuario.

2. **OrderPriority**  
   Representa el nivel de prioridad de atención (baja, media, alta).  
   A cada prioridad se le asigna un número que indica su nivel, siendo útil para organizar qué pedidos se atienden primero.

3. **PaymentMethod**  
   Enumera los métodos de pago disponibles (efectivo, tarjeta o transferencia).  
   Cada uno incluye una descripción que facilita mostrarlo al cliente de manera entendible.

---

## Clase Order
La clase `Order` es el corazón del sistema. Contiene:
- Un identificador único del pedido.  
- El nombre del cliente.  
- El estado del pedido (`orderStatus`).  
- La prioridad (`orderPriority`).  
- El método de pago (`paymentMethod`).  

Además, incluye un método para mostrar los detalles del pedido en un formato claro y legible.

---

## Clase Principal
En la clase principal se crean varios pedidos de ejemplo, cada uno con un estado, prioridad y método de pago diferente.  
Finalmente, se muestran sus detalles en pantalla simulando cómo funcionaría un pequeño sistema de gestión de pedidos.

---

## Conclusión
Este ejercicio demuestra cómo usar **enumeraciones para representar información fija y controlada** dentro de un sistema.  
Al combinarlas con una clase (`Order`), se obtiene un modelo más **seguro, estructurado y fácil de mantener**, que puede servir como base para proyectos más grandes (sistemas de compras, logística o facturación).
