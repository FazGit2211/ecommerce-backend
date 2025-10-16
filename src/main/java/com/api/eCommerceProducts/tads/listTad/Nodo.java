package com.api.eCommerceProducts.tads.listTad;

public class Nodo {
    private int dato;
    private Nodo enlace;

    // constructor
    public Nodo(int valor) {
        this.dato = valor;
        this.enlace = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }

}
