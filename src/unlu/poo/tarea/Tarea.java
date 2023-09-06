package unlu.poo.tarea;

import java.time.LocalDate;

public class Tarea {
    private Estado estado;
    private Prioridad prioridad;
    private LocalDate fechaLimite;
    private LocalDate fechaRecordatorio;

    private LocalDate fechaFinalizacion;
    private String descripcion;



    public Tarea(String descripcion,Estado estado,Prioridad prioridad,LocalDate fechaLimite,LocalDate fechaRecordatorio){
        this.descripcion=descripcion;
        this.estado=estado;
        this.prioridad=prioridad;
        this.fechaLimite=fechaLimite;
        this.fechaRecordatorio=fechaRecordatorio;
    }


    public boolean finalizar() {
        if (this.estado==Estado.INCOMPLETA){
            this.estado = Estado.COMPLETA;
            fechaFinalizacion=LocalDate.now();
            return true;
        }
        return  false;
    }
    public Estado getEstado() {return estado;}


    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }
    public Prioridad getPrioridad() {
        return prioridad;
    }



    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }
    public LocalDate getFechaLimite() {
        return fechaLimite;
    }


    public void setFechaRecordatorio(LocalDate fechaRecordatorio) {
        this.fechaRecordatorio = fechaRecordatorio;
    }
    public LocalDate getFechaRecordatorio() {
        return fechaRecordatorio;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getDescripcion() {
        return descripcion;
    }


    public boolean estaCompleta() {
        return  this.estado==Estado.COMPLETA;
    }
    public boolean estaVencida() {
        return  ((this.estado==Estado.INCOMPLETA) && ( ((fechaLimite.isBefore(LocalDate.now())))));
    }

    @Override
    public String toString() {
        String res= "";
        if (estaVencida()){res+="(Vencida) ";}
        else {
         if ( fechaRecordatorio!=null && EstaPorVencer()){res+="(Por Vencer) ";}}
        
        res+=getDescripcion();
        return res;
    }


    public boolean esDescripcion(String descripcion) {
        return  descripcion.equals(this.descripcion);
    }

    public boolean EstaPorVencer() {
        if  (fechaRecordatorio.isBefore(LocalDate.now())){
            prioridad=Prioridad.ALTA;
            return  true;
        }
        return  false;
    }
}
