package org.example;

public class PaymentFactory {
    public static PaymentStrategy createPayment(String type) {
        return switch (type.toLowerCase()) {
            case "pix" -> new PixPayment();
            case "cartao" -> new CreditCardPayment();
            case "boleto" -> new BoletoPayment();
            default -> throw new IllegalArgumentException("Metodo de pagamento invalido.");
        };
    }
}
