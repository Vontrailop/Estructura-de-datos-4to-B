/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        Alumno[] listAlumnos = new Alumno[4];

        String[] materias = { "Fisica", "Programación", "Inglés" };
        // Nueva materia: SI;

        String nuevaMateria = "Matemáticas";
        String[] nuevoArreglo = new String[materias.length + 1];
        System.out.println(materias.length);
        System.out.println(nuevoArreglo.length);

        // for (String string : nuevoArreglo) {
        // System.out.println("nada:" + string);
        // }

        // arrayCopy
        System.arraycopy(materias, // El arreglo del que vamos a usar sus datos
                0, // la posición/indice del arreglo a partir del cual vamos a guardar
                nuevoArreglo, // el arreglo destino
                0, // desde que indice del arreglo destino voy a copiar mis elementos
                materias.length // La cantidad de elementos que se van a copiar
        );
        nuevoArreglo[nuevoArreglo.length - 1] = nuevaMateria;
        // for (String string : nuevoArreglo) {
        // System.out.println(string);
        // }

        materias = nuevoArreglo;
        for (String string : materias) {
            System.out.println(string);
        }
        int x = 2;
        Alumno[] listaAlumnos = new Alumno[x];
        listaAlumnos[0] = new Alumno();
        listaAlumnos[1] = new Alumno();
        listaAlumnos[0].nombre = "Cecilia";
        listaAlumnos[1].nombre = "David";

        for (int i = 0; i < listaAlumnos.length; i++) {
            listaAlumnos[i].calificaciones = new int[materias.length];
            listaAlumnos[i].materias = materias;
            System.out.println("Del alumno " + listaAlumnos[i].nombre);
            for (int j = 0; j < listaAlumnos[0].calificaciones.length; j++) {
                System.out.println("Escribe la calificación la materia " + listaAlumnos[i].materias[j]);
                // Scanner
            }
        }
        int[] calificaciones = { 8, 9, 10, 7 };
        listaAlumnos[0].calificaciones = calificaciones;

        double sumatoria = 0;
        for (int i : listaAlumnos[0].calificaciones) {
            sumatoria += i;
        }
        listaAlumnos[0].promedio = sumatoria / listaAlumnos[0].calificaciones.length;
        System.out.println("El promedio del alumno: " + listaAlumnos[0].nombre + " es: " + listaAlumnos[0].promedio);

    }
}