package unlu.poo.nodo;

public class NodoDoble {
    private Object dato=null;
    private NodoDoble proximo=null;
    private NodoDoble anterior=null;

    public void setProximo(NodoDoble proximo) {
        this.proximo = proximo;
    }

    public NodoDoble getProximo() {
        return proximo;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }


    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }
}