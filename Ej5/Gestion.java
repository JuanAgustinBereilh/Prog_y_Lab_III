package Ej5;

import java.time.LocalDate;
import java.util.ArrayList;

public class Gestion {

    private ArrayList<Producto> productos;

    public Gestion(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    //region Getter and Setter

    //endregion

    //metodo para vender; (quitar)
    public void vender(String codigoProducto, int cantidad) {
        int index = buscarPorCodigo(codigoProducto);
        if (index >= 0) {
            Producto producto = productos.get(index);
            if (producto.getStock() >= cantidad) {
                producto.setStock(producto.getStock() - cantidad);
            } else {
                System.out.println("Stock insuficiente.");
            }
        } else {
            System.out.println("No se encontro el codigo del producto.");
        }
    }

    //metodo para comprar; (agregar)
    public void comprar(String codigoProducto, int cantidad) {
        int index = buscarPorCodigo(codigoProducto);
        if (index >= 0) {
            Producto producto = productos.get(index);
            producto.setStock(producto.getStock() + cantidad);
        } else {
            System.out.println("No se encontro el codigo del producto.");
        }
    }

    //metodo para buscar producto por codigo;
    public int buscarPorCodigo(String codigoProducto) {
        int index = -1;
        for (Producto o : productos) {
            if (o.getCodigo().equals(codigoProducto)) {
                index = productos.indexOf(o);
                break;
            }
        }
        return index;
    }

    //metodo para indicar si un producto se vencio o va a vencer en elaño en curso;
    public void vencimiento(){
        for (Producto o: productos){
            if(o.getAnioVencimiento().compareTo(LocalDate.now())<0){
                System.out.println("El producto " + o.getDescripcion() + " se esta por vencer o se encuentra vencido\n");
            } else{
                System.out.println("El producto " + o.getDescripcion() + " aun se encuentra dentro de la fecha de venciemiento\n");

            }
        }
    }


    @Override
    public String toString() {
        return "\n" + productos + "\n";
    }
}
