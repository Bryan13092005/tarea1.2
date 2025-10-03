import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args){
        Scanner datos=new Scanner(System.in);
        System.out.println("¿Cúantos números desea ingresar?: ");
        int numeroDatos=datos.nextInt();
        int contador=0;
        for (int i = 0; i < numeroDatos; i++) {
            System.out.println("Ingrese el valor "+(i+1)+": ");
            int numeroIngresado=datos.nextInt();
            if (numeroIngresado%2==0){
                contador++;
            }
        }
        System.out.println("Has ingresado "+contador+" números pares.");
    }
}
