package org.example;

import java.util.Scanner;

public class CreditCardPayment implements PaymentStrategy{
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void processPayment(double amount) {
        System.out.print("Digite o numero do cartao (ficticio): ");
        String cardNumber = scanner.nextLine();
        System.out.println("Pagamento de R$" + amount + " realizado com sucesso no cartao " + cardNumber);
    }

}
