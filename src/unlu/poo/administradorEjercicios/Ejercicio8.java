package unlu.poo.administradorEjercicios;

import unlu.poo.password.AdmnistradorContra;
import unlu.poo.password.Password;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {
    public  Ejercicio8(){
       AdmnistradorContra contras= new AdmnistradorContra();

        boolean salir=false;
        Scanner sc = new Scanner(System.in);
        while (!salir){
            System.out.println("0- para salir");
            System.out.println("1- agregar longitud contraseña");
            System.out.println("2- mostrar contraseñas");
            System.out.println("3- Ejemplo de Fecha para regenerar");
            String option= sc.nextLine();
            switch (option) {
                case ("0") -> salir = true;
                case ("1") -> {
                    int val= tomarDato();
                    if (val!=-1){
                        System.out.println("si la longitud no es mayor a 0, se creara por default con 8");
                        contras.agregarContra(val);
                    }
                }
                case ("2") -> {
                    String contrasStr= contras.mostrarContras();
                    System.out.println(contrasStr);
                }
                case ("3") -> {
                    Password contraDebil= new Password();
                    while ((contraDebil.esContraFuerte())){
                        contraDebil= new Password(); // Hago una contra debil para asegurar como ejemplo
                    }
                    System.out.println(contraDebil.esContraFuerte());
                    System.out.println("La contra debil es: "+ contraDebil);
                    System.out.println();
                    contraDebil.regenerarContraFuerte();
                    System.out.println("Regenerado queda: "+contraDebil);

                }
            }
            System.out.println();
            System.out.println();
            System.out.println();
        }}
    private int tomarDato(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la longitud de la contraseña: ");
        String longitud = scanner.nextLine();
        try {
            return Integer.parseInt(longitud);
        }
        catch (NumberFormatException e){System.out.println("El dato no es entero");}
        return -1;
    }

}
