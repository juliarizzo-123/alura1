package desafio_banco;

import java.util.Scanner;

public class DesafioBanco {
    public static void main(String[] args) {

        String nome = "Julia Silva Rizzo";
        int saldo = 2500;
        int escolha = 0;

        System.out.println("************************************");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: Corrente");
        System.out.println("Saldo em conta: " + saldo);
        System.out.println("************************************ \n");


        while (escolha != 4) {

            System.out.println("\nOPERAÇÕES:\n 1 - Consultar Saldo \n 2 - Depositar \n 3 - Transferir \n 4 - Sair");
            Scanner operacao = new Scanner(System.in);
            System.out.println("Digite a opção desejada: ");
            escolha = operacao.nextInt();


            if (escolha == 1) {
                System.out.println("Seu saldo é de: " + saldo);

            } else if (escolha == 2) {
                Scanner deposito = new Scanner(System.in);
                System.out.println("Quanto voce deseja depositar?: ");
                double valorDeposito = deposito.nextInt();
                saldo += valorDeposito;
                System.out.println("Você depositou R$: " + valorDeposito);

            } else if (escolha == 3) {
                Scanner transferir = new Scanner(System.in);
                System.out.println("Quanto voce deseja transferir?: ");
                double valorTransferir= transferir.nextInt();
                if (valorTransferir > saldo){
                    System.out.println("Saldo insuficiente para transferir R$: " + valorTransferir + " Seu saldo em conta é: " + saldo);
                }else {
                    saldo -= valorTransferir;
                    System.out.println("Você transferiu R$: " + valorTransferir);
                }
            } else if (escolha == 4) {
                System.out.println("Saindo.....");
            } else {
                System.out.println("Opção invalida!");

            }


        }


    }


}
