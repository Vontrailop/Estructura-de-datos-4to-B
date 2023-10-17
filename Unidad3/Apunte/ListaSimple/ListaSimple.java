public class ListaSimple<T extends Number> {
    private Nodo<T> ultimo;

    public ListaSimple() {
        ultimo = null;
    }

    public boolean estaVacia() {
        return ultimo == null;
    }

    public void insertarAlInicio(T dato) {
        Nodo<T> nuevoNodo = new Nodo(dato);
        nuevoNodo.siguiente = ultimo;
        ultimo = nuevoNodo;
    }

    public void mostrarLista() {
        Nodo<T> actual = ultimo;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
    

    public void eliminarPorDato(T dato) {
        if (estaVacia()) {
            return;
        }

        if (ultimo.dato == dato) {
            ultimo = ultimo.siguiente;
            return;
        }

        Nodo<T> actual = ultimo;
        while (actual.siguiente != null && actual.siguiente.dato != dato) {
            actual = actual.siguiente;
        }

        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
        }
    }

    public void eliminarPorIndice(int indice) {
        if (estaVacia() || indice < 0) {
            return; // No se puede eliminar nada
        }

        if (indice == 0) {
            ultimo = ultimo.siguiente;
            return;
        }

        Nodo<T> actual = ultimo;
        int contador = 0;

        while (contador < indice - 1 && actual.siguiente != null) {
            actual = actual.siguiente;
            contador++;
        }

        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
        }
    }

    public T consultarPorIndice(int indice) {
        if (estaVacia() || indice < 0) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }

        Nodo<T> actual = ultimo;
        int contador = 0;

        while (contador < indice && actual != null) {
            actual = actual.siguiente;
            contador++;
        }

        if (actual == null) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }

        return actual.dato;
    }

    public void insertarEnIndice(T dato, int indice) {
        if (indice < 0) {
            System.out.println("Índice inválido, no se puede insertar el elemento.");
            return;
        }

        Nodo<T> nuevoNodo = new Nodo<>(dato);

        if (indice == 0 || estaVacia()) {
            nuevoNodo.siguiente = ultimo;
            ultimo = nuevoNodo;
            return;
        }

        Nodo<T> actual = ultimo;
        int contador = 0;

        while (contador < indice - 1 && actual != null) {
            actual = actual.siguiente;
            contador++;
        }

        if (actual != null) {
            nuevoNodo.siguiente = actual.siguiente;
            actual.siguiente = nuevoNodo;
        } else {
            System.out.println("Índice fuera de rango, no se puede insertar el elemento.");
        }
    }

}
