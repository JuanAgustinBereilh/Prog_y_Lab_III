package Ej5;

import java.time.LocalDate;
import java.util.Calendar;

public class Producto {
    private String codigo;
    private String descripcion;
    private int stock;
    private float precio;
    private LocalDate anioVencimiento;

    public Producto(String codigo, String descripcion, int stock, float precio, LocalDate anioVencimiento) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
        this.anioVencimiento = anioVencimiento;
    }

    //region Getter and Setter
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public LocalDate getAnioVencimiento() {
        return anioVencimiento;
    }

    public void setAnioVencimiento(LocalDate anioVencimiento) {
        this.anioVencimiento = anioVencimiento;
    }

//endregion

    @Override
    public String toString() {
        return "Producto:" +
                "\ncodigo= " + codigo +
                "\ndescripcion=" + descripcion +
                "\nstock=" + stock +
                "\nprecio=" + precio +
                "\nanioVencimiento=" + anioVencimiento +
                "\n";
    }
}
