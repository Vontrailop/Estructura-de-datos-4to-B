public class ListaCircular<T> {
    private Nodo<T> cabeza;

    public ListaCircular() {
        cabeza = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void insertarAlFinal(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (estaVacia()) {
            cabeza = nuevoNodo;
            cabeza.siguiente = cabeza;
            cabeza.anterior = cabeza;
        } else {
            Nodo<T> ultimo = cabeza.anterior;
            nuevoNodo.siguiente = cabeza;
            nuevoNodo.anterior = ultimo;
            cabeza.anterior = nuevoNodo;
            ultimo.siguiente = nuevoNodo;
        }
    }

    public void mostrarLista() {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }
        Nodo<T> actual = cabeza;
        do {
            System.out.print(actual.dato + " <-> ");
            actual = actual.siguiente;
        } while (actual != cabeza);
        System.out.println();
    }

    
}
