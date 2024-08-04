import java.util.Scanner;
public class parimpar {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       for (int i = 1; i < 10;){

           System.out.println("digite um numero inteiro");
           int numero = scanner.nextInt();
           if (numero % 2 == 0) {
               System.out.println("o numero" + numero + "é par");

           } else {
               System.out.println("o numero " + numero + "é impar");

           }
       }
    }

}
