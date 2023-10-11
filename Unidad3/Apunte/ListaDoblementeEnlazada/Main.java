public class Main {
    public static void main(String[] args) {
        ListaDoblementeEnlazada<Integer> lista = new ListaDoblementeEnlazada<>();

        lista.insertarAlFinal(1);
        lista.insertarAlFinal(2);
        lista.insertarAlFinal(3);

        System.out.println("Lista doblemente enlazada de enteros:");
        lista.mostrarLista();
    }
}
