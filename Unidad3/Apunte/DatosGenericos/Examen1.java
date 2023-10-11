public class Examen1 {

    public static Postre[] datos() {
        Postre[] postres = new Postre[20];

        // Datos constantes para los objetos Postre
        String[] nombres = {
            "Pastel de Chocolate", "Tarta de Manzana", "Helado de Vainilla",
            "Cupcake de Fresa", "Brownie de Nuez", "Flan de Caramelo",
            "Gelatina de Frambuesa", "Mousse de Chocolate", "Churros",
            "Tiramisú", "Crepe de Nutella", "Palmera de Chocolate",
            "Dónut Glaseado", "Profiteroles", "Galletas con Chispas de Chocolate",
            "Cheesecake de Fresa", "Panna Cotta", "Crepes de Limón",
            "Helado de Chocolate", "Tarta de Chocolate"
        };
        
        double[] pesos = {
            0.12, 0.3, 0.16, 0.1, 0.25, 0.35, 0.25, 0.2, 0.05, 0.3,
            0.1, 0.18, 0.12, 0.28, 0.15, 0.2, 0.02, 0.14, 0.11, 0.22
        };
        
        double[] costos = {
            5.99, 6.94, 4.19, 3.47, 7.97, 5.49, 4.29, 6.49, 3.99, 8.49,
            5.95, 4.49, 3.49, 9.99, 4.99, 11.99, 7.99, 6.99, 4.49, 6.97
        };

        // Llenar el arreglo de objetos Postre
        for (int i = 0; i < 20; i++) {
            postres[i] = new Postre(nombres[i], pesos[i], costos[i]);
        }
        return postres;
    }
    
    
    public static class Postre {
        String nombre;
        double peso, costo;
        public Postre(String nombre, double peso, double costo) {
            this.nombre = nombre;
            this.peso = peso;
            this.costo = costo;
        }
        
    }
}
