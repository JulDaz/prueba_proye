/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sergio.mundo.vo;

/**
 *
 * @author crist
 */
public class Producto {
    private int id;
    private char[] descripcion;
    private int cantidad;
    private int valor;

    public Producto(int id, char[] descripcion, int cantidad, int valor) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char[] getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(char[] descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

  
}
