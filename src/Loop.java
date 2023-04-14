import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int numAvalicao = 4;

        for (int i = 0; i < numAvalicao; i++){
            System.out.println("Qual é sua avaliaçao para esse filme? ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;

        }

        System.out.println("A avaliaçao media do filme é: " + mediaAvaliacao/numAvalicao);



    }
}
