import Ej3.Agenda;
import Ej3.Contacto;
import Ej4.Estudiante;
import Ej4.Materia;

import java.util.Scanner;

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


        /*Agenda agenda = new Agenda();
        Contacto contacto1 = new Contacto("Juan Agustin Bereilh", "223-5165233", "jagustinbereilh@gmial.com");
        Contacto contacto2 = new Contacto("Juan De los palotes", "223-4788935", "delospalotes@gmial.com");

        agenda.agregarContacto(contacto1);
        agenda.agregarContacto(contacto2);

        System.out.println(agenda);
        agenda.eliminarContacto("Juan De los palotes");
        System.out.println(agenda);
        agenda.modificarDatosContacto("Juan De los palotes");*/

    }
}