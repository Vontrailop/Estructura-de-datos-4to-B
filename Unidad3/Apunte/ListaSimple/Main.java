public class Main {
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();

        lista.insertarAlInicio(3);
        lista.insertarAlInicio(2);
        lista.insertarAlInicio(1);

        System.out.println("Lista simple:");
        lista.mostrarLista();
    }
}
