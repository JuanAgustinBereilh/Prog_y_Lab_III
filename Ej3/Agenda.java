package Ej3;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contacto> agenda;

    public Agenda() {
        this.agenda = new ArrayList<>();
    }

    public void agregarContacto (Contacto contactoNuevo){
        agenda.add(contactoNuevo);
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "agenda=" + agenda +
                '}';
    }

    
}
