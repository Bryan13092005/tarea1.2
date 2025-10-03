import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner datos=new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre=datos.nextLine();
        while (nombre.isEmpty()){
            System.out.println("Nombre incorrecto. Ingrese nuevamente: ");
            nombre=datos.nextLine();
        }
        System.out.println("Ingrese los 3 aportes\nAPORTE 1: ");
        double nota1=datos.nextDouble();
        System.out.println("APORTE 2: ");
        double nota2=datos.nextDouble();
        System.out.println("APORTE 3: ");
        double nota3=datos.nextDouble();
        double promedio=(nota1+nota2+nota3)/3;
        System.out.println("El promedio es: "+(Math.round(promedio*100.0)/100.0));
        if (promedio>=7){
            System.out.println("APROBADO ✅");
        }else{
            System.out.println("REPROBADO ❌");
        }
    }
}