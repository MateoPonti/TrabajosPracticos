package unlu.poo.juego;

import java.util.ArrayList;

public class Diccionario {
    private ArrayList<Palabra> palabras;


    public Diccionario(){
        palabras=new ArrayList<Palabra>();
    }

    public void agregarPalabra(Palabra palabra) {
        palabras.add(palabra);
    }
}
