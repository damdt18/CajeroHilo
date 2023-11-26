
package com.iudigital.actividad.compra;

import com.iudigital.actividad.modelos.ClienteProducto;
import com.iudigital.actividad.modelos.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase Cliente que simula compras de distintos clientes utilizando la clase Cajera.
 */
public class Cliente {

    /**
     * Método principal para simular compras de dos clientes con diferentes productos.
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
        ClienteProducto cliente2 = new ClienteProducto("Santiago Vinasco");

        // Agregar productos al carrito del cliente 1
        cliente1.agregarProducto(new Producto("Pera", 2000, 5));
        cliente1.agregarProducto(new Producto("Zanahoria", 500, 10));
        cliente1.agregarProducto(new Producto("Yogurt", 3500, 5));

        // Agregar productos al carrito del cliente 2
        cliente2.agregarProducto(new Producto("Limón", 400, 10));
        cliente2.agregarProducto(new Producto("Panela", 3700, 2));
        cliente2.agregarProducto(new Producto("Azúcar", 2000, 10));

        // Obtener el tiempo inicial de la compra
        long tiempoInicial = System.currentTimeMillis();

        // Creación de dos cajeras
        Cajera cajera1 = new Cajera("MariaC");
        Cajera cajera2 = new Cajera("Valentina");

        // Procesar compra del cliente 1 con la cajera 1
        cajera1.procesarCompra(cliente1, tiempoInicial);

        // Procesar compra del cliente 2 con la cajera 2
        cajera2.procesarCompra(cliente2, tiempoInicial);
    }

    /**
     * Agrega productos a la lista de productos disponibles.
     *
     * @param productos La lista de productos a la cual se agregarán nuevos productos.
     */
    private static void setProductos(List<Producto> productos) {
        Producto producto1 = new Producto("Leche en polvo", 7000, 2);
        Producto producto2 = new Producto("Queso", 5000, 5);
        Producto producto3 = new Producto("Pan", 2000, 10);

        // Agregar productos a la lista de productos disponibles
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
    }
    
    // Catalina Vinasco
}
