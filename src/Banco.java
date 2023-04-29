import java.util.Scanner;

public class Banco {
    public void cajero(){
        Scanner scanner = new Scanner(System.in);
        Consultar consultar = new Consultar();
        Depositar depositar = new Depositar();
        Retirar retirar = new Retirar();
        Transferir transferir = new Transferir();
        Cuenta cuenta = new Cuenta();
        int opcion;

        Double dinero = cuenta.saldo();
        Double cuenta2 = 0.0;

        do{
            System.out.println("---BIENVENIDO AL CAJERO---");
            System.out.println("---¿QUE OPERACION DESEA REALIZAR?---");
            System.out.println(" [1] Consultar saldo.");
            System.out.println(" [2] Depositar dinero.");
            System.out.println(" [3] Retirar dinero.");
            System.out.println(" [4] Transferir dinero.");
            System.out.println(" [5] Salir .");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> consultar.consulta(dinero);
                case 2 -> dinero = dinero + depositar.deposito();
                case 3 -> dinero = dinero - retirar.retiro(dinero);
                case 4 -> dinero = transferir.transferencia(dinero,cuenta2);
                default -> {
                }
            }
        }while(opcion != 5);
    }
}

