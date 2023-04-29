import java.util.Scanner;

public class Transferir {
    public Double transferencia(Double dinero,Double cuenta2){
        Retirar retirar = new Retirar();
        Scanner scanner = new Scanner(System.in);

        Double monto;
        System.out.println(" MENU DE TRANSFERENCIA ");
        System.out.println("DINERO EN LA CUENTA A TRANSFERIR");
        System.out.println(cuenta2);
        System.out.println(" Cuanto desea transferir? ");
        monto = scanner.nextDouble();

        dinero = retirar.retirar(dinero,monto);
        cuenta2 = cuenta2 + monto;


        System.out.println("DINERO EN LA CUENTA DESPUES DE TRANSFERIR");
        System.out.println(cuenta2);

        return dinero;
    }
}
