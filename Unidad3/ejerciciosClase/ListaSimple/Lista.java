public class Lista<T> {
    public Nodo<T> ultimo;

    public Lista(){
        ultimo  = null;
    }

    public void mostrarLista(){
        Nodo<T> actual = ultimo;
        while(actual != null){
            System.out.print(actual.dato+" -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    public void insertarDato(T dato){
        Nodo<T> nuevoNodo = new Nodo(dato);
        nuevoNodo.siguiente = ultimo;
        ultimo = nuevoNodo;
    }
}
