package unlu.poo.administradorEjercicios;

import unlu.poo.Tarea.Estado;
import unlu.poo.Tarea.Prioridad;
import unlu.poo.Tarea.Tarea;

import java.time.LocalDate;

public class Ejercicio5 {
    public Ejercicio5(){

        LocalDate fecha1= LocalDate.of(2001,10,23);
        LocalDate fecha2= LocalDate.now().minusDays(1);
        Tarea tarea1= new Tarea("Ir al supermercado mañana", Estado.INCOMPLETA, Prioridad.ALTA,fecha1,null);
        Tarea tarea2= new Tarea("Consultar repuesto del auto", Estado.COMPLETA, Prioridad.BAJA,fecha2,null);
        Tarea tarea3= new Tarea("Ir al supermercado mañana", Estado.INCOMPLETA, Prioridad.MEDIA,fecha2,null);


        System.out.println("Descripcion : "+tarea1+" , Fecha Limite : "+tarea1.getFechaLimite()+" , Estado:"+tarea1.getEstado());
        System.out.println("Descripcion : "+tarea2+" , Fecha Limite : "+tarea2.getFechaLimite()+" , Estado:"+tarea2.getEstado());
        System.out.println("Descripcion : "+tarea3+" , Fecha Limite : "+tarea3.getFechaLimite()+" , Estado:"+tarea3.getEstado());


    }
}
