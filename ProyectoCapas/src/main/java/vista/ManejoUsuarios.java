package vista;

import datos.UsuarioDAO;
import domain.Persona;
import domain.Usuario;
import java.util.List;

public class ManejoUsuarios {

    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        //Insertamos un nuevo usuario
        Usuario usuarioInsertar = new Usuario("Luis.Perez", "guate");
        usuarioDAO.insert(usuarioInsertar);
        

        //Modificamos un usuario existente
//        Usuario usuarioModificar = new Usuario(3, "carlos.juarez","456");
//        usuarioDAO.update(usuarioModificar);
//
//      Prueba delete
//        usuarioDAO.delete(new Usuario(2));
//
//        // Prueba query
//        Usuario usuarioConsultar = new Usuario();
        //      usuarioConsultar.setId_usuario(1);
        //      usuarioDAO.query(usuarioConsultar);        
        //       
        List<Usuario> usuarios = usuarioDAO.select();
        for (Usuario usuario : usuarios) {
            System.out.println("Usuario:" + usuario);
        }
        //Ejecutando el listado de usuarios

    }
}
