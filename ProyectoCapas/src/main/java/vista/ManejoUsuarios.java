package vista;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

public class ManejoUsuarios {
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        List<Usuario> usuarios = usuarioDAO.select();
        for(Usuario usuario: usuarios){
            System.out.println("Usuario:" + usuario);
        }     
      
        
        //Insertamos un nuevo usuario
 //       Usuario usuario = new Usuario("Luis.Siliezar", "123456");
 //       usuarioDAO.insert(usuario);

        //Modificamos un usuario existente
//        Usuario usuario = new Usuario(3, "carlos.juarez","456");
//        usuarioDAO.update(usuario);

        usuarioDAO.delete(new Usuario(1));
          //Ejecutando el listado de usuarios
   
    }
}
