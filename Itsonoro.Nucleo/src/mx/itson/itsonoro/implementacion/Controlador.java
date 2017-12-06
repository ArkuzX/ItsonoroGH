package mx.itson.itsonoro.implementacion;

import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import mx.itson.itsonoro.entidades.*;
import mx.itson.itsonoro.enumeradores.TipoUsuario;
import mx.itson.itsonoro.interfaces.IControlador;

public class Controlador implements IControlador {

    @Override
    public int login(String usuario, List<Usuario> usuarios, JFrame frameMain, JFrame frameMenu, JPasswordField pass, JFrame frameMenuAlumno) {
        boolean next = false;
        String contraseña = new String(pass.getPassword());
        System.out.println(usuario);
        System.out.println(contraseña);
        int index = 0;
        for (Usuario u : usuarios) {
            System.out.println(u.getCorreoelectronico());
            System.out.println(u.getContraseña());
            if (u.getCorreoelectronico().equals(usuario) && u.getContraseña().equals(contraseña)) {
                next = true;
                break;
            } else {
                index++;
            }
        }
        if (next) {
            if(usuarios.get(index).getTipoUsuario() == TipoUsuario.PROFESOR){
                frameMenu.setVisible(true);
            }else{
                frameMenuAlumno.setVisible(true);
            }
            frameMain.setVisible(false);
            
            return index;
        } else {
            pass.setText("");
            JOptionPane.showMessageDialog(null, "Favor de verificar la informacion", "Error", JOptionPane.ERROR_MESSAGE);
            return index + 1;
        }
    }

    @Override
    public void añadirCurso(Usuario usuario, JTextField txNombre, JTextField txAcceso, JTextField txInfo) {
        Curso curso = new Curso();
        curso.setProfesor(usuario);
        curso.setNombre(txNombre.getText());
        curso.setCodigoacceso(txAcceso.getText());
        curso.setHorario(txInfo.getText());
        usuario.getCursos().add(curso);
    }

    @Override
    public void añadirTarea(Curso curso, JTextField txNombre, JTextField txComentario, JTextField valor, JSpinner spnDate) {
        Asignacion a = new Asignacion(txNombre.getText(), txComentario.getText(), Double.parseDouble(valor.getText()));
        a.setFecha(new Date());
        a.setFechadeentrega((Date)spnDate.getModel().getValue());
        curso.getAsignaciones().add(a);
        txNombre.setText("");
        txComentario.setText("");
        valor.setText("");
    }
    
}
