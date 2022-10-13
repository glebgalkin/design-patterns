package behavioral.state;

public class Quiet implements State{

    @Override
    public void sendMessage() {
        System.out.print("Sending the message...");
    }

    @Override
    public void updateStatus() {
        System.out.print("Updating status...");
    }

    @Override
    public void receiveMessage() {
        System.out.print("Can not receive message. I am in quiet mode...");
    }
}
