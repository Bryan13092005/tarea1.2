import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args){
        Scanner datos=new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String nombre=datos.nextLine();
        while (nombre.isEmpty()){
            System.out.println("Nombre incorrecto. Ingrese nuevamente: ");
            nombre=datos.nextLine();
        }
        System.out.println("Ingrese su edad: ");
        int edad=datos.nextInt();
        System.out.println("Ingrese su altura: ");
        double altura=datos.nextDouble();
        datos.nextLine();
        if (edad<0 || altura <0) {
            System.out.println("La edad y altura deben ser positivos");
        }else if (edad >=18 && altura>=1.60) {
            System.out.println("ACEPTADO EN EL EQUIPO ✅");
        }else{
            System.out.println("No cumple los requisitos ❌");
        }
    }
}
