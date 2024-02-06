package poly.ex.sender;

import java.util.Scanner;

public class SendMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("보내실 메세지를 입력해주세요: ");
        String message = scanner.nextLine();

        Sender[] senders = {new EmilaSender(), new SmsSender(), new FaceBookSender()};
        for (Sender sender : senders) {
            sender.sendMessage(message);
        }
    }
}
