package main;
import unlu.poo.administradorEjercicios.Ejercicio1;
import unlu.poo.administradorEjercicios.Ejercicio2;
import unlu.poo.administradorEjercicios.Ejercicio3;
import unlu.poo.administradorEjercicios.Ejercicio4;


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
            String option= sc.nextLine();
            switch (option) {
                case ("0") -> bucle = false;
                case ("1") -> new Ejercicio1();
                case ("2") -> new Ejercicio2();
                case ("3") -> new Ejercicio3();
                case ("4") -> new Ejercicio4();
                default -> System.out.println("No existe esa Opcion.");
            }
            System.out.println();
    }
    }
    private static void mostrarMenu(){
        System.out.println("-ingrese el numero segun que ejercicio quiere (1-13)");
        System.out.println("-ingrese 0 para salir");
    }

}
