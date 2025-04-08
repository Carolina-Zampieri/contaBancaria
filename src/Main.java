import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner contaBancaria = new Scanner(System.in);

        String nome = "Bruce Wayne";
        String tipoConta = "Corrente";
        int numeroConta = 123456;
        double saldo = 8999.48;
        int numeroDigitado = 0;

        System.out.println("*******************************");
        System.out.println("Nome:            " + nome);
        System.out.println("Tipo de Conta:   " + tipoConta);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo:           " + saldo);
        System.out.println("*******************************");

        String menu = """
                
                - Digite a opção desejada no menu abaixo -
                1. Saldo
                2. Receber
                3. Transferir
                4. Sair
                
                """;

        while (numeroDigitado != 4) {
            System.out.println(menu);
            numeroDigitado = contaBancaria.nextInt();
            if (numeroDigitado == 1) {
                System.out.println("O seu saldo é de R$: " + saldo);
            } else if (numeroDigitado == 2) {
                System.out.println("Insira o valor desejado na conta:");
                double valorRecebido = contaBancaria.nextDouble();
                System.out.println("O saldo atual da conta após o recebimento é de R$" + (saldo + valorRecebido));
            } else if (numeroDigitado == 3) {
                System.out.println("Insira o valor a ser transferido da conta:");
                double valorTransferido = contaBancaria.nextDouble();
                    if (valorTransferido > saldo) {
                        System.out.println("A conta não tem saldo suficiente para realizar essa transferência. \nOperação não concluída");
                    } else {
                        System.out.println("O saldo atual da conta após a transferência é de R$" + (saldo - valorTransferido));
                    }
            } else if (numeroDigitado != 4) {
                System.out.println("Item não encontrado, por favor insira um número válido");
            } else {
                System.out.println("Encerrado!");
            }
        }
    }
}