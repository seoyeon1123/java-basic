package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MessageMain {
    public static void main(String[] args) {
        //Queue 컬렉션 생성
        Queue<Message> messageQueue = new LinkedList<>();

        messageQueue.offer(new Message("sendMail","이서연"));
        messageQueue.offer(new Message("sendSMS","표원식"));
        messageQueue.offer(new Message("sendKakaoTalk","릴리화이트"));

        while(!messageQueue.isEmpty()){
            Message message = messageQueue.poll();
            switch (message.command){
                case "sendMail":
                    System.out.println(message.to + "에게 메일을 보냅니다.");
                    break;
                case "sendSMS":
                    System.out.println(message.to + "에게 SMS을 보냅니다.");
                    break;
                case "sendKakaoTalk":
                    System.out.println(message.to + "에게 카카오톡을 보냅니다.");
                    break;
            }
        }
    }
}

