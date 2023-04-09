package Ej4;

public class Main {
    public static void main(String[] args) {

        Materia matematicas=new Materia("Matematicas","Claudia Neme",18);
        Materia lengua=new Materia("Lengua","Gabriela Gutierrez",8);

        Estudiante estudiante1=new Estudiante("Juan Agustin Bereilh",34,0.0F);

        //System.out.println(estudiante1);
        estudiante1.agregarMateria(matematicas,9);
        estudiante1.setPromedio(estudiante1.calcularPromedio());
        estudiante1.agregarMateria(lengua,7);
        estudiante1.setPromedio(estudiante1.calcularPromedio());
        System.out.println(estudiante1);

    }
}