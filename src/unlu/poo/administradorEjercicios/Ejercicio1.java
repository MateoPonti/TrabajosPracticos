package unlu.poo.administradorEjercicios;

import unlu.poo.lista.simple.Lista;

import java.util.Scanner;

public class Ejercicio1 {
    private Lista lista= null;
    public Ejercicio1(){
        lista= new Lista();
        boolean salir= false;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresar posiciones ordinales, arranca desde el 1");
        boolean entradaValida;
        while (!salir){
            System.out.println("0 para salir");
            System.out.println("1-Agregar Dato a la Lista");
            System.out.println("2-Eliminar Dato");
            System.out.println("3-Insertar Dato");
            System.out.println("4-Mostrar Cantidad de Elementos");
            System.out.println("5-Mostrar Elemento");
            System.out.println("6-Mostrar si esta Vacia");
            System.out.println("7-Mostrar Lista");
            System.out.println("8-Eliminar Al Final");
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
                        int posicion = -1;
                        entradaValida=false;
                        while (!entradaValida) {
                            String input = sc.nextLine();
                            try {
                                posicion = Integer.parseInt(input);
                                entradaValida = true;  // La entrada es un entero válido, salimos del bucle
                            } catch (NumberFormatException e) {
                                System.out.println("Error: Ingresa un valor entero válido.");
                            }
                        }
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
                    entradaValida = false;
                    int posicion=-1 ;
                    while (!entradaValida) {
                        String input = sc.nextLine();
                        try {
                            posicion = Integer.parseInt(input);
                            entradaValida = true;  // La entrada es un entero válido, salimos del bucle
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Ingresa un valor entero válido.");
                        }
                    }

                    if (lista.insertar(posicion,palabra)){
                        System.out.println(palabra + " insertado Correctamente en la posicion "+posicion+".");
                    }
                    else {
                        System.out.println("No se pudo insertar, fijese que sea una posicion valida o la lista no este vacia.");
                    }
                    System.out.println();
                }
                case ("4") -> System.out.println("La cantidad de elementos de la lista es : "+lista.getItems());
                case ("5") -> {
                    System.out.println("ingrese posicion:");
                    entradaValida = false;
                    int posicion = -1;
                    while (!entradaValida) {
                        String input = sc.nextLine();
                        try {
                            posicion = Integer.parseInt(input);
                            entradaValida = true;  // La entrada es un entero válido, salimos del bucle
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Ingresa un valor entero válido.");
                        }
                        Object dato=lista.getElemento(posicion);
                        if (dato!=null){
                            System.out.println("El elemento de la posicion "+posicion+" es "+ dato);
                        }
                        else {
                            System.out.println("Elemento nulo o posicion invalida.");
                        }
                    }}
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
                case ("8") -> {
                    if (lista.eliminarFinal()){
                        System.out.println("Eliminado correctamente.");
                    }
                    else {
                        System.out.println("La lista esta vacia.");
                    }
                }
            }
            System.out.println("\n"+"PRESS ENTER");
            sc.nextLine();
            System.out.println();

        }
    }

}
