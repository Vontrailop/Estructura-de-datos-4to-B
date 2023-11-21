
public class ArbolBinario {
    Nodo raiz;

    // Constructor
    public ArbolBinario() {
        raiz = null;
    }

    // Método para insertar un nuevo valor en el árbol
    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    // Método auxiliar recursivo para insertar un nuevo valor
    private Nodo insertarRec(Nodo raiz, int valor) {
        // Si el árbol está vacío, crea un nuevo nodo
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }

        // De lo contrario, recorre el árbol
        if (valor < raiz.valor) {
            raiz.izquierdo = insertarRec(raiz.izquierdo, valor);
        } else if (valor > raiz.valor) {
            raiz.derecho = insertarRec(raiz.derecho, valor);
        }

        // Devuelve el nodo raíz modificado
        return raiz;
    }

    // Método para realizar un recorrido inorden del árbol
    public void inorden() {
        inordenRec(raiz);
    }

    // Método auxiliar recursivo para realizar un recorrido inorden
    private void inordenRec(Nodo raiz) {
        if (raiz != null) {
            inordenRec(raiz.izquierdo);
            System.out.print(raiz.valor + " ");
            inordenRec(raiz.derecho);
        }
    }

    // Método para realizar un recorrido preorden del árbol
    public void preorden() {
        preordenRec(raiz);
        System.out.println();
    }

    // Método auxiliar recursivo para realizar un recorrido preorden
    private void preordenRec(Nodo raiz) {
        if (raiz != null) {
            System.out.print(raiz.valor + " ");
            preordenRec(raiz.izquierdo);
            preordenRec(raiz.derecho);
        }
    }

    // Método para realizar un recorrido postorden del árbol
    public void postorden() {
        postordenRec(raiz);
        System.out.println();
    }

    // Método auxiliar recursivo para realizar un recorrido postorden
    private void postordenRec(Nodo raiz) {
        if (raiz != null) {
            postordenRec(raiz.izquierdo);
            postordenRec(raiz.derecho);
            System.out.print(raiz.valor + " ");
        }
    }

    public Nodo buscar(int valor) {
        return buscarRec(raiz, valor);
    }

    // Método auxiliar recursivo para buscar un valor
    private Nodo buscarRec(Nodo raiz, int valor) {
        if (raiz == null || raiz.valor == valor) {
            return raiz;
        }

        if (valor < raiz.valor) {
            return buscarRec(raiz.izquierdo, valor);
        }

        return buscarRec(raiz.derecho, valor);
    }

    // Método para eliminar un valor del árbol
    public void eliminar(int valor) {
        raiz = eliminarRec(raiz, valor);
    }

    // Método auxiliar recursivo para eliminar un valor
    private Nodo eliminarRec(Nodo raiz, int valor) {
        if (raiz == null) {
            return raiz;
        }

        // Recorre el árbol
        if (valor < raiz.valor) {
            raiz.izquierdo = eliminarRec(raiz.izquierdo, valor);
        } else if (valor > raiz.valor) {
            raiz.derecho = eliminarRec(raiz.derecho, valor);
        } else {
            // Nodo con un solo hijo o sin hijos
            if (raiz.izquierdo != null) {
                return raiz.derecho;
            } else if (raiz.derecho == null) {
                return raiz.izquierdo;
            }
            raiz.valor = encontrarMinimoValor(raiz.derecho);

            // Elimina el sucesor inorden
            raiz.derecho = eliminarRec(raiz.derecho, raiz.valor);
        }

        return raiz;
    }

    private int encontrarMinimoValor(Nodo raiz) {
        int minimoValor = raiz.valor;
        while (raiz.izquierdo != null) {
            minimoValor = raiz.izquierdo.valor;
            raiz = raiz.izquierdo;
        }
        return minimoValor;
    }
}
