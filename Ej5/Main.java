package Ej5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto("0001", "Heladera", 10, 260000F, LocalDate.of(2023, 4, 3));
        Producto producto2 = new Producto("0002", "Lavaropas", 5, 80000F, LocalDate.of(2023, 5, 12));

        ArrayList<Producto> listadoDeProductos = new ArrayList<>(Arrays.asList(producto1, producto2));
        Gestion stock = new Gestion(listadoDeProductos);

        System.out.println(stock);
        stock.vender("0001", 8);
        System.out.println(stock);
        stock.comprar("0001", 15);
        System.out.println(stock);
        stock.vencimiento();

    }
}


