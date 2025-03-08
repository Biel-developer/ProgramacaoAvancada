package org.example;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Pagamento via Cartao de Credito realizado com sucesso.");
    }
}
