package mx.itson.itsonoro.interfaces;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import mx.itson.itsonoro.entidades.*;

public interface IControlador {
    
    public int login(String usuario, List<Usuario> Usuarios, JFrame frameMain, JFrame frameMenu, JPasswordField pass, JFrame frameMenuAlumno);
    public void añadirCurso(Usuario usuario, JTextField txNombre, JTextField txAcceso, JTextField txInfo);
    public void añadirTarea(Curso curso, JTextField txNombre, JTextField txComentario, JTextField valor, JSpinner spnDate);
    
}
