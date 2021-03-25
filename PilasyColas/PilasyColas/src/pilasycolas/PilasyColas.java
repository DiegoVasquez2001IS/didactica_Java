/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilasycolas;

/**
 *
 * @author SOPORTE
 */
public class PilasyColas {

    /**
     /* @param args the command line arguments
     */
    public static void pila() {
        PilaLista pila = new PilaLista();
        print("Apilar(PUSH) Pila --> \n");
        print("" + pila.insertar(1)+ "\n");
        print("" + pila.insertar(2)+ "\n");
        print("" + pila.insertar(3)+ "\n");
        print("" + pila.insertar(4)+ "\n");
        print("" + pila.insertar(5)+ "\n");
        print("" + pila.insertar(6)+ "\n");
        print(" Desapilar(POP) Pila -->");
        print("" + pila.quitar());
        print("" + pila.quitar());
        print("" + pila.quitar());
        print("" + pila.quitar());
        print("" + pila.quitar());
        print("" + pila.quitar());
   }

    public static void cola() {
        ColaLista cola = new ColaLista();
        print("Apilar(QUEUE) Cola --> \n");
        print("" + cola.insertar(1)+ "\n");
        print("" + cola.insertar(2)+ "\n");
        print("" + cola.insertar(3)+ "\n");
        print("" + cola.insertar(4)+ "\n");
        print("" + cola.insertar(5)+ "\n");
        print("" + cola.insertar(6)+ "\n");
        print(" Desapilar(DEQUEUE) Cola -->");
        print("" + cola.quitar());
        print("" + cola.quitar());
        print("" + cola.quitar());
        print("" + cola.quitar());
        print("" + cola.quitar());
        print("" + cola.quitar());
    }

    public static void print(String numero) {
        System.out.print(numero);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        //pila();
        cola();
       System.out.println("    "+"Terminada la aplicacion");
    }

}
