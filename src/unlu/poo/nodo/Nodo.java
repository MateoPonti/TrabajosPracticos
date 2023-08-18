package unlu.poo.nodo;

public class Nodo {
    private Object dato=null;
    private Nodo proximo=null;

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }

    public Nodo getProximo() {
        return proximo;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }



}