public class Cola<T> {

    private static final int MAXTAM = 10;
    private int frente;
    private int fin;
    private T[] listaCola;

    public Cola() {
        frente = 0;
        fin = -1;
        listaCola = (T[]) new Object[MAXTAM];
    }

    public void insertar(T dato) throws Exception {
        if (!colaLlena()) {
            listaCola[++fin] = dato;
        } else {
            throw new Exception("Sin espacio en la cola");
        }
    }

    public T quitar() throws Exception {
        if (!colaVacia()) {
            return listaCola[frente++];
        } else
            throw new Exception("Sin elementos en la cola");

    }

    public void borrarCola() {
        frente = 0;
        fin = -1;
    }

    public T frenteCola() throws Exception {
        if (!colaVacia()) {
            return listaCola[frente];
        } else
            throw new Exception("Cola vacía");
    }

    public boolean colaVacia() {
        return frente > fin;
    }

    public boolean colaLlena() {
        return fin == MAXTAM;
    }

    public void muestra() {
        for (T t : listaCola) {
            System.out.println(t);
        }
    }
}
