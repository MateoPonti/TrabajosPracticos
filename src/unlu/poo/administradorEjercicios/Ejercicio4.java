package unlu.poo.administradorEjercicios;



import unlu.poo.cola.Cola;

import java.util.Scanner;

public class Ejercicio4 {
    public Ejercicio4(){
        Cola cola = new Cola();
        boolean salir= false;
        Scanner sc = new Scanner(System.in);
        while (!salir){
            System.out.println("0- para salir");
            System.out.println("1-Encolar Dato");
            System.out.println("2-Desencolar Dato");
            System.out.println("3-Mostrar si esta Vacia");
            System.out.println("4- Mostrar cola");
            String option= sc.nextLine();
            switch (option) {
                case ("0") -> salir = true;
                case ("1") -> {
                    System.out.println("ingrese palabra:");
                    String palabra = sc.nextLine();
                    cola.encolar(palabra);
                    System.out.println("Dato encolado");
                }
                case ("2") -> {
                    Object dato= cola.desencolar();
                    if (!(dato==null)){ System.out.println("El dato desencolado es: "+dato);}
                    else {System.out.println("La cola esta Vacia.");}
                }
                case ("3") -> {
                    if (cola.estaVacia()) {
                        System.out.println("La cola se encuentra Vacia");
                    } else {
                        System.out.println("La cola no esta Vacia.");
                    }
                }
                case ("4") -> {
                    System.out.println(cola.mostrar());
                }
            }
            System.out.println("\n"+"PRESS ENTER");
            sc.nextLine();
            System.out.println();
        }
    }
}
