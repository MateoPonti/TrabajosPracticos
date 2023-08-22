package main;
import unlu.poo.administradorEjercicios.Ejercicio1;
import unlu.poo.administradorEjercicios.Ejercicio2;
import unlu.poo.administradorEjercicios.Ejercicio3;


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
                case ("1") -> mostrarEjercicio1();
                case ("2") -> mostrarEjercicio2();
                case ("3") -> mostrarEjercicio3();
                default -> System.out.println("No existe esa Opcion.");
            }
            System.out.println();
    }
    }
    private static void mostrarMenu(){
        System.out.println("-ingrese el numero segun que ejercicio quiere (1-13)");
        System.out.println("-ingrese 0 para salir");
    }
    private static void mostrarEjercicio1(){
         new Ejercicio1();
    }

    private static void mostrarEjercicio2(){
        new Ejercicio2();
    }

    private static void mostrarEjercicio3(){
        new Ejercicio3();
}

}
