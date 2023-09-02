package unlu.poo.fecha;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

public class Fecha {

    public static LocalDate devolverFecha(String fecha ){
        LocalDate fechaObj = null;
        ArrayList<DateTimeFormatter> formatos=  new ArrayList<DateTimeFormatter>();
        formatos.add(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        formatos.add(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        for (DateTimeFormatter formato: formatos){
            try{
                fechaObj= LocalDate.parse(fecha, formato);
                break;
            }
            catch (DateTimeParseException e){}}
        return  fechaObj;
    }


    public static  boolean estaEntre(LocalDate fecha,LocalDate fechaAnterior, LocalDate fechaDespues ){
        return esMayor(fecha,fechaAnterior) && esMenor(fecha,fechaDespues);
    }
    public static boolean esMayor(LocalDate fecha,LocalDate fecha2){
        return fecha.isAfter(fecha2);
    }
    public static boolean esMenor(LocalDate fecha,LocalDate fecha2){
        return fecha.isBefore(fecha2);
    }
}
