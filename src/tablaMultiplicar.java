import java.util.Scanner;
public class tablaMultiplicar {
    public static void main(String[] args){
        Scanner datos=new Scanner(System.in);
        System.out.println("Ingrese el número del que desea la tabla de multiplicar (del 1 al 10): ");//print-imprimir sin enter; println - imprimir \n
        int multiplicando=datos.nextInt();//nextLine(), nextDouble(), nextFloat()
        if(multiplicando<=0 || multiplicando>10){
            System.out.println("El número ingresado no es válido ❌");
        }else{
            System.out.println("Ingrese hasta que multiplicador: ");
            int multiplicador= datos.nextInt();
            System.out.println("\nTABLA DEL MULTIPLICAR DEL NÚMERO "+multiplicando+" 🔢\n");
            for (int i = 1; i <=multiplicador ; i++) {
                // 2 x i = (2*i)
                System.out.println(multiplicando+" x "+i+" = "+(multiplicando*i));
            }
        }
    }
}