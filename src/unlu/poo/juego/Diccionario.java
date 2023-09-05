package unlu.poo.juego;

import java.util.ArrayList;

public class Diccionario {
    private ArrayList<Palabra> palabras;


    public Diccionario(){
        palabras= new ArrayList<>();
    }

    public boolean agregarPalabra(String palabra) {
        if  (!estaPalabra(palabra)) {
        palabras.add(new Palabra(palabra));
        return  true;}
        return false;
    }

    public boolean estaPalabra(String palabra){
        Palabra nuevaPalabra= new Palabra(palabra);
        for(Palabra p: palabras){
           if (p.equals(nuevaPalabra)) {return  true;}
           }
        return false;
    }


}
