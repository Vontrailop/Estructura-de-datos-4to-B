public class ListaDoblementeEnlazada<T> {
    private Nodo<T> cabeza;
    private Nodo<T> cola;

    public ListaDoblementeEnlazada() {
        cabeza = null;
        cola = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void insertarAlFinal(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (estaVacia()) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            nuevoNodo.anterior = cola;
            cola.siguiente = nuevoNodo;
            cola = nuevoNodo;
        }
    }

    public void mostrarLista() {
        Nodo<T> actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " <-> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }


}
