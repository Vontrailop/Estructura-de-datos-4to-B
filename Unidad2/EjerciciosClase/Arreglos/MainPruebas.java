public class MainPruebas {

    //declaración de arreglo tipado
    //creación de arreglo
    //asignación de dato
    //consulta de dato
    //operaciones por iteración
    public static void main(String[] args) {
        
        Alumnos[] listaAlumnos = new Alumnos[2];
        String [] materias  = 
            {"Programación",
            "Inglés",
            "Español"};
        Alumnos registro = 
        new Alumnos("David", 
                "Pérez",
                materias);
        listaAlumnos[0] = registro;
        registro = new Alumnos("Sebastian", 
                "Sota",
                materias);
        listaAlumnos[1] = registro;

        listaAlumnos[0].getCalificaciones()[0] = 8;

        for (Alumnos alumno : listaAlumnos) {
            System.out.println("El alumno:"+alumno.getNombre()
            +" tiene las calificaciones");
            for (int i = 0; i < alumno.getMaterias().length; i++) {
                System.out.println("La materia "
                +alumno.getMaterias()[i]+" "+
                "con calif. "+alumno.getCalificaciones()[i]);
            }
        }
    }
}


/*
 * Realizar un sistema  dinámico para la creación
 * de grupos y alumnos
 * cada grupo debe estar depositado en un  arreglo
 * y cada grupo debe tener un arreglo de alumnos
 * 
 * la consulta de grupos debe traer todos los alumnos
 * pero solo se debe consultar un  grupo a la vez
 * y la creación del tamaño del arreglo de grupos y alumnos debe 
 * ser definida por el usuario
 */