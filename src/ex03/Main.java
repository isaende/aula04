package ex03;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static BilheteUnico[] bilhete = new BilheteUnico[10];
    static int index = 0;

    static void main(String[] args) {
        int opcao;

        do {
            System.out.println("____________________________________");
            System.out.println("ESCOLHA UMA OPÇÃO");
            System.out.println(" ❤ 1 - Cadastrar bilhete ");
            System.out.println(" ❤ 2 - Carregar bilhete ");
            System.out.println(" ❤ 3 - Passar na catraca ");
            System.out.println(" ❤ 4 - Sair ");
            System.out.println("____________________________________");
            System.out.println();
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> cadastrarBilhete();
                case 2 -> carregarBilhete();
                case 3 -> passarNaCatraca();
                case 4 -> System.out.println("Fim da execução.");
                default -> System.out.println("Opção inválida.");
            }
        }while (opcao != 4);

    }


    private static void cadastrarBilhete(){
        String nome;
        long cpf;
        String tipoTarifa;

        if(index < bilhete.length){
            System.out.println("Digite o nome do usuário: ");
            nome = sc.next();

            System.out.println("Digite o CPF do usuário: ");
            cpf = sc.nextLong();

            System.out.println("Digite o tipo de tarifa (estudante | professor | normal): ");
            tipoTarifa = sc.next();

            Usuario usuario = new Usuario(nome, cpf, tipoTarifa);
            bilhete[index] = new BilheteUnico(usuario);

            index++;
        }else {
            System.out.println("Erro ao gerar o bilhete! Procure um posto de atendimento.");
        }
    }


    private static BilheteUnico pesquisar(){

    long cpf;

        System.out.println("Digite o CPF para pesquisa: ");
        cpf = sc.nextLong();

        for(int i = 0; i < index; i++){
            if(bilhete[i].usuario.cpf == cpf){
                return bilhete[i];
            }
        }
        return null;
    }

    private static void carregarBilhete() {
        double valor;
        BilheteUnico bilheteEncontrado = pesquisar();

        if(bilheteEncontrado != null){
            System.out.println("Digite o valor da recarga: ");
            valor = sc.nextDouble();
            bilheteEncontrado.carregar(valor);
        }
    }
}



    private static void passarNaCatraca() {
        if(bilhete.passarCatraca() == false){
            System.out.println("Saldo insuficiente.");
        }
        System.out.println("Saldo atual: ");
        consultarSaldo();
    }

    private static void consultarSaldo() {
        System.out.println();
        System.out.println("Saldo atual R$ - " + bilhete.saldo);
        System.out.println();
    }

