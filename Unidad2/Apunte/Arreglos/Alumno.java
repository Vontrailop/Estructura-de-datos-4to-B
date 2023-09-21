public class Alumno {

    private String name;
    private String surname;

    private String[] materias;
    private int[] promedios;

    public Alumno(String name, String surname, String[] materias) {
        this.name = name;
        this.surname = surname;
        this.materias = materias;
        this.promedios = new int[materias.length];
    }

    public String[] getMaterias() {
        return materias;
    }

    public String getName() {
        return name;
    }

    public int[] getPromedios() {
        return promedios;
    }

    public String getSurname() {
        return surname;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPromedios(int[] promedios) {
        this.promedios = promedios;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
