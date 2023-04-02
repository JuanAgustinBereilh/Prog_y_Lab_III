import Ej3.Agenda;
import Ej3.Contacto;

public class Main {
    public static void main(String[] args) {

        Agenda agenda=new Agenda();
        Contacto contacto1=new Contacto("Juan Agustin Bereilh","223-5165233","jagustinbereilh@gmial.com");
        Contacto contacto2=new Contacto("Juan De los palotes","223-4788935","delospalotes@gmial.com");

        agenda.agregarContacto(contacto1);
        agenda.agregarContacto(contacto2);

        System.out.println(agenda);
    }
}