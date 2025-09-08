import java.util.Scanner;
public class CondicionalN1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu edad: ");
        int edad = sc.nextInt();

        if (edad > 0) {
            System.out.println("Es Positivo");
        } else if (edad < 0) {
            System.out.println("Es Negativo");
        }else{
            System.out.println("Es cero");
        }
    }
}