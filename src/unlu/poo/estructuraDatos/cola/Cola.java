package unlu.poo.estructuraDatos.cola;
import unlu.poo.estructuraDatos.nodo.NodoDoble;
public class Cola {
    private NodoDoble inicio;
    private NodoDoble fin;


    public boolean estaVacia(){
        return inicio==null;
    }

    public Object desencolar(){
        NodoDoble aux= inicio;
        if (!(aux ==null)){
            inicio=inicio.getProximo();
            if (!(inicio==null)){
                inicio.setAnterior(null);
            }
            return aux.getDato();        }
        return  null;
    }
    public void encolar(Object dato){
        NodoDoble aux=new NodoDoble();
        aux.setDato(dato);
        if (inicio==null){
            inicio=aux;
            fin=aux;
        }
        else{
            fin.setProximo(aux);
            aux.setAnterior(fin);
            fin=aux;
        }
    }

    public  String toString(){
        StringBuilder cadena= new StringBuilder();
        NodoDoble aux=inicio;
        // De manera sencilla lo hice como si mostrara una cola pero por naturaleza deberia ir encolando y desencolando hasta su tamaño (asi se autorecorre y puede mostrar los valores)
        while(aux!=null){
            cadena.append(aux.getDato()).append("\n");
            aux=aux.getProximo();
        }
        return cadena.toString();

    }



}
