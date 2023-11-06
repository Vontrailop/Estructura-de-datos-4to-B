public class Pila<T> {

    private static final int TAMPILA = 10;
    private int cima;
    private T[] listaPila;

    public Pila() {
        cima = -1;
        listaPila = (T[]) new Object[TAMPILA];
    }

    public boolean pilaLlena() {
        return cima == TAMPILA - 1;
    }

    public boolean pilaVacia() {
        return cima == -1;
    }

    public void insertar(T dato) throws Exception {

        if (pilaLlena()) {
            throw new Exception("Desbordamiento de pila");
        }
        cima++;
        listaPila[cima] = dato;
    }

    public T quitar() throws Exception {
        T aux;
        if (pilaVacia()) {
            throw new Exception("Pila vacía, no se puede extrar.");
        }
        aux = listaPila[cima];
        cima--;
        return aux;
    }

    public T cimaPila() throws Exception {
        if (pilaVacia()) {
            throw new Exception("Pila vacía, no hay elementos.");
        }
        return listaPila[cima];
    }
 
    public void muestra(){
        for (T t : listaPila) {
            System.out.println(t);
        }
    }
}