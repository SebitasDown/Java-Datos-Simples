import java.util.Scanner;
public class CondicionalN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu edad: ");
        int edad = sc.nextInt();

        if (edad <=12){
            System.out.println("Niño");
        }else if (edad >12 && edad < 17){
            System.out.println("Adolescente");
        } else if (edad >= 18) {
            System.out.println("Adulto");
        }
    }
}
