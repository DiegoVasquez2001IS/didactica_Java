/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasencadenadas;

/**
 *
 * @author visitante
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaEnlazada miLista=new ListaEnlazada();
        System.out.println("Lista Vacia? -->" + miLista.vacia());
        System.out.println("Insertar");        
	//miLista.InsertarEnPrimero(10);
	//miLista.InsertarEnPrimero(15);
	//miLista.InsertarEnPrimero(30);
	//miLista.InsertarEnPrimero(50);
	//miLista.InsertarEnPrimero(40);
	//miLista.InsertarEnPrimero(60);
	//System.out.println(miLista.Listar());
	//System.out.println("Borrar");
       // miLista.borrarPrimero();
	//miLista.borrarUltimo();
	//miLista.borrarPosicion(1);
        //System.out.println(miLista.Listar());       
        //System.out.println("Insertar");        
	//miLista.InsertarEnPrimero(14);        
        //System.out.println(miLista.Listar());
        System.out.println("Lista Vacia? -->" + miLista.vacia());
	//System.out.println("Borrar");
        //miLista.borrarPrimero();        
        //miLista.borrarPrimero();        
        //miLista.borrarPrimero();        
        //miLista.borrarPrimero();                
        //System.out.println(miLista.Listar());
        //System.out.println("Lista Vacia? -->" + miLista.vacia());                
        
        miLista.InsertarEnOrden(40);
        miLista.InsertarEnOrden(10);
        miLista.InsertarEnOrden(5);
        miLista.InsertarEnOrden(30);        
        miLista.InsertarEnOrden(6);                
        System.out.println(miLista.Listar());
        System.out.println("Posicion elemento: " + miLista.buscarLista(10));        
    }
    
}
