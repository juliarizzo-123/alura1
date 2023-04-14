import java.util.Scanner;

public class DesafioBanco {
    public static void main(String[] args) {

        String nome = "Julia Silva Rizzo";
        int saldo = 2500;

        System.out.println("************************************");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: Corrente");
        System.out.println("Saldo em conta: " + saldo);
        System.out.println("************************************ \n");

        System.out.println("OPERAÇÕES:\n 1 - Consultar Saldo \n 2 - Depositar \n 3 - Transferir \n 4 - Sair");
        Scanner operacao = new Scanner(System.in);
        System.out.println("Digite a opção desejada: ");
        int escolha = operacao.nextInt();

        while (escolha != 4){

            if (escolha == 1){
                System.out.println("Seu saldo é de: " + saldo);
                break;
            } else if (escolha == 2) {
                System.out.println("Quanto voce deseja depositar?: ");
                
            } else if (escolha == 3) {
                System.out.println("Quanto voce deseja transferir?: ");

            }else {
                System.out.println("Opção invalida!");

            }

        if (escolha == 4){
            System.out.println("Saindo.....");

        }
        }








    }



}
