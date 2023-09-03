package unlu.poo.juego;

import java.util.ArrayList;

public class Diccionario {
    private ArrayList<Palabra> palabras;


    public Diccionario(){
        palabras= new ArrayList<>();
    }

    public void agregarPalabra(String palabra) {
        palabras.add(new Palabra(palabra));
    }

    public boolean estaPalabra(String palabra){
        Palabra nuevaPalabra= new Palabra(palabra);
        for(Palabra p: palabras){
           if (p.equals(nuevaPalabra)) {return  true;}
           }
        return false;
    }


}
