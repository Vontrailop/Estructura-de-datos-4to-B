public class Main {
    public static void main(String[] args) {
        ListaCircular<Integer> lista = new ListaCircular<>();

        lista.insertarAlFinal(1);
        lista.insertarAlFinal(2);
        lista.insertarAlFinal(3);

        System.out.println("Lista doblemente enlazada circular de enteros:");
        lista.mostrarLista();
    }
}
