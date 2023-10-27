import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ContaBancaria> contas = new ArrayList<>();

        while (true) {
            System.out.println("1. Criar nova conta");
            System.out.println("2. Acessar conta existente");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o número da conta: ");
                String numeroConta = scanner.next();
                System.out.print("Digite o nome do titular da conta: ");
                String nomeTitular = scanner.next();
                ContaBancaria novaConta = new ContaBancaria(numeroConta, nomeTitular);
                contas.add(novaConta);
                System.out.println("Conta criada com sucesso.");
            } else if (opcao == 2) {
                System.out.print("Digite o número da conta: ");
                String numeroConta = scanner.next();
                boolean contaEncontrada = false;
                for (ContaBancaria conta : contas) {
                    if (conta.getNumeroConta().equals(numeroConta)) {
                        contaEncontrada = true;
                        System.out.println("Bem-vindo, " + conta.getNomeTitular());
                        while (true) {

                        }
                    }
                }
                if (!contaEncontrada) {
                    System.out.println("Conta não encontrada. Verifique o número da conta.");
                }
            } else if (opcao == 3) {
                System.out.println("Obrigado por usar nosso serviço. Até logo!");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
