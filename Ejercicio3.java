import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Contador=0;
        int Pin=4215;
        do {
            System.out.println("Ingrese la contraseña, intento numero: " + (Contador + 1));
            int Clave=sc.nextInt();
            int Intentos = 3 - (Contador + 1);
            if (Clave==Pin) 
            {
                System.out.println("Contraseña correcta");
                break;
            }else{
                    System.out.println("Contraseña incorrecta le quedan " + Intentos + " intentos");
            }
            Contador++;
        } while (Contador<3);
    }
}
