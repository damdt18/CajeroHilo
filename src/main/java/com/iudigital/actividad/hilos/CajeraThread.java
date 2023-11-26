package com.iudigital.actividad.hilos;

import com.iudigital.actividad.modelos.ClienteProducto;
import com.iudigital.actividad.modelos.Producto;
import javax.swing.JOptionPane;

/**
 * Clase CajeraThread que representa una cajera que procesa la compra de un cliente en hilos
 */
public class CajeraThread extends Thread {
    private String nombre;
    private ClienteProducto cliente;
    private long tiempoInicial;

    /**
     * Constructor de CajeraThread.
     *
     * @param nombre         El nombre de la cajera.
     * @param cliente        El cliente cuya compra se procesará.
     * @param tiempoInicial  El tiempo inicial de procesamiento.
     */
    public CajeraThread(String nombre, ClienteProducto cliente, long tiempoInicial) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.tiempoInicial = tiempoInicial;
    }

    /**
     * Método run que representa la lógica de procesamiento de compra de la cajera en un hilo separado.
     */
    @Override
    public void run() {
        float costoTotalCompra = 0;

        System.out.println("La Cajera " + this.nombre
                + " Comienza a Procesar la Compra del Cliente "
                + this.cliente.getNombre() + " En el Tiempo: "
                + (System.currentTimeMillis() - this.tiempoInicial) / 1000 + " Seg");

        int contCliente = 1;

        for (Producto producto : cliente.getProductos()) {

            costoTotalCompra += producto.getCantidad() * producto.getPrecio();

            esperarXsegundos();

            String mensajeProducto = "Compra realizada para " + cliente.getNombre()
                    + " - Producto " + contCliente
                    + " - Nombre: " + producto.getNombre()
                    + " - Precio: " + producto.getPrecio()
                    + " - Cantidad: " + producto.getCantidad()
                    + " - Costo Total: " + producto.getCantidad() * producto.getPrecio()
                    + " --> Tiempo: " + (System.currentTimeMillis() - this.tiempoInicial) / 1000 + " Seg";
            System.out.println(mensajeProducto);
            contCliente++;
        }

        String mensajeCostoTotal = "Costo total de la compra para " + cliente.getNombre() + ": " + costoTotalCompra;
        System.out.println(mensajeCostoTotal);

        String mensajeFinalizacion = "La cajera " + this.nombre + " Ha Terminado de Procesar a el Cliente "
                + this.cliente.getNombre() + " En el Tiempo "
                + (System.currentTimeMillis() - this.tiempoInicial) / 1000 + " Seg";
        System.out.println(mensajeFinalizacion);
    }

    /**
     * Método que simula una espera de un segundo.
     */
    private void esperarXsegundos() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
