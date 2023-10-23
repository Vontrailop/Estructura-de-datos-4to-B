public class Main {
    public static void main(String[] args) {
        ListaCircular<Integer> lista = new ListaCircular<>();
        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(3);

        lista.recorrer();
        System.out.println("-----------");
        lista.eliminar(1);
        lista.recorrer();
    }
}
