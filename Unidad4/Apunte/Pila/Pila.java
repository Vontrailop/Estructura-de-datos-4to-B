import java.util.ArrayDeque;
import java.util.Deque;

public class Pila <T> {

        private Deque<T> pila = new ArrayDeque<>();

    // Método para agregar un elemento a la pila (push)
    public void apilar(T elemento) {
        pila.push(elemento);
    }

    // Método para retirar y devolver el elemento superior de la pila (pop)
    public T desapilar() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return pila.pop();
    }

    // Método para verificar si la pila está vacía
    public boolean estaVacia() {
        return pila.isEmpty();
    }

    // Método para obtener el tamaño de la pila
    public int tamano() {
        return pila.size();
    }

    // Método para obtener el elemento superior de la pila sin retirarlo
    public T cima() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return pila.peek();
    }
}
