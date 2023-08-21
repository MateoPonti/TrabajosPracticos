package main;
import unlu.poo.lista.simple.Lista;
import unlu.poo.pila.Pila;

import  java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        arrancarBucle();

    }

    private static void dejarEspacio()  {
        System.out.println();
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
        System.out.println("-ingrese el numero segun que ejercicio quiere (1-13)");
        System.out.println("-ingrese 0 para salir");
    }
    private static void mostrarEjercicio1(){
        Lista lista= new Lista();
        boolean salir= false;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresar posiciones ordinales, arranca desde el 1");
        while (!salir){
            System.out.println("0 para salir");
            System.out.println("1-Agregar Dato a la Lista");
            System.out.println("2-Eliminar Dato");
            System.out.println("3-Insertar Dato");
            System.out.println("4-Mostrar Cantidad de Elementos");
            System.out.println("5-Mostrar Elemento");
            System.out.println("6-Mostrar si esta Vacia");
            System.out.println("7-Mostrar Lista");
            String option= sc.nextLine();
            switch (option) {
                case ("0") -> salir = true;
                case ("1") -> {
                    System.out.println("ingrese palabra:");
                    String palabra = sc.nextLine();
                    lista.agregar(palabra);
                    System.out.println("Dato agregado");
                }
                case ("2") -> {
                    if (lista.estaVacia()) {
                        System.out.println("La Lista ya se encuentra vacia.");
                    } else {
                        System.out.println("ingrese posicion a eliminar:");
                        int posicion = sc.nextInt();
                        if (lista.eliminar(posicion)){
                            System.out.println("Eliminado correctamente");
                        }
                        else{
                            System.out.println("No se pudo eliminar, fijese que sea una posicion valida o la lista no este vacia.");
                        }
                    }
                }
                case ("3") -> {
                    System.out.println("ingrese palabra:");
                    String palabra = sc.nextLine();
                    System.out.println("ingrese posicion:");
                    int posicion= sc.nextInt();
                    if (lista.insertar(posicion,palabra)){
                        System.out.println(palabra + " insertado Correctamente.");
                    }
                    else {
                        System.out.println("No se pudo insertar, fijese que sea una posicion valida o la lista no este vacia.");
                    }
                    System.out.println();
                }
                case ("4") -> System.out.println("La cantidad de elementos de la lista es : "+lista.getItems());
                case ("5") -> {
                    System.out.println("ingrese posicion:");
                    int posicion= sc.nextInt();
                    Object dato=lista.getElemento(posicion);
                    if (dato!=null){
                        System.out.println("El elemento de la posicion "+posicion+" es "+ dato);
                    }
                    else {
                        System.out.println("Elemento nulo o posicion invalida.");
                    }
                }
                case ("6") -> {
                    if (lista.estaVacia()) {
                        System.out.println("La lista se encuentra Vacia");
                    } else {
                        System.out.println("La lista no esta Vacia.");
                    }
                }
                case ("7") -> {
                    System.out.println("La lista es:");
                    System.out.println(lista);
                }
            }
            dejarEspacio();
        }
        lista=null;// la dejo de apuntar asi deja de estar en memoria
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
