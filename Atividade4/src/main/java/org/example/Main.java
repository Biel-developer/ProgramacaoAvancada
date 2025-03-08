package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Selecione o metodo de pagamento:");
            System.out.println("1: Pix");
            System.out.println("2: Cartao de Credito");
            System.out.println("3: Boleto");

            int choice = scanner.nextInt();
            System.out.print("Digite o valor da transacao: ");
            double amount = scanner.nextDouble();

            PaymentStrategy paymentStrategy = null;

            switch (choice) {
                case 1:
                    paymentStrategy = new PixPayment();
                    break;
                case 2:
                    paymentStrategy = new CreditCardPayment();
                    break;
                case 3:
                    paymentStrategy = new BoletoPayment();
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    continue;
            }

            PaymentProcessor processor = new PaymentProcessor(paymentStrategy);
            processor.process(amount);

            System.out.print("Deseja fazer outro pagamento? (s/n): ");
            char resposta = scanner.next().toLowerCase().charAt(0);
            if (resposta != 's') {
                continuar = false;
            }
        }

        scanner.close();
    }
}
