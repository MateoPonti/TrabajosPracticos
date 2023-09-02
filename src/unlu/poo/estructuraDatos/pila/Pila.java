package unlu.poo.estructuraDatos.pila;

import unlu.poo.estructuraDatos.nodo.Nodo;

public class Pila {
    private Nodo tope;

    public Pila() {}

    public Object getTope() {
        if (!estaVacia()){return tope.getDato();}
        return null;
    }

    public void apilar(Object dato) {
        Nodo nodoAux=new Nodo();
        nodoAux.setDato(dato);
        if(estaVacia()){
            tope=nodoAux;
        }
        else{
            nodoAux.setProximo(tope);
            tope=nodoAux;
        }
    }

    public Object desapilar(){
        if (!estaVacia()){
            tope=tope.getProximo();
        }
        return getTope();
    }

    public boolean estaVacia(){
        return tope==null;
    }

}