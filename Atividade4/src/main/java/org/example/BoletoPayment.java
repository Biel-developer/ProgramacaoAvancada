package org.example;

import java.util.Random;

public class BoletoPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        String boletoCode = "BOLETO-" + new Random().nextInt(1000000);
        System.out.println("Pagamento via Boleto gerado!");
        System.out.println("Codigo do boleto: " + boletoCode);
    }

}
