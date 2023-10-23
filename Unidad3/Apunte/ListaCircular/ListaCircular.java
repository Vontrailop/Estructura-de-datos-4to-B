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

    public void modificarPorIndice(T nuevoDato, int indice) {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        if (indice < 0) {
            System.out.println("Índice inválido.");
            return;
        }

        Nodo<T> actual = cabeza;
        int contador = 0;

        do {
            if (contador == indice) {
                actual.dato = nuevoDato;
                return;
            }
            actual = actual.siguiente;
            contador++;
        } while (actual != cabeza);

        System.out.println("Índice fuera de rango.");
    }

    public void eliminarPorIndice(int indice) {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        if (indice < 0) {
            System.out.println("Índice inválido.");
            return;
        }

        Nodo<T> actual = cabeza;
        Nodo<T> anterior = null;
        int contador = 0;

        do {
            if (contador == indice) {
                if (contador == 0) {
                    cabeza = actual.siguiente;
                }

                if (anterior != null) {
                    anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = anterior;
                }

                return;
            }

            anterior = actual;
            actual = actual.siguiente;
            contador++;
        } while (actual != cabeza);

        System.out.println("Índice fuera de rango.");
    }

}
