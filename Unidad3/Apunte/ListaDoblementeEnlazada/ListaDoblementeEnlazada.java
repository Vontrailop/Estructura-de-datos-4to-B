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

    public void modificarPorIndice(T nuevoDato, int indice) {
        if (estaVacia() || indice < 0) {
            System.out.println("La lista está vacía o el índice es inválido.");
            return;
        }

        Nodo<T> actual = cabeza;
        int contador = 0;

        while (contador < indice && actual != null) {
            actual = actual.siguiente;
            contador++;
        }

        if (actual != null) {
            actual.dato = nuevoDato;
        } else {
            System.out.println("Índice fuera de rango, no se puede modificar el elemento.");
        }
    }

    public void eliminarPorDato(T dato) {
        if (estaVacia()) {
            return;
        }

        if (cabeza.dato.equals(dato)) {
            if (cabeza.siguiente != null) {
                cabeza.siguiente.anterior = null;
            }
            cabeza = cabeza.siguiente;
            return;
        }

        Nodo<T> actual = cabeza;
        while (actual != null && !actual.dato.equals(dato)) {
            actual = actual.siguiente;
        }

        if (actual != null) {
            if (actual.siguiente != null) {
                actual.siguiente.anterior = actual.anterior;
            }
            if (actual.anterior != null) {
                actual.anterior.siguiente = actual.siguiente;
            }
        }
    }

    public void eliminarPorIndice(int indice) {
        if (estaVacia() || indice < 0) {
            System.out.println("La lista está vacía o el índice es inválido.");
            return;
        }

        if (indice == 0) {
            if (cabeza.siguiente != null) {
                cabeza.siguiente.anterior = null;
            }
            cabeza = cabeza.siguiente;
            return;
        }

        Nodo<T> actual = cabeza;
        int contador = 0;

        while (contador < indice && actual != null) {
            actual = actual.siguiente;
            contador++;
        }

        if (actual != null) {
            if (actual.siguiente != null) {
                actual.siguiente.anterior = actual.anterior;
            }
            if (actual.anterior != null) {
                actual.anterior.siguiente = actual.siguiente;
            }
        } else {
            System.out.println("Índice fuera de rango, no se puede eliminar el elemento.");
        }
    }

}
