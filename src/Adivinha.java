import java.util.Random;
import java.util.Scanner;

public class Adivinha {
    public static void main(String[] args) {

        int numSorteado = new Random().nextInt(100);

        System.out.println("Descubra o numero sorteado de 0 a 100! ");
        System.out.println("Qual voce acha que é? ");

        int tentativa = 0;

        while ( tentativa < 5  ){
            Scanner  num = new Scanner(System.in);
            int numero = num.nextInt();
            tentativa++;

             if (numSorteado == numero) {
                System.out.println("Parabens voce acertou o numero sorteado!!");
                break;
            } else if (numSorteado < numero){
                     System.out.println("o numero que voce escolheu é maior que o numero sorteado!!");
            } else {
                System.out.println("o numero que voce escolheu é menor que o numero sorteado!!");
            }


        }
        if (tentativa == 5){
            System.out.println("Suas tentativas acabaram!!! \n o numero sorteado é: " + numSorteado);
        }


    }
}