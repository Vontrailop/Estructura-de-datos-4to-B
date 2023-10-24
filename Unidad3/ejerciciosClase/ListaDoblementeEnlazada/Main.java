public class Main {
    
    public static void main(String[] args) {
        
        ListaDoble<String> listaDoble  = new ListaDoble<>();

        listaDoble.insertar("David");
        listaDoble.insertar("Sebasstian");
        listaDoble.insertar("Yoali");

        listaDoble.mostrarLista();

        listaDoble.modificarPorIndice("Mario", 2);
        listaDoble.mostrarLista();

        
    }

    
}
