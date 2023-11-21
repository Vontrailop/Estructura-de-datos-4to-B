public class Main {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        // Inserta valores en el árbol
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(70);
        arbol.insertar(60);
        arbol.insertar(80);

        // Realiza un recorrido inorden e imprime los valores
        System.out.println("Recorrido inorden del árbol:");
        arbol.inorden();
    }
}
