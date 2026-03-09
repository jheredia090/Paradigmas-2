import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingrese su edad");
        int edad=sc.nextInt();
       
        if(edad >= 18 && edad < 65)
        {
            System.out.println("Tiene invitacion?(S/N)");
            char invitacion=sc.next().charAt(0);
            if(invitacion=='s' || invitacion=='S'){
                System.out.println("Bienvenido");
            }else{
                System.out.println("Se accede con invitacion unicamente");

            }
        }else if(edad>=65)
        {
            System.out.println("Bienvenido al evento");
        }else{
            System.out.println("Tiene invitacion el tutor?(S/N)");
            char invitacionTutor=sc.next().charAt(0);
            if (invitacionTutor=='s' || invitacionTutor=='S') {
                System.out.println("Bienvenido puede pasar");
            }else{
                System.out.println("Debe tener invitacion para pasar");
            }

        }
        sc.close();
    }
}
