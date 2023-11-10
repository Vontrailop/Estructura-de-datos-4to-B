import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    /*
     * add - añadir
     * offer - intenta añadir
     * remove - elimina el frente de la cola
     * poll - intenta eliminar
     * peek - Recupera el último elemento, el primero en salir.
     * element - intenta recuperar el último elemento.
     * 
     * 
     * PriorityQueue
     * ArrayDeque
     * LinkedList
     * 
     */

    public static void main(String[] args) {

        Queue<String> colaPersonas = new ArrayDeque<>();
        Queue<String> colaEnlazada = new LinkedList<>();
        Queue<String> colaPrioritaria = new PriorityQueue<>();

        colaPersonas.add("David");
        colaPersonas.add("Miguel");

        System.out.println("----- Quitamos -----");
        System.out.println(colaPersonas.poll());

        List listaNueva = (List) colaPrioritaria;

        System.out.println(listaNueva.toArray());

    }
}