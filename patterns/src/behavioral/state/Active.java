package behavioral.state;

public class Active implements State{

    @Override
    public void sendMessage() {
        System.out.print("Sending the message...");
    }

    @Override
    public void updateStatus() {
        System.out.print("Updating the status...");
    }

    @Override
    public void receiveMessage() {
        System.out.print("Receiving the message...");
    }
}
