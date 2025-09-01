# Ejercicio: Compañía de Empleados

## Descripción
Este proyecto implementa una **jerarquía de clases** en Java basada en el manejo de **personas** dentro de una compañía.  
Existen **Clientes** y **Empleados**, y entre los empleados se encuentran los **Gerentes**, quienes tienen responsabilidades adicionales.  

La solución se construyó tomando como referencia el **diagrama UML** proporcionado.

---

## Jerarquía de Clases

- **Persona (Clase base)**  
  Contiene atributos generales de cualquier persona:
  - Nombre  
  - Apellido  
  - Número fiscal  
  - Dirección  

- **Cliente (Subclase de Persona)**  
  Hereda los atributos de `Persona` y añade:
  - `clienteId` → identificador único de cliente  

- **Empleado (Subclase de Persona)**  
  Hereda de `Persona` y añade:
  - `remuneracion` (sueldo)  
  - `empleadoId`  
  - Método `aumentarRemuneracion(int porcentaje)` → permite incrementar el sueldo en base a un porcentaje.  

- **Gerente (Subclase de Empleado)**  
  Extiende a `Empleado` y añade:  
  - `presupuesto` (con **getter y setter**) → presupuesto disponible para su área.  

---

## Funcionalidades principales

1. **Herencia aplicada**:  
   - `Cliente` y `Empleado` heredan de `Persona`.  
   - `Gerente` hereda de `Empleado`.  

2. **Polimorfismo y sobreescritura**:  
   Todas las clases redefinen el método `toString()` para mostrar información personalizada.  

3. **Gestión de empleados**:  
   - Se pueden **aumentar sueldos** con el método `aumentarRemuneracion`.  
   - Los **Gerentes** pueden **modificar su presupuesto** gracias al método `setPresupuesto`.  

4. **Ejemplos de uso**:  
   - Crear y mostrar un **Cliente** con su `clienteId`.  
   - Crear un **Empleado**, mostrar su información, aumentar su sueldo y mostrarlo de nuevo.  
   - Crear un **Gerente**, modificar su presupuesto y mostrar todos los datos heredados y propios.  

---

## Ejemplo de salida esperada

=== Datos del Cliente ===
ClienteID: 1
Nombre: Miguel Torres, Número Fiscal: NF34567, Dirección: Av. Juárez 99
=== Datos del Gerente ===
Nombre: Brian Gonzalez, Número Fiscal: NF12345, Dirección: Hgo
| EmpleadoID: 101, Remuneración: 5000.0
| Presupuesto: 20000.0

=== Después del aumento y cambio de presupuesto ===
Nombre: Brian Gonzalez, Número Fiscal: NF12345, Dirección: Hgo
| EmpleadoID: 101, Remuneración: 5500.0
| Presupuesto: 25000.0
---
## ✅ Conclusión
Este ejercicio demuestra cómo aplicar **herencia, encapsulamiento, polimorfismo y sobreescritura** en Java.  
El diseño permite escalar el sistema fácilmente si se desean agregar más tipos de empleados o clientes en el futuro.  