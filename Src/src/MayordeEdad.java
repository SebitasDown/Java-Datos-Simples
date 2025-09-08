import  java.util.Scanner;
public class MayordeEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu edad: ");
        int edad = sc.nextInt();

        System.out.println(edad >=18);
    }
}
