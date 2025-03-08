package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner fora do loop principal

        while (true) {
            System.out.println("Escolha o metodo de pagamento:");
            System.out.println("1: Pix");
            System.out.println("2: Cartao de Credito");
            System.out.println("3: Boleto");
            System.out.println("4: Sair");
            System.out.println("");
            System.out.print("Qual opcao deseja?: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 4) {
                System.out.println("Saindo...");
                break;
            }

            if (option < 1 || option > 4) {
                System.out.println("Opção invalida! Tente novamente.");
                continue;
            }

            System.out.print("Digite o valor da transacao: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();

            String type = switch (option) {
                case 1 -> "pix";
                case 2 -> "cartao";
                case 3 -> "boleto";
                default -> null;
            };

            if (type != null) {
                PaymentStrategy paymentStrategy = PaymentFactory.createPayment(type);
                PaymentProcessor processor = new PaymentProcessor(paymentStrategy);
                processor.process(amount);
            }

            System.out.print("Deseja fazer outro pagamento? (s/n): ");
            char resposta = scanner.next().toLowerCase().charAt(0);
            if (resposta != 's') {
                System.out.println("Encerrando o programa...");
                break;
            }
        }

        scanner.close();
    }
}