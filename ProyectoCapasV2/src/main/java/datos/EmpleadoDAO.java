/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import domain.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author visitante
 */
public class EmpleadoDAO {

    private static final String SQL_SELECT = "SELECT id_empleado, nombre_empleado, dire_empleado FROM empleado";
    private static final String SQL_INSERT = "INSERT INTO empleado(nombre_empleado, dire_empleado) VALUES(?, ?)";
    private static final String SQL_UPDATE = "UPDATE empleado SET nombre_empleado=?, dire_empleado=? WHERE id_empleado = ?";
    private static final String SQL_DELETE = "DELETE FROM empleado WHERE id_empleado=?";
    private static final String SQL_QUERY = "SELECT id_empleado, nombre_empleado, dire_empleado FROM empleado WHERE id_empleado = ?";

    public List<Empleado> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Empleado empleado = null;
        List<Empleado> empleados = new ArrayList<Empleado>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_empleado = rs.getInt("id_empleado");
                String nombre = rs.getString("nombre_empleado");
                String direccion = rs.getString("dire_empleado");
                
                empleado = new Empleado();
                empleado.setId_empleado(id_empleado);
                empleado.setNombreEmpleado(nombre);
                empleado.setDireEmpleado(direccion);
                
                empleados.add(empleado);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return empleados;
    }

    public int insert(Empleado empleado) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, empleado.getNombreEmpleado());
            stmt.setString(2, empleado.getDireEmpleado());


            System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    public int update(Empleado empleado) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, empleado.getNombreEmpleado());
            stmt.setString(2, empleado.getDireEmpleado());
            

            rows = stmt.executeUpdate();
            System.out.println("Registros actualizado:" + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    public int delete(Empleado empleado) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, empleado.getId_empleado());
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

//    public List<Persona> query(Persona empleado) { // Si se utiliza un ArrayList
    public Empleado query(Empleado empleado) {    
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Empleado> empleados = new ArrayList<Empleado>();
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_QUERY);
            stmt = conn.prepareStatement(SQL_QUERY);
            stmt.setInt(1, empleado.getId_empleado());
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_empleado = rs.getInt("id_empleado");
                String nombre = rs.getString("nombre_empleado");
                String direccion = rs.getString("dire_empleado");
                
                empleado = new Empleado();
                empleado.setId_empleado(id_empleado);
                empleado.setNombreEmpleado(nombre);
                empleado.setDireEmpleado(direccion);
                
                //empleados.add(empleado); // Si se utiliza un ArrayList
            }
            //System.out.println("Registros buscado:" + empleado);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        //return empleados;  // Si se utiliza un ArrayList
        return empleado;
    }
    
}
