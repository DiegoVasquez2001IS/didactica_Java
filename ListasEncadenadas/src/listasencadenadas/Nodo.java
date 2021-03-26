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
public class Nodo {
 	int info;
	public Nodo Siguiente;
        
	public Nodo (int dato)
	{
		info=dato;
	}

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Nodo getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo Siguiente) {
        this.Siguiente = Siguiente;
    }

    @Override
    public String toString() {
        return "Nodo{" + "info=" + info + ", Siguiente=" + Siguiente + '}';
    }
	
   
}
