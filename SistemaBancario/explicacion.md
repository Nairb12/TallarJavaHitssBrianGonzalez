# Sistema Bancario Simple con IDs Automáticos

## Descripción del Problema
Una institución bancaria requiere un sistema básico para administrar **cuentas bancarias** y **transacciones**.  
El objetivo es que tanto las cuentas como las transacciones generen **IDs automáticos** (sin intervención del usuario).  

El sistema debe permitir:

1. **Crear cuentas bancarias** con:
   - ID único generado automáticamente.
   - Nombre del titular.
   - Saldo inicial.

2. **Operaciones bancarias**:
   - **Depósito** → aumenta el saldo de la cuenta.
   - **Retiro** → disminuye el saldo (solo si hay fondos suficientes).

3. **Registro de transacciones**:
   - Cada transacción debe tener un ID único automático.
   - Guardar el tipo de operación (**depósito** o **retiro**).
   - Guardar el monto.
   - Asociar la transacción a la cuenta correspondiente.

4. **Mostrar información**:
   - Detalle de cada cuenta (ID, titular, saldo).
   - Historial de transacciones con sus respectivos IDs.

---

## Ejemplo de Funcionamiento
- Crear dos cuentas:
  - Ana con **$5000**.
  - Luis con **$10000**.
- Operaciones:
  - Ana deposita **$2000** y retira **$1000**.
  - Luis retira **$3000** y deposita **$1500**.
- Resultado esperado:
  - El sistema muestra la información de cada cuenta.
  - Cada cuenta mantiene su propio historial de transacciones con IDs únicos.

---

## Solución Implementada
El sistema se resolvió con **tres clases principales** en archivos separados:

### 1. `CuentaBancaria.java`
- Representa una cuenta bancaria.
- Atributos principales:
  - `id` (único y autogenerado).
  - `titular`.
  - `saldo`.
  - `historial` (para guardar las transacciones propias de la cuenta).
- Métodos principales:
  - `depositar(monto)`.
  - `retirar(monto)`.
  - `agregarAlHistorial(transaccion)`.

### 2. `Transacciones.java`
- Representa una transacción realizada sobre una cuenta.
- Atributos principales:
  - `id` (único y autogenerado).
  - `tipo` (Depósito/Retiro).
  - `monto`.
  - `cuentaAsociada`.
- Métodos estáticos:
  - `deposito(cuenta, monto)`.
  - `retiro(cuenta, monto)`.
- Cada vez que se ejecuta una operación, además de afectar el saldo de la cuenta, se registra en el historial de la misma.

### 3. `TestBanco.java`
- Clase principal para **probar el sistema**.
- Crea las cuentas.
- Realiza depósitos y retiros mediante la clase `Transacciones`.
- Finalmente, imprime:
  - El detalle de las cuentas.
  - El historial de transacciones de cada una.

---

## Nota Personal
- Usar **IDs automáticos** garantiza que no haya duplicados en cuentas ni transacciones.
- La separación en clases (`CuentaBancaria`, `Transacciones`, `TestBanco`) permite un diseño limpio y fácil de mantener.
- Cada cuenta administra su **propio historial**, lo que facilita el seguimiento individual.

