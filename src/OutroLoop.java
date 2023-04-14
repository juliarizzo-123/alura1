import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int numAvalicao = 0;

        while (nota != 11){
            System.out.println("Qual é sua avaliaçao para esse filme de 0 a 10 ? ");
            nota = leitura.nextDouble();
            if (nota != 11){
                mediaAvaliacao += nota;
                numAvalicao++;
            }else {
                System.out.println("A avaliaçao media do filme é: " + mediaAvaliacao/numAvalicao);
            }

        }



    }
}
