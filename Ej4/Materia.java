package Ej4;

public class Materia {
    private String nombre;
    private String profesor;
    private int cargaHoraria;

    public Materia(String nombre, String profesor, int cargaHoraria) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.cargaHoraria = cargaHoraria;
    }

    //region Getter and Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    //endregion


    @Override
    public String toString() {
        return  "\n\t - nombre= " + nombre +
                "\n\t - profesor/a= " + profesor +
                "\n\t - cargaHoraria= " + cargaHoraria;
    }
}
