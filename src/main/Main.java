package main;
import unlu.poo.pila.Pila;

import java.util.Locale;
import  java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        arrancarBucle();

    }

    private static void arrancarBucle(){
        Scanner sc = new Scanner(System.in);
        boolean bucle=true;

        while (bucle){
            mostrarMenu();
            String option= sc.nextLine().toUpperCase(Locale.ROOT);
            switch (option) {
                case ("0") -> bucle = false;
                case ("1") -> mostrarEjercicio1();
                case ("3") -> mostrarEjercicio3();
                default -> System.out.println("No existe esa Opcion.");
            }

            System.out.println("   ");
            System.out.println("   ");
            System.out.println("   ");

    }
    }
    private static void mostrarMenu(){
        System.out.println("-ingrese el numero segun que ejercicio quiere (1-17)");
        System.out.println("-ingrese 0 para salir");
    }
    private static void mostrarEjercicio1(){


    }
    private static void mostrarEjercicio3(){
        Pila pila= new Pila();
        System.out.println("Ejercicio 3:");
        pila.apilar("Hola");
        pila.apilar("Mundo");
        pila.apilar("!");

        pila.desapilar();

        System.out.println(pila.getTope());
        // Espero "Mundo"

        pila.desapilar();
        System.out.println(pila.getTope());
        // Espero "Hola"

        pila.desapilar();
        System.out.println(pila.getTope());
        // Espero "Pila Vacia"


        pila.apilar("a");
        System.out.println(pila.getTope());
        // Espero "a"
        pila.apilar(3);
        System.out.println(pila.getTope());
        //Espero "3"

        pila.desapilar();
        pila.desapilar();
        pila.desapilar();
        pila.desapilar();
        // Espero que este vacia y que no haya producido algun error.
        System.out.println(pila.getTope());

    }
}
