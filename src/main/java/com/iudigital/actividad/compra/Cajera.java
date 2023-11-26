package com.iudigital.actividad.compra;

import com.iudigital.actividad.modelos.ClienteProducto;
import com.iudigital.actividad.modelos.Producto;


/**
 * Clase que representa a una cajera encargada de procesar las compras de los clientes.
 */
public class Cajera {

    private String nombre;

    /**
     * Constructor de la clase Cajera.
     *
     * @param nombre El nombre de la cajera.
     */
    public Cajera(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Procesa la compra de un cliente, calculando el costo total de los productos y mostrando información detallada.
     *
     * @param cliente   El cliente y sus productos a procesar.
     * @param timeStamp El tiempo inicial de procesamiento.
     */
    public void procesarCompra(ClienteProducto cliente, long timeStamp) {
        float costoTotalCompra = 0;

        System.out.println("La Cajera " + this.nombre
                + " comienza a procesar la compra del cliente: "
                + cliente.getNombre()
                + " Tiempo transcurrido: "
                + (System.currentTimeMillis() - timeStamp) / 1000 + " Seg");

        for (Producto producto : cliente.getProductos()) {
            esperarXsegundos();

            costoTotalCompra += producto.getCantidad() * producto.getPrecio();

            String mensajeProducto = "Compra realizada - Producto\n"
                    + "Nombre: " + producto.getNombre() + "\n"
                    + "Precio: " + producto.getPrecio() + "\n"
                    + "Cantidad: " + producto.getCantidad() + "\n"
                    + "Costo Total: " + producto.getCantidad() * producto.getPrecio() + "\n"
                    + "Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + " Seg";
            System.out.println(mensajeProducto);
        }

        String mensajeCostoTotal = "Costo total de la compra: " + costoTotalCompra;
        System.out.println(mensajeCostoTotal);

        String mensajeFinalizacion = "La cajera: " + this.nombre
                + " ha terminado de procesar al cliente: "
                + cliente.getNombre()
                + " en el tiempo transcurrido de: "
                + (System.currentTimeMillis() - timeStamp) / 1000 + " Seg";
        System.out.println(mensajeFinalizacion);
    }

    /**
     * Simula una espera de un segundo.
     */
    private void esperarXsegundos() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
