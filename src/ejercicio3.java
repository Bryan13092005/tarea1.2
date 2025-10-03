import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args){
        Scanner datos=new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 10 para crear la tabla de multiplicar: ");
        int multiplicando=datos.nextInt();
        if (multiplicando<1 || multiplicando>10){
            System.out.println("Has ingresado un número inválido");
        }else {
            System.out.println("TABLA DE MULTIPLICAR DEL "+multiplicando);
            for (int i = 1; i <= 12; i++) {
                System.out.println(multiplicando+" x "+i+" = "+(multiplicando*i));
            }

        }
    }
}
