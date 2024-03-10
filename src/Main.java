import entities.Gasto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Gasto> lista = new ArrayList<>();
        int opcion = 0;
        do{
            System.out.println("1. Inscribir gastos");
            System.out.println("2. Visualizar gastos");
            System.out.println("3. Salir");
            opcion = entrada.nextInt();
            entrada.nextLine();
                switch (opcion){
                    case 1:
                        inscribirGastos(lista, entrada);
                        break;
                    case 2:
                        visualizarGastos(lista);
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        break;
                }
        }while (opcion != 3);
    }
    public static void inscribirGastos(List<Gasto> lista, Scanner entrada){
        String detener = "";
        int contador = 1;
        System.out.println("digite los datos de los gastos que desea ingresar");
        while (!detener.equals("no")){
            System.out.println("Nombre del gasto: ");
            String nombre = entrada.nextLine();
            System.out.println("Descripcion del gasto: ");
            String descripcion  = entrada.nextLine();
            System.out.println("fecha del gasto: ");
            String fecha = entrada.nextLine();
            System.out.println("tipo de gasto: ");
            String tipo = entrada.nextLine();
            System.out.println("valor del gasto: ");
            double valor = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("********************************");
            System.out.println("desea ingresar algun otro gasto?: ");
            detener = entrada.nextLine();
            int id = contador++;

            Gasto gasto = new Gasto(id,nombre,descripcion,valor,fecha,tipo);
            lista.add(gasto);

        }
    }
    public static void visualizarGastos(List<Gasto> lista){
        for (Gasto gasto: lista){
            System.out.println("gasto #"+ gasto.getId()+"\n nombre del gasto: "+gasto.getNombre()+
                    "\n fecha del  gasto: "+gasto.getFecha());
        }
    }
}