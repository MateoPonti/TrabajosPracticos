package unlu.poo.administradorEjercicios;

import unlu.poo.Tarea.Estado;
import unlu.poo.Tarea.Prioridad;
import unlu.poo.Tarea.Tarea;

import java.time.LocalDate;

public class Ejercicio10 {

    public Ejercicio10(){

        LocalDate fechaLim1= LocalDate.of(2022,12,6);
        LocalDate fechaRecord1= LocalDate.of(2022,11,7);
        Tarea tarea1= new Tarea("Comprar Chocolate", Estado.INCOMPLETA, Prioridad.ALTA,fechaLim1,fechaRecord1);
        System.out.println("Descripcion : "+tarea1+" , Fecha Limite : "+tarea1.getFechaLimite()+" , Fecha Recordatorio : "+tarea1.getFechaRecordatorio()+" , Estado:"+tarea1.getEstado());


        fechaLim1= LocalDate.now().plusDays(1);
        fechaRecord1= LocalDate.now().minusDays(1);
        tarea1= new Tarea("Ir de Compras", Estado.COMPLETA, Prioridad.BAJA,fechaLim1,fechaRecord1);
        System.out.println("Descripcion : "+tarea1+" , Fecha Limite : "+tarea1.getFechaLimite()+" , Fecha Recordatorio : "+tarea1.getFechaRecordatorio()+" , Estado:"+tarea1.getEstado());



    }
}
