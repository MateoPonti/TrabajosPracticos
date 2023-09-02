package unlu.poo.administradorEjercicios;

import unlu.poo.fecha.Fecha;

import java.time.LocalDate;

public class Ejercicio9 {

    public Ejercicio9(){
        LocalDate fecha1= Fecha.devolverFecha("01-11-2017");
        LocalDate fecha2= Fecha.devolverFecha("02-12-2014");
        LocalDate fecha3= Fecha.devolverFecha("22-02-2022");
        LocalDate fecha4= Fecha.devolverFecha("33-33-33"); // ejemplo de fecha que no ande

        System.out.println("Fecha 1 formato dd-MM-yyyy: 01-11-2017 "+ " objeto : "+fecha1);
        System.out.println("Fecha 2 formato dd-MM-yyyy: 02-12-2014 "+ " objeto : "+fecha2);
        System.out.println("Fecha 3 formato MM-dd-yyyy: 22-02-2022 "+ " objeto : "+fecha3);
        System.out.println("Fecha 4 sin formato: 33-33-33 "+ " objeto : "+fecha4);


        System.out.println();
        if (Fecha.esMayor(fecha1,fecha2)){
            System.out.println(fecha1+ " es mayor que la fecha "+fecha2);
        }
        else {
            System.out.println(fecha2+ " es mayor que la fecha "+fecha1);
        }
        System.out.println();

        if (Fecha.esMenor(fecha1,fecha2)){
            System.out.println(fecha1+ " es menor que la fecha "+fecha2);
        }
        else {
            System.out.println(fecha2+ " es menor que la fecha "+fecha1);
        }
        System.out.println();

        if (Fecha.estaEntre(fecha1,fecha2,fecha3)){
            System.out.println("la fecha "+fecha1+" esta entre la fecha "+fecha2+" y la fecha "+fecha3+".");
        }
        else {
            System.out.println("la fecha "+fecha1+" no esta entre la fecha "+fecha2+" y la fecha "+fecha3+".");
        }
    }
}
