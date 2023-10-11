public class Nodo<T extends Number> {
    public T dato;
    public Nodo<T> siguiente;

    public Nodo(T dato2) {
        this.dato = dato2;
        this.siguiente = null;
    }
}