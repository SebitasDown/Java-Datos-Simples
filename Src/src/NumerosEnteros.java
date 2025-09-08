import java.util.Scanner;
public class NumerosEnteros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int a = sc.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int b = sc.nextInt();

        System.out.println("¿Ambos son positivos? " + (a > 0 && b > 0));
        System.out.println("¿Al menos uno es mator que 100? " + (a == 100 || b == 100));
        System.out.println("¿El primero no es igual al segundo? " + (a!= b));
    }
}
