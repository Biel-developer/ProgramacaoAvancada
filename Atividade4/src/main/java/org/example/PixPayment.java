package org.example;

import java.util.Random;

public class PixPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        String pixCode = "PIX-" + new Random().nextInt(1000000);
        System.out.println("Pagamento via Pix realizado com sucesso!");
        System.out.println("Codigo Pix: " + pixCode);
    }

}
