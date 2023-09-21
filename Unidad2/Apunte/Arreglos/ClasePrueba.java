//declaración de arreglo tipado
//creación de arreglo
//asignación de dato
//consulta de dato
//operaciones por iteración

public class ClasePrueba {
    public static void main(String[] args) {

        //declaración de arreglo tipado
        String[] materias = { "Inglés", "Español", "Programación" };

        //declaración de arreglo tipado en objeto || creación de arreglo
        Alumno[] listaAlumnos = new Alumno[5];

        //asignación de dato
        Alumno registro = new Alumno("David", "Pérez", materias);
        listaAlumnos[0] = registro;
        registro = new Alumno("Sebastian", "Sota", materias);
        listaAlumnos[1] = registro;
        registro = new Alumno("Diego", "Albabera", materias);
        listaAlumnos[2] = registro;
        registro = new Alumno("Brenda", "Álvarez", materias);
        listaAlumnos[3] = registro;
        registro = new Alumno("Christina", "Bustos", materias);
        listaAlumnos[4] = registro;

        //asignación de dato dentro del objeto y dentro de un arreglo
        listaAlumnos[0].getPromedios()[0] = 8;
        listaAlumnos[0].getPromedios()[1] = 9;
        listaAlumnos[0].getPromedios()[2] = 10;

        //operaciones por iteración

        for (Alumno alumno : listaAlumnos) {
            System.out.println("El alumno " + alumno.getName() + " " + alumno.getSurname()
                    + " tiene las siguientes calificaciones:");
            for (int i = 0; i < alumno.getMaterias().length; i++) {
                System.out.println(
                        "Materia: " + alumno.getMaterias()[i] + " prom: " + alumno.getPromedios()[i] + ".");
            }
        }

    }
}