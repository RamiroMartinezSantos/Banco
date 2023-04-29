import java.util.Scanner;

public class Retirar {
    public Double retiro(Double dinero){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" INGRESE EL MONTO A RETIRAR");
        Double retiro = scanner.nextDouble();
        if(retiro < dinero) {
            return retiro;
        }else{
            System.out.println("SALDO INSUFICIENTE");
        }
        return 0.0;
    }
    public Double retirar(Double dinero,Double monto){
        if(monto < dinero) {
            return dinero-monto;
        }else{
            System.out.println("SALDO INSUFICIENTE");
        }
        return 0.0;
    }
}
