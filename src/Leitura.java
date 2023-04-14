import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("qual seu filme favorito? ");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento? ");
        int anoLancamento = leitura.nextInt();
        System.out.println("Qual sua nota para esse filme? ");
        double avaliacao = leitura.nextDouble();

        System.out.println("seu filme favorito é: " + filme);
        System.out.println("o ano de lançamento é: " + anoLancamento);
        System.out.println("sua nota para esse filme é: " + avaliacao);



    }
}
