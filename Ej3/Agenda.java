package Ej3;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    private ArrayList<Contacto> agenda;

    public Agenda() {
        this.agenda = new ArrayList<>();
    }

    public void agregarContacto(Contacto contactoNuevo) {
        agenda.add(contactoNuevo);
    }

    public void eliminarContacto(String nombre) {

        int index = buscarContacto(nombre);

        if (index >= 0) {
            agenda.remove(index);
            System.out.println("El contacto se elimino correctamente.");
        } else {
            System.out.println("El contacto buscado no se encuentra agendado.");
        }
    }

    public int buscarContacto(String nombreYapellido) {
        int index = -1;
        for (Contacto o : agenda) {
            if (o.getNombreYapellido().equalsIgnoreCase(nombreYapellido)) {
                index = agenda.indexOf(o);
                break;
            }
        }
        return index;
    }

    public void modificarDatosContacto(String nombre) {
        int index = buscarContacto(nombre);
        if (index >= 0) {
            System.out.println(agenda.get(index)); //muestra los datos del contacto.
            Scanner scanner = new Scanner(System.in); //instancia un objeto de tipo Scanner para leer por consola.
            int option;
            System.out.println("1.Modificar nombre del contacto.\n2.Modificar numero telefonico.\n3.Modificar direccion de correo electronico.");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    scanner.nextLine(); //limpia el buffer.
                    agenda.get(index).setNombreYapellido(scanner.nextLine());
                    System.out.println(agenda.get(index));
                    break;
                case 2:
                    scanner.nextLine(); //limpia el buffer
                    agenda.get(index).setTelefono(scanner.nextLine());
                    System.out.println(agenda.get(index));
                    break;
                case 3:
                    scanner.nextLine(); //limpia el buffer
                    agenda.get(index).setEmail(scanner.nextLine());
                    System.out.println(agenda.get(index));
                    break;
            }
            scanner.close();// cierro el objeto scanner.
        } else {
            System.out.println("El contacto no se encuentra agendado.");
        }
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "agenda=" + agenda +
                '}';
    }

}
