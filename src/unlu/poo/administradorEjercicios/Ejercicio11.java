package unlu.poo.administradorEjercicios;

import unlu.poo.juego.Juego;

public class Ejercicio11 {

    public Ejercicio11(){
        Juego juegoAMedias= new Juego();



        juegoAMedias.agregarPalabraJugador("SOL",1);
        juegoAMedias.agregarPalabraJugador("Zebra",1);
        juegoAMedias.agregarPalabraJugador("kiWi",1);

        juegoAMedias.agregarPalabraJugador("SOL",2);
        juegoAMedias.agregarPalabraJugador("alegría",2);
        juegoAMedias.agregarPalabraJugador("banana",2);

        juegoAMedias.agregarPalabraJugador("P2323",2); // EJemplo de una palabra que no esta en Diccionario

        System.out.println(juegoAMedias.getJugadores());

        String ganador=juegoAMedias.calcularGanador();
        System.out.println("Resultado: ");
    }
}
