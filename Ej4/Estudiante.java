package Ej4;

import java.util.ArrayList;

public class Estudiante {
    private String nombreYapellido;
    private int edad;
    private ArrayList<EstadoAcademico> materiasAprobadas;
    private float promedio;

    public Estudiante(String nombreYapellido, int edad, float promedio) {
        this.nombreYapellido = nombreYapellido;
        this.edad = edad;
        this.materiasAprobadas = new ArrayList<>();
        this.promedio = promedio;
    }

    //region Getter and Setter

    public String getNombreYapellido() {
        return nombreYapellido;
    }

    public void setNombreYapellido(String nombreYapellido) {
        this.nombreYapellido = nombreYapellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    //endregion

    public void agregarMateria(Materia materia, float nota) {
        EstadoAcademico materiaNuevaAprobada = new EstadoAcademico(materia, nota);
        this.materiasAprobadas.add(materiaNuevaAprobada);
    }

    public float calcularPromedio() {
        float sumatoriaNotas = 0;
        float prom = 0.0F;
        for (EstadoAcademico o : this.materiasAprobadas) {
            sumatoriaNotas +=o.getNota();
        }
        prom = sumatoriaNotas / this.materiasAprobadas.size();
        return prom;
    }

    @Override
    public String toString() {
        return "Estudiante:" +
                "\nnombreYapellido= " + nombreYapellido +
                "\nedad= " + edad +
                "\nmateriasAprobadas= " + materiasAprobadas +
                "\npromedio= " + promedio;
    }
}
