package controlador;

import modelo.Recargas;
import conexion.Conexion;
import dao.RecargaDao;
import java.util.List;
import java.util.Scanner;

public class RecargasController {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Conexion conn = new Conexion();
        RecargaDao Recargdao = new RecargaDao(conn);

        System.out.println("Ingrese la linea de celular: ");
        Recargas recarg = new Recargas(0);
        recarg.setLinea_celular(scan.next());

        System.out.println("Ingrese el numero de celular: ");
        recarg.setNum_celular(scan.nextInt());

        System.out.println("Ingrese la cantidad de saldo recargada: ");
        recarg.setCantidad_recarga(scan.nextInt());

        System.out.println("Fecha de recarga: " + recarg.getFecha_recarga());
        boolean mostrarRecarga = Recargdao.Insert(recarg);
        if (mostrarRecarga) {
            System.out.println("SE EFECTUO LA RECARGA :D");
        } else {
            System.out.println("NO SE EFECTUO LA RECARGA D:");

        }

        List<Recargas> list = Recargdao.selectAll();
        for (Recargas recarg1 : list) {
            System.out.println("El id es: " + recarg1.getId());
            System.out.println("La linea de celular es: " + recarg1.getLinea_celular());
            System.out.println("El numero de celular es: " + recarg1.getNum_celular());
            System.out.println("La cantidad de saldo a recargar es: " + recarg1.getCantidad_recarga());
            System.out.println("La fecha de recarga  es: " + recarg1.getFecha_recarga());

        }
    }
}
