package Ej4;

public class EstadoAcademico {
    private Materia materia;
    private float nota;

    public EstadoAcademico(Materia materia, float nota) {
        this.materia = materia;
        this.nota = nota;
    }

    //region Getter and Setter
    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    //endregion


    @Override
    public String toString() {
        return "\n # Materia= " + materia +
                "\n # nota= " + nota;
    }
}
