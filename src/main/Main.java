package main;
import unlu.poo.lista.simple.Lista;
import unlu.poo.pila.Pila;

import  java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        arrancarBucle();

    }

    private static void dejarEspacio()  {
        System.out.println("     ");
        System.out.println("     ");
        System.out.println("     ");
    }


    private static void arrancarBucle(){
        Scanner sc = new Scanner(System.in);
        boolean bucle=true;

        while (bucle){
            mostrarMenu();
            String option= sc.nextLine();
            switch (option) {
                case ("0") -> bucle = false;
                case ("1") -> mostrarEjercicio1();
                case ("3") -> mostrarEjercicio3();
                default -> System.out.println("No existe esa Opcion.");
            }
            dejarEspacio();
    }
    }
    private static void mostrarMenu(){
        System.out.println("-ingrese el numero segun que ejercicio quiere (1-17)");
        System.out.println("-ingrese 0 para salir");
    }
    private static void mostrarEjercicio1(){
        Lista lista= new Lista();



    }
    private static void mostrarEjercicio3(){
        Pila pila= new Pila();
        boolean salir= false;
        Scanner sc = new Scanner(System.in);
        while (!salir){
            System.out.println("0 para salir");
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
            dejarEspacio();
    }
   pila=null;// la dejo de apuntar asi deja de estar en memoria

}






}
