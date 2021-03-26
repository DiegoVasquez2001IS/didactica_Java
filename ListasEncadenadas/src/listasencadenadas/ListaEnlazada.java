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
public class ListaEnlazada {

    Nodo Primero;

    public ListaEnlazada() {
        Primero = null;
    }

    public boolean vacia() {
        if (Primero == null) {
            return (true);
        } else {
            return (false);
        }
    }

    public int buscarLista(int Elemento) {
        Nodo indice;
        int p = 1;
        for (indice = Primero; indice != null; indice = indice.Siguiente) {
            if (Elemento == indice.info) {
                return p;
            }
            p++;
        }
        return 0;
    }

    public void InsertarEnPrimero(int Dato) {
        Nodo Temporal = new Nodo(Dato); //Crea el nodo temporal
        Temporal.Siguiente = Primero; //corre al primero
        Primero = Temporal;   //lo coloca de primero
    }

    public void InsertarEnOrden(int Dato) {
        Nodo Temporal = new Nodo(Dato); //Crea el nodo temporal
        if (Primero == null) {
            Primero = Temporal;
        } else if (Dato < Primero.getInfo()) {
            Temporal.setSiguiente(Primero);
            Primero = Temporal;
        } else {
            Nodo anterior, p;
            anterior = p = Primero;
            while ((p.getSiguiente() != null) && (Dato > p.getInfo())) {
                anterior = p;
                p = p.getSiguiente();
            }
            if (Dato > p.getInfo()) {
                anterior = p;
            }
            Temporal.setSiguiente(anterior.getSiguiente());
            anterior.setSiguiente(Temporal);
        }

    }

    public void borrarPrimero() {
        Primero = Primero.Siguiente;
    }

    public String Listar() {
        String Dato = " ";
        Nodo aux = Primero;
        while (aux != null) {
            Dato += "{" + aux.info + "}";
            aux = aux.Siguiente;
        }
        return (Dato);
    }

    public void borrarUltimo() {
        Nodo anterior = Primero;
        Nodo actual = Primero;
        while (actual.Siguiente != null) {
            anterior = actual;
            actual = actual.Siguiente;
        }
        anterior.Siguiente = null;
    }

    public void borrarPosicion(int pos) {
        int k = 1;
        Nodo anterior = Primero;
        Nodo actual = Primero;
        //System.out.println("K= "+ k + " anterior: "+anterior.info + " actual: "+ actual.info);
        if (pos > 0) {
            while (k != pos && actual.Siguiente != null) //while (actual.Siguiente != null)                    
            {
                anterior = actual;
                actual = actual.Siguiente;
                k++;
                //System.out.println("K= "+ k + " anterior: "+anterior.info + " actual: "+ actual.info);                                
                //	System.out.println("K       "+k);
            }
            if (pos == 1) {
                Primero = actual.Siguiente;
            }
            anterior.Siguiente = actual.Siguiente;
            //System.out.println("K= "+ k + " anterior: "+anterior.Siguiente + " actual: "+ actual.Siguiente);                                                        
        }
    }

}
