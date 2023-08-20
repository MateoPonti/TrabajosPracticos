package unlu.poo.lista.simple;

import unlu.poo.nodo.Nodo;

public class Lista {
    private Nodo proximo;
    private int items;

    public void agregar(Object valor){
        Nodo nodoAux= proximo;
        while (!(nodoAux==null)){
            nodoAux=nodoAux.getProximo();
        }
        nodoAux.setDato(proximo);
        items++;
    }


    public void eliminar(int posicion){
        if (proximo!=null){
            posicion--;
            if (posicion==0){proximo=proximo.getProximo();
                items--;}
            else {
            int contador=0;
            Nodo nodoAux= proximo;
            while((contador<posicion-1) && (nodoAux!=null)){nodoAux=nodoAux.getProximo();}
            if (contador==posicion-1){
             nodoAux.setProximo(nodoAux.getProximo().getProximo());
             contador++;
             items--;
              }
            }
        }
    }

    public int getItems() {
        return items;
    }
}
