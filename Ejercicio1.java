import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el nombre");
    String nombre = sc.nextLine();
    System.out.println("edad");
    int edad = sc.nextInt();
    System.out.println("Sueldo deseado");
    double sueldo = sc.nextDouble();
    double totalSueldo = sueldo * 1.15;
    System.out.println("Hola " + nombre + ", tu edad es " + edad + " y tu sueldo deseado es " + sueldo + ". Con el aumento del 15%, tu sueldo total sería: " + totalSueldo);

    }
}