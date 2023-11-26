package com.iudigital.actividad.modelos;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un cliente y sus productos comprados.
 */
public class ClienteProducto {

    private final String nombre;
    private final List<Producto> productos;

    /**
     * Constructor de ClienteProducto.
     *
     * @param nombre El nombre del cliente.
     */
    public ClienteProducto(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la lista de productos del cliente.
     *
     * @return La lista de productos del cliente.
     */
    public List<Producto> getProductos() {
        return productos;
    }

    /**
     * Agrega un producto al carrito del cliente.
     *
     * @param producto El producto a agregar.
     */
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        
  
    }
}
