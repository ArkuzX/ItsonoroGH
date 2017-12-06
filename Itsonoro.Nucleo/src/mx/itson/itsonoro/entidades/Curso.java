package mx.itson.itsonoro.entidades;

import java.util.*;


public class Curso {
    
private Usuario Profesor;    
private String codigoacceso;
private String nombre;
private String horario;
List<Asignacion> asignaciones = new ArrayList<Asignacion>();
List<Usuario> participantes = new ArrayList<Usuario>();;
//Obsoletos
private String ubicacion;

    public Curso() {
    }

    public Curso(Usuario Profesor, String codigoacceso, String nombre, String horario, List<Asignacion> asignacion, List<Usuario> participantes) {
        this.Profesor = Profesor;
        this.codigoacceso = codigoacceso;
        this.nombre = nombre;
        this.horario = horario;
        this.asignaciones = asignacion;
        this.participantes = participantes;
    }

    public Usuario getProfesor() {
        return Profesor;
    }

    public void setProfesor(Usuario Profesor) {
        this.Profesor = Profesor;
    }

    public String getCodigoacceso() {
        return codigoacceso;
    }

    public void setCodigoacceso(String codigoacceso) {
        this.codigoacceso = codigoacceso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(List<Asignacion> asignacion) {
        this.asignaciones = asignacion;
    }

    public List <Usuario> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List <Usuario> participantes) {
        this.participantes = participantes;
    }

   

}
