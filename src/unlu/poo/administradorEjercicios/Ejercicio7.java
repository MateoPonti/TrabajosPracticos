package unlu.poo.administradorEjercicios;

import unlu.poo.ecuacion.EcuacionGradoDos;

public class Ejercicio7 {
    public Ejercicio7(){
        EcuacionGradoDos ecuacion = new EcuacionGradoDos(1,1,1);
        System.out.println(ecuacion);
        System.out.println();
        System.out.println("Raices: "+ ecuacion.calcularRaiz());
        System.out.println();
        System.out.println("Si x vale 2");
        System.out.println("El resultado de Y de la ecuacion "+ecuacion+" es : "+ecuacion.resolverEcuacion(4));
        System.out.println();

        ecuacion = new EcuacionGradoDos(2,4,2);
        System.out.println(ecuacion);
        System.out.println();
        System.out.println("Raices: "+ ecuacion.calcularRaiz());
        System.out.println();
        System.out.println("Si x vale 3");
        System.out.println("El resultado de Y de la ecuacion "+ecuacion+" es : "+ecuacion.resolverEcuacion(3));
        System.out.println();

        ecuacion = new EcuacionGradoDos(2,-2,0);
        System.out.println(ecuacion);
        System.out.println();
        System.out.println("Raices: "+ ecuacion.calcularRaiz());
        System.out.println();
        System.out.println("Si X vale 0");
        System.out.println("El resultado de Y de la ecuacion "+ecuacion+" es : "+ecuacion.resolverEcuacion(0));
        System.out.println();





    }
}
