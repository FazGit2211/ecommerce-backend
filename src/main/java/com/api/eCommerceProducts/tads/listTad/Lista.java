package com.api.eCommerceProducts.tads.listTad;

public class Lista {
    Nodo primero;

    // Métodos
    public void crearLista() {
        primero = null;
    }

    public Nodo insertarNodo(Nodo nodo){
        if(primero.getEnlace() == null){
            primero.setDato(nodo.getDato());
            primero.setEnlace(nodo);
        }else{
            nodo.setEnlace(primero);
            primero = nodo;
        }
        return primero;
    }
}
