package unlu.poo.administradorEjercicios;

import unlu.poo.tarea.AdministradorLista;
import unlu.poo.tarea.Estado;
import unlu.poo.tarea.Prioridad;
import unlu.poo.tarea.Tarea;

import java.time.LocalDate;

public class Ejercicio12 {

    public  Ejercicio12(){
        AdministradorLista lista = new AdministradorLista();


        Tarea tarea1= new Tarea("Ir al supermercado mañana", Estado.INCOMPLETA, Prioridad.BAJA,LocalDate.of(2025,2,7),LocalDate.of(2024,11,3));
        Tarea tarea2= new Tarea("Consultar repuesto del auto", Estado.COMPLETA, Prioridad.BAJA,LocalDate.of(2028,3,30),(LocalDate.now().minusDays(1)));
        Tarea tarea3= new Tarea("Ir al supermercado mañana", Estado.INCOMPLETA, Prioridad.MEDIA,LocalDate.of(2027,1,6),LocalDate.of(2027,1,4));
        Tarea tarea4= new Tarea("Comprar pan", Estado.INCOMPLETA, Prioridad.MEDIA,LocalDate.of(2026,5,5),LocalDate.of(24,10,7));
        Tarea tarea5= new Tarea("Ir a clases", Estado.INCOMPLETA, Prioridad.ALTA,LocalDate.of(2022,12,8),LocalDate.of(2022,11,7));


        System.out.println();

        // Test muestro tareas , primero muestro la tarea pq si esta por vencer me actualiza la prioridad
        System.out.println("TAREAS INGRESADAS PARA  TESTING");
        System.out.println();
        System.out.println("-----TAREA 1- "+tarea1);
        System.out.println( "Prioridad: "+tarea1.getPrioridad() +", Fecha Limite: "+ tarea1.getFechaLimite()+", Vencida: "+tarea1.estaVencida());
        System.out.println("-----TAREA 2- "+tarea2);
        System.out.println( "Prioridad: "+tarea2.getPrioridad() +", Fecha Limite: "+ tarea2.getFechaLimite()+", Vencida: "+tarea2.estaVencida());
        System.out.println("-----TAREA 3- "+tarea3);
        System.out.println( "Prioridad: "+tarea3.getPrioridad() +", Fecha Limite: "+ tarea3.getFechaLimite()+", Vencida: "+tarea3.estaVencida());
        System.out.println("-----TAREA 4- "+tarea4);
        System.out.println( "Prioridad: "+tarea4.getPrioridad() +", Fecha Limite: "+ tarea4.getFechaLimite()+", Vencida: "+tarea4.estaVencida());
        System.out.println("-----TAREA 5- "+tarea5);
        System.out.println( "Prioridad: "+tarea5.getPrioridad() +", Fecha Limite: "+ tarea5.getFechaLimite()+", Vencida: "+tarea5.estaVencida());



        System.out.println();


        lista.agregarTarea(tarea1);
        lista.agregarTarea(tarea2);
        lista.agregarTarea(tarea3);
        lista.agregarTarea(tarea4);
        lista.agregarTarea(tarea5);

        System.out.println("Busco tarea por descripcion: \"Ir al supermercado mañana\"");
        System.out.println(lista.buscarTarea("Ir al supermercado mañana"));
        System.out.println();
        System.out.println("Muestro tareas sin vencimiento, ordenadas por prioridad (mas alta a mas baja) y fecha (menor a mayor)");
        System.out.println(lista.getTareas());
    }
}
