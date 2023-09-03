package unlu.poo.administradorEjercicios;

import unlu.poo.juego.Juego;

public class Ejercicio11 {

    public Ejercicio11(){
        Juego juegoAMedias= new Juego();



        juegoAMedias.agregarPalabraJugador("Perro",1);


        System.out.println(juegoAMedias.getJugadores());


    }
}
