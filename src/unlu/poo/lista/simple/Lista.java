package unlu.poo.lista.simple;

import unlu.poo.nodo.Nodo;

public class Lista {
    private Nodo inicio;
    private int items;

    public void agregar(Object valor){
        Nodo nodoAux= inicio;
        while (nodoAux.getProximo()!=null){
            nodoAux=nodoAux.getProximo();
        }
        Nodo nodoNuevo= new Nodo();
        nodoNuevo.setDato(valor);
        nodoAux.setProximo(nodoNuevo);
        items++;
    }


    public void eliminar(int posicion){
        if (inicio!=null){
            posicion--;
            if (posicion==0){inicio=inicio.getProximo();
                items--;}
            else {
            int contador=0;
            Nodo nodoAux= inicio;
            while((contador<posicion-1) && (nodoAux!=null)){nodoAux=nodoAux.getProximo();}
            if ((contador==posicion-1) && (nodoAux!=null)){
              if (nodoAux.getProximo()!=null){nodoAux.setProximo(nodoAux.getProximo().getProximo());}
              contador++;
              items--;
              }
            }
        }
    }

    public int getItems() {
        return items;
    }

    public boolean estaVacia(){
        return inicio==null; // se puede hacer tambien comparando a items con 0
    }

    public Object getElemento(int Posicion){


    }

    public void insertar(int posicion){


    }
}
