package unlu.poo.administradorEjercicios;

import unlu.poo.pila.Pila;

import java.util.Scanner;

public class Ejercicio3 {
    private  Pila pila= new Pila();
     public Ejercicio3(){
     boolean salir= false;
     Scanner sc = new Scanner(System.in);
     while (!salir){
         System.out.println("0- para salir");
        System.out.println("1-Apilar Dato");
        System.out.println("2-Desapilar Dato");
        System.out.println("3-Mostrar Tope");
        System.out.println("4-Mostrar si esta Vacia");
        String option= sc.nextLine();
        switch (option) {
            case ("0") -> salir = true;
            case ("1") -> {
                System.out.println("ingrese palabra:");
                String palabra = sc.nextLine();
                pila.apilar(palabra);
            }
            case ("2") -> {
                if (pila.estaVacia()) {
                    System.out.println("La pila ya se encuentra vacia.");
                } else {
                    pila.desapilar();
                    System.out.println("Desapilado correctamente");
                }
            }
            case ("3") -> System.out.println(pila.getTope());
            case ("4") -> {
                if (pila.estaVacia()) {
                    System.out.println("La pila se encuentra Vacia");
                } else {
                    System.out.println("La pila no esta Vacia.");
                }
            }
        }
        System.out.println("\n"+"PRESS ENTER");
        String palabra = sc.nextLine();
        System.out.println();
    }
    }
}
