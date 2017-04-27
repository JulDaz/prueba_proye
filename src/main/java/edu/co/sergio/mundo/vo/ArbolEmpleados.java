/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sergio.mundo.vo;

import java.util.TreeMap;

/**
 *
 * @author crist
 */
public class ArbolEmpleados {
    public static TreeMap<Integer, Long> arbol2 = new TreeMap<>();

    public void Ingresar(int numero, long posicion) {
        arbol2.put(numero, posicion);
    }

    public void ListarArbol() {
        arbol2.entrySet().stream().map((ent) -> ent.getValue()).forEachOrdered((p) -> {
            System.out.println(p);
        });
    }

    public long Buscar(int id) {
        long valor = 0;
        if (arbol2.containsKey(id) == true) {
            valor = arbol2.get(id);
        }
        return valor;
    }

    public boolean Existencia(int id) {
        boolean respues;
        respues = arbol2.containsKey(id) == true;
        return respues;
    }
}
