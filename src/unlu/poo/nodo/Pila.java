package unlu.poo.nodo;

import unlu.poo.pila.Nodo;

public class Pila {
    private Nodo tope=null;

    public Pila() {}

    public Object getTope() {
        if (!estaVacia()){return tope.getDato();}
        return "Pila Vacia";
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

    public void desapilar(){
        if (!estaVacia()){
            tope=tope.getProximo();
        }
    }

    public boolean estaVacia(){
        return tope==null;
    }

}