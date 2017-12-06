package mx.itson.itsonoro.entidades;

import java.util.ArrayList;
import java.util.List;
import mx.itson.itsonoro.enumeradores.TipoUsuario;

public class Usuario {

    private int id;
    private String nombre;
    private String correoelectronico;
    private String contraseña;
    private String telefono;
    private String cumpleaños;
    private String institucion;
    private TipoUsuario tipoUsuario;

    List<Curso> cursos = new ArrayList<Curso>();

    public Usuario() {
    }
/**
 * 
 * @param id parametro indentificador de usuario        
 * @param nombre parametro que representa el nombre del usuario registrado
 * @param correoelectronico es el correo que pertenece al usuario y el cual servira para poder registrarse y acceder a su cuenta
 * @param telefono telefono del usuario como parte de la informacion que se requiere y se le solicitara al momento del registro
 * @param cumpleaños fecha de naciemiento del usuario
 * @param institucion nombre de la institucion a la que pertenece el usuario
 * @param tipoUsuario Un parametro de tipo enumerador que servira como indentificador del tipo de usuario ya sea "PROFESOR" o "ALUMNO"

 */
    public Usuario(int id, String nombre, String correoelectronico, String institucion, TipoUsuario tipoUsuario, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.correoelectronico = correoelectronico;
        this.institucion = institucion;
        this.tipoUsuario = tipoUsuario;
        this.contraseña = contraseña;
    }
    
    public Usuario(int id, String nombre, String correo, String pass) {
        this.id = id;
        this.nombre = nombre;
        this.correoelectronico = correo;
        this.contraseña = pass;
    }
    
    public String getContraseña(){
        return contraseña;
    }
    
    public void setContraseña(String contraseña){
        this.contraseña = contraseña;
    }
    
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCumpleaños() {
        return cumpleaños;
    }

    public void setCumpleaños(String cumpleaños) {
        this.cumpleaños = cumpleaños;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
    
}
