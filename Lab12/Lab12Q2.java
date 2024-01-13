package Lab12;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// DEC 2021
class Chat {
    private boolean isUser1Sending = true;
    public synchronized void sendMessage(String message, String sender) {
        try {
            while (!isUser1Sending) {
                wait();
            }
            System.out.println(sender + ": " + message);
            isUser1Sending = false;
            notify();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    public synchronized void recvMessage(String sender) {
        try {
            while (isUser1Sending) {
                wait();
            }
            String message = "Hi";
            System.out.println(sender + ": " + message);
            isUser1Sending = true;
            notify();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
class User extends Thread {
    private final Chat chat;
    private final String name;

    public User(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                chat.sendMessage("Hi", name);
            } else {
                chat.recvMessage(name);
            }
        }
    }
}
public class Lab12Q2 {
    public static void main(String[] args) {
        Chat chat = new Chat();
        User user1 = new User(chat, "User1");
        User user2 = new User(chat, "User2");
        user1.start();
        user2.start();
        try {
            user1.join();
            user2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}