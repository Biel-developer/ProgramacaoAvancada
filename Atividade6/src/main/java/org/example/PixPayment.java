package org.example;

public class PixPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Pagamento via Pix realizado. Codigo: " + Math.random());
    }
}
