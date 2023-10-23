public class Nodo<T> {
    T dato;
    Nodo<T> enlace;

    public Nodo(T dato) {
        this.dato = dato;
        enlace = this;
    }
}
