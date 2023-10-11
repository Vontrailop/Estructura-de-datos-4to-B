public class ListaSimple<T extends Number> {
    private Nodo<T> cabeza;

    public ListaSimple() {
        cabeza = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void insertarAlInicio(T dato) {
        Nodo<T> nuevoNodo = new Nodo(dato);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
    }

    public void mostrarLista() {
        Nodo<T> actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

}
