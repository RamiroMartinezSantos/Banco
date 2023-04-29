import java.util.Scanner;
public class Depositar {
    public Double deposito(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" INGRESE EL MONTO A DEPOSITAR.");
        return scanner.nextDouble();
    }
}
