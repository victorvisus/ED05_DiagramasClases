/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cypherestudios.clases;
import java.util.ArrayList;

public interface IAlmacen {

    ArrayList<Articulo> productos = new ArrayList<>();

    public abstract void almacenarArticulo(Articulo producto);

}
