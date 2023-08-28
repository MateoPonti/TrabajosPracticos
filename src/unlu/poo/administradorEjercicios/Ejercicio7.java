package unlu.poo.administradorEjercicios;

import unlu.poo.ecuacion.EcuacionGradoDos;

public class Ejercicio7 {
    public Ejercicio7(){
        EcuacionGradoDos ecuacion = new EcuacionGradoDos(2,1,-5);
        System.out.println(ecuacion);
        System.out.println();
        System.out.println("Raices: "+ ecuacion.calcularRaiz());
        System.out.println();
        System.out.println("Si x vale 3");
        System.out.println("El resultado de Y de la ecuacion "+ecuacion+" es : "+ecuacion.resolverEcuacion(3));

    }
}
