package mx.itson.itsonoro.implementacion;

import java.util.List;
import mx.itson.itsonoro.entidades.*;
import mx.itson.itsonoro.enumeradores.TipoUsuario;
import mx.itson.itsonoro.interfaces.IGenerador;

public class Generador implements IGenerador {

    @Override
    public void predeterminados(List<Usuario> usuarios) {
        Usuario usuario = new Usuario(165101, "Fernando Espada", "arkuz@hotmail.com", "mocoloco");
        usuario.setInstitucion("Itson");
        usuario.setTipoUsuario(TipoUsuario.PROFESOR);
        usuarios.add(usuario);
        Curso c1 = new Curso();
        c1.setProfesor(usuario);
        c1.setNombre("Matematicas I");
        c1.setCodigoacceso("ABCDE");
        c1.setHorario("A112 de 7:00 a 8:00am");
        Curso c2 = new Curso();
        c2.setProfesor(usuario);
        c2.setNombre("Matematicas II");
        c2.setCodigoacceso("XYZAB");
        c2.setHorario("A101 de 8:00 a 9:00am");
        usuario.getCursos().add(c1);
        usuario.getCursos().add(c2);
        
        Usuario u1 = new Usuario(000001, "Ramon Castro", "mario@hotmail.com", "ITSON", TipoUsuario.ALUMNO, "alumno01");
        Usuario u2 = new Usuario(000002, "Daniel Martinez", "daniel@hotmail.com", "ITSON", TipoUsuario.ALUMNO, "alumno01");
        Usuario u3 = new Usuario(000003, "Salvador Gomez", "salvador@hotmail.com", "ITSON", TipoUsuario.ALUMNO, "alumno01");
        u1.getCursos().add(usuario.getCursos().get(0));
        u2.getCursos().add(usuario.getCursos().get(0));
        u3.getCursos().add(usuario.getCursos().get(0));
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuario.getCursos().get(0).getParticipantes().add(u1);
        usuario.getCursos().get(0).getParticipantes().add(u2);
        usuario.getCursos().get(0).getParticipantes().add(u3);
    }
}
