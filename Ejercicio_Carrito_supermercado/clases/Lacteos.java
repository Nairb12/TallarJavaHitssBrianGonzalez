package Ejercicio_Carrito_supermercado.clases;

public class Lacteos extends Producto {
        private int cantidad;
        private int proteinas;
        public Lacteos(String nombre, double precio, int cantidad, int proteinas) {
                super(nombre, precio);
                this.cantidad = cantidad;
                this.proteinas = proteinas;
        }
        public int getCantidad() {
                return cantidad;
        }
        public void setCantidad(int cantidad) {
                this.cantidad = cantidad;
        }
        public int getProteinas() {
                return proteinas;
        }
        public void setProteinas(int proteinas) {
                this.proteinas = proteinas;
        }
        @Override
        public String toString() {
                return "Lacteos [nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + ", proteinas="
                                + proteinas + "]";
        }
        
} 