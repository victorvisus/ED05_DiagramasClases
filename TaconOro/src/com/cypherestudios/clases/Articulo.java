/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cypherestudios.clases;

/**
 *
 * @author Victor
 */
public class Articulo implements IAlmacen {

    private int refArt;
    private String nombreArt;
    private double precio;
    private int stock;
    private boolean disponible;
    private int contador = 0;

    public Articulo(String nombreArt, double precio, int stock) {
        this.nombreArt = nombreArt;
        this.precio = precio;
        this.stock = stock;
        this.refArt = ++contador;

        if (this.stock > 0) {
            this.disponible = true;
            almacenarArticulo(this);

        } else {
            this.disponible = false;
            System.out.println("El articulo no tiene stock y no va a ser almacenado");
        }
    }

    @Override
    public void almacenarArticulo(Articulo producto) {
        productos.add(this);
    }

}
