public class ListaDoble<T> {
    private Nodo<T> cabeza;
    private Nodo<T> cola;

    public ListaDoble() {
        cabeza = null;
        cola = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void insertar(T dato) {
        Nodo<T> nuevoNodo = new Nodo<T>(dato);
        if (estaVacia()) {
            cola = nuevoNodo;
            cabeza = nuevoNodo;
        } else {
            nuevoNodo.anterior = cola;
            cola.siguiente = nuevoNodo;
            cola = nuevoNodo;
        }
    }

    public void mostrarLista() {
        Nodo<T> actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + "<->");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    public void modificarPorIndice(T nuevoDato, int indice) {
        if (estaVacia() || indice < 0) {
            System.out.println("La lista está vacía o el índice es inválido");
        }

        Nodo<T> actual = cabeza;
        int contador = 0;

        while (actual != null && contador < indice) {
            actual = actual.siguiente;
            contador++;
        }

        if (actual != null) {
            actual.dato = nuevoDato;
        } else {
            System.out.println("El índice es inválido");
        }
    }

    public void eliminarPorIndice(int indice){
        if (estaVacia() || indice < 0) {
            System.out.println("La lista está vacía o el índice es inválido");
        }
        
        if ( indice == 0 ){
            if ( cabeza.siguiente == null){
                cabeza.siguiente.anterior  = null;
            }
            cabeza  = cabeza.siguiente;
            return;
        }

        Nodo<T> actual = cabeza;
        int contador = 0;

        while (actual != null && contador < indice) {
            actual = actual.siguiente;
            contador++;
        }

        if (actual != null){
            if( actual.siguiente != null){
                actual.siguiente.anterior = actual.anterior;
            }
            if( actual.anterior != null){
                actual.anterior.siguiente = actual.siguiente;
            }
        }else{
            System.out.println("El índice es inválido");
        }
    }
}
