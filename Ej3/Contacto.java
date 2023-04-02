package Ej3;

public class Contacto {

    private String nombreYapellido;
    private String telefono;
    private String email;

    public Contacto(String nombreYapellido, String telefono, String email) {
        this.nombreYapellido = nombreYapellido;
        this.telefono = telefono;
        this.email = email;
    }

    //region Getter and Setter

    public String getNombreYapellido() {
        return nombreYapellido;
    }

    public void setNombreYapellido(String nombreYapellido) {
        this.nombreYapellido = nombreYapellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    //endregion

    @Override
    public String toString() {
        return "\nNombre y Apellido: " + nombreYapellido +
                "\nTelefono: " + telefono +
                "\ne-mail: " + email + "\n";
    }
}
