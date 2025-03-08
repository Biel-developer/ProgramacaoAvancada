package org.example;

public class BoletoPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Pagamento via Boleto realizado. Codigo: " + (int) (Math.random() * 1000000));
    }
}
