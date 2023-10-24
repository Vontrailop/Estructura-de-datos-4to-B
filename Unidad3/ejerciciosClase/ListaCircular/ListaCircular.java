public class ListaCircular<T> {
    private Node<T> cabeza;
    private int size;

    private class Node<T> {
        T dato;
        Node<T> siguiente;

        Node(T dato) {
            this.dato = dato;
        }
    }

    public ListaCircular() {
        cabeza = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(T dato) {
        Node<T> nuevoNodo = new Node<>(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cabeza.siguiente = cabeza;
        } else {
            Node<T> actual = cabeza;
            while (actual.siguiente != cabeza) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
            nuevoNodo.siguiente = cabeza;
        }
        size++;
    }

    public void remove(int indice) {
        if (isEmpty() || indice < 0 || indice >= size) {
            System.out.println("Índice invalido");
        }
        if (size == 1) {
            cabeza = null;
        } else {
            Node<T> actual = cabeza;
            for (int i = 0; i < indice - 1; i++) {
                actual = actual.siguiente;
            }
            actual.siguiente = actual.siguiente.siguiente;
            if (indice == 0) {
                cabeza = actual.siguiente;
            }
        }
        size--;
    }

    public T get(int indice) {
        if (isEmpty() || indice < 0 || indice >= size) {
            System.out.println("Índice inválido");
        }
        Node<T> actual = cabeza;
        for (int i = 0; i < indice; i++) {
            actual = actual.siguiente;
        }
        return actual.dato;
    }

    public void mostrar() {
        if (isEmpty()) {
            System.out.println("Lista vacia");
            return;
        }
        Node<T> actual = cabeza;
        do {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        } while (actual != cabeza);
        System.out.println();
    }
}