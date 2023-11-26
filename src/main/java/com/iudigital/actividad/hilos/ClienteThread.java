package com.iudigital.actividad.hilos;

import com.iudigital.actividad.modelos.ClienteProducto;
import com.iudigital.actividad.modelos.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase ClienteThread que simula compras de diferentes clientes utilizando hilos (threads) para procesar las compras.
 */
public class ClienteThread {

    /**
     * Método principal que simula compras de dos clientes con diferentes productos utilizando hilos separados.
     *
     * @param args Argumentos de la línea de comandos (no utilizado).
     */
    public static void main(String[] args) {

        // Lista de productos disponibles para la venta
        List<Producto> productos = new ArrayList<>();

        // Se agregan productos a la lista de productos disponibles
        setProductos(productos);

        // Creación de dos clientes con sus respectivos nombres
        ClienteProducto cliente1 = new ClienteProducto("Catalina Vinasco");
        ClienteProducto cliente2 = new ClienteProducto("Gabriel Ortiz");

        // Agregar productos al carrito del cliente 1
        cliente1.agregarProducto(new Producto("Pollo", 10000, 3));
        cliente1.agregarProducto(new Producto("Lechuga", 1000, 10));
        cliente1.agregarProducto(new Producto("Arroz", 2500, 10));

        // Agregar productos al carrito del cliente 2
        cliente2.agregarProducto(new Producto("Salchicha", 5000, 4));
        cliente2.agregarProducto(new Producto("Leche", 3800, 5));
        cliente2.agregarProducto(new Producto("Arepas", 1600, 10));

        // Obtener el tiempo inicial de la compra
        long tiempoInicial = System.currentTimeMillis();

        // Creación de dos hilos (CajeraThread) para procesar las compras de los clientes
        CajeraThread cajera1 = new CajeraThread("MariaC", cliente1, tiempoInicial);
        CajeraThread cajera2 = new CajeraThread("Valentins", cliente2, tiempoInicial);

        // Iniciar los hilos para procesar las compras
        cajera1.start();
        cajera2.start();
    }

    /**
     * Agrega productos a la lista de productos disponibles.
     *
     * @param productos La lista de productos a la cual se agregarán nuevos productos.
     */
    private static void setProductos(List<Producto> productos) {
        // Agregar productos a la lista de productos disponibles
        Producto producto1 = new Producto("Manzana", 1200, 10);
        Producto producto2 = new Producto("Naranja", 400, 12);
        Producto producto3 = new Producto("Leche Caja", 2500, 4);

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
    }
}
