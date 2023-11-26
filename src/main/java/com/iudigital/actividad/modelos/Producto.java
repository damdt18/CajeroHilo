package com.iudigital.actividad.modelos;

/**
 * Clase que representa un producto.
 */
public class Producto {

    private String nombre;
    private float precio;
    private int cantidad;

    /**
     * Constructor de Producto.
     *
     * @param nombre   El nombre del producto.
     * @param precio   El precio del producto.
     * @param cantidad La cantidad disponible del producto.
     */
    public Producto(String nombre, float precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el nombre del producto.
     *
     * @return El nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del producto.
     *
     * @param nombre El nombre del producto a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el precio del producto.
     *
     * @return El precio del producto.
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto.
     *
     * @param precio El precio del producto a establecer.
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * Obtiene la cantidad disponible del producto.
     *
     * @return La cantidad disponible del producto.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad disponible del producto.
     *
     * @param cantidad La cantidad disponible del producto a establecer.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
