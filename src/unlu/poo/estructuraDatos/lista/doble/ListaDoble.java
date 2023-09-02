package unlu.poo.estructuraDatos.lista.doble;

import unlu.poo.estructuraDatos.nodo.NodoDoble;

public class ListaDoble {
    private NodoDoble inicio;
    private int items;

    public void agregar(Object valor){
        NodoDoble nodoNuevo= new NodoDoble();
        nodoNuevo.setDato(valor);
        if (inicio==null){
            inicio=nodoNuevo;
            items++;}
        else {
            NodoDoble nodoAux= inicio;
            while (nodoAux.getProximo()!=null){
                nodoAux=nodoAux.getProximo();
            }
            nodoAux.setProximo(nodoNuevo);
            nodoNuevo.setAnterior(nodoAux);
            items++;}
    }


    public boolean eliminar(int posicion){
        if ((inicio!=null)&&( (posicion>=1)&&(posicion<=items)) ){
            posicion--;
            if (posicion==0){
                inicio=inicio.getProximo();
                if (inicio!=null){inicio.setAnterior(null);}
                items--;
            }
            else {
                int contador=0;
                NodoDoble nodoAux= inicio;
                while(contador<posicion-1){
                    nodoAux=nodoAux.getProximo();
                    contador++;}

                if (nodoAux.getProximo().getProximo()!=null){
                    nodoAux.setProximo(nodoAux.getProximo().getProximo());
                    nodoAux.getProximo().setAnterior(nodoAux);
                }
                else{
                    nodoAux.setProximo(null);
                }
                items--;
            }
            return  true;
        }
        return false;

    }

    public int getItems() {
        return items;
    }

    public boolean estaVacia(){
        return inicio==null; // se puede hacer tambien comparando a items con 0
    }

    public Object getElemento(int posicion){
        if ((inicio!=null)&&( (posicion>=1)&&(posicion<=items)) ){
            if (1 == posicion){return  inicio.getDato();}
            else {
                int contador=0;
                NodoDoble nodoAux= inicio;
                while(contador<posicion-1){
                    nodoAux=nodoAux.getProximo();
                    contador++;}
                return  nodoAux.getDato();
            }
        }
        return null;
    }

    public boolean insertar(int posicion, Object dato){
        if ((posicion>=1)&&(posicion<=items+1)){
            items++;
            if (inicio==null){
                agregar(dato);
                items--;
            }
            else {
                NodoDoble nodoNuevo= new NodoDoble();
                nodoNuevo.setDato(dato);
                if (posicion==1)
                {
                    nodoNuevo.setProximo(inicio);
                    inicio.setAnterior(nodoNuevo);
                    inicio=nodoNuevo;
                }
                else {
                    int contador=0;
                    NodoDoble nodoAux= inicio;
                    while(contador<posicion-2){
                        nodoAux=nodoAux.getProximo();
                        contador++;}
                    nodoNuevo.setProximo(nodoAux.getProximo());
                    nodoAux.getProximo().setAnterior(nodoNuevo);
                    nodoAux.setProximo(nodoNuevo);
                }
            }
            return  true;
        }
        return false;
    }

    public boolean eliminarFinal(){
        return eliminar(items);
    }
    public String toString(){
        NodoDoble nodoAux= inicio;
        StringBuilder val= new StringBuilder();
        while (nodoAux!=null){
            val.append(nodoAux.getDato().toString()).append("\n");
            nodoAux=nodoAux.getProximo();
        }
        return val.toString();
    }
}
