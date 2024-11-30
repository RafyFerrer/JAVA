import Numeros.*;
import java.util.Scanner;

public class Operaciones{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un valor: ");
        float n = sc.nextFloat();
        Numero num = new Numero(n);
        System.out.println(num.getFactorial());
        if (num.getEsprimo() == true)
            System.out.print("Numero Primo");
    }
}