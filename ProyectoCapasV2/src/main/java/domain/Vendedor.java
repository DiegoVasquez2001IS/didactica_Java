/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author visitante
 */
public class Vendedor {
    int id_vendedor;
    String nombreVendedor;
    String direVendedor;

    public Vendedor() {
    }

    public Vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public Vendedor(String nombreVendedor, String direVendedor) {
        this.nombreVendedor = nombreVendedor;
        this.direVendedor = direVendedor;
    }

    public int getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public String getDireVendedor() {
        return direVendedor;
    }

    public void setDireVendedor(String direVendedor) {
        this.direVendedor = direVendedor;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "id_vendedor=" + id_vendedor + ", nombreVendedor=" + nombreVendedor + ", direVendedor=" + direVendedor + '}';
    }
    
}
