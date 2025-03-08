package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha o tipo de notificação:");
            System.out.println("1. Email");
            System.out.println("2. SMS");
            System.out.println("3. Push Notification");

            System.out.print("Digite o número da opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            String notificationType = "";
            switch (escolha) {
                case 1:
                    notificationType = "email";
                    break;
                case 2:
                    notificationType = "sms";
                    break;
                case 3:
                    notificationType = "push";
                    break;
                default:
                    System.out.println("Opção invalida.");
                    return;
            }

            System.out.println(" ");
            System.out.print("Digite a mensagem para enviar: ");
            System.out.println(" ");
            String message = scanner.nextLine();

            Notification notification = NotificationFactory.createNotification(notificationType);

            if (notification != null) {
                notification.send(message);
            }
            System.out.println(" ");
            System.out.print("Deseja fazer outro pagamento? (s/n): ");
            System.out.println(" ");
            char resposta = scanner.next().toLowerCase().charAt(0);
            if (resposta != 's') {
                continuar = false;
            }
        }
        scanner.close();
    }
}