public class Main {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao Screen Match!!");
        System.out.println("Filme: Top Gun Maverick");

        int anoDoFilme = 2022;
        System.out.println("Ano de Lançamento: " + anoDoFilme);
        boolean inclusoNoPlano = true;
        double notaDoFilme = 8.1;
        double media = (8.1 + 7 + 9)/3;
        System.out.println("média de notas: " + media);
        System.out.println("Nota do filme: " + notaDoFilme);
         String sinopse;
         sinopse = " Filme muito bom \n feito pelo gala dos anos 80";
        System.out.println(sinopse);

        //casting corventendo a variável
        int classificacao = (int) (media/2);
        System.out.println("Classificaçao: " + classificacao + " Estrelas");

//            double temperaturaCeu = 35;
//            double tempFahre = (temperaturaCeu * 1.8) + 32;
//            String mensagem = String.format("a temperatura em graus é: %2f que equivale em fahrenheint a: %2f", temperaturaCeu , tempFahre);
//            System.out.println( mensagem);
    }
}