/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

/**
 *
 * @author visitante
 */
public class ManejoPersonas {

    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();
        //Prueba insert
//        Persona personaInsertar = new Persona();
//        personaInsertar.setNombre("Carlos");
//        personaInsertar.setApellido("Perez");
//        personaInsertar.setEmail("perezc@mail.com");
//        personaInsertar.setTelefono("5668899");
//        personaDAO.insert(personaInsertar);
//        //Prueba update
//        Persona personaActualizar = new Persona();
//        personaActualizar.setId_persona(3);
//        personaActualizar.setNombre("Mayra");
//        personaActualizar.setApellido("Lara");
//        personaActualizar.setEmail("mlara@mail.com");
//        personaActualizar.setTelefono("55668899");
//        
//        personaDAO.update(personaActualizar);
//        // Prueba delete
//        Persona personaEliminar = new Persona();
//        personaEliminar.setId_persona(3);
//        personaDAO.delete(personaEliminar);
//        // Prueba query
        Persona personaConsultar = new Persona();
        personaConsultar.setId_persona(1);
        // Recuperación de información a través de otro objeto
        personaConsultar=personaDAO.query(personaConsultar);
        System.out.println("persona:" + personaConsultar.toString()); 
        System.out.println("ID:" + personaConsultar.getId_persona()); 
        System.out.println("nombre:" + personaConsultar.getNombre());
        System.out.println("apellido:" + personaConsultar.getApellido());         
        System.out.println("correo:" + personaConsultar.getEmail()); 
        System.out.println("telefono:" + personaConsultar.getTelefono());         
 
        // Recuperación de información a través de un Array_list
        //List<Persona> personas = personaDAO.query(personaConsultar);
        //System.out.println("persona:" + personas.toString()); 
        //System.out.println("Nombre:" + personas.get(0).getNombre());        
        //System.out.println("Email:" + personas.get(0).getEmail();        
        
    
//     Despliegue de registros
        //List<Persona> personas = personaDAO.select();

        //for (Persona persona : personas) {
        //    System.out.println("persona:" + persona);        
        //}
        
    }

}
