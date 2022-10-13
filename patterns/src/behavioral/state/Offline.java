package behavioral.state;

public class Offline implements State{

    @Override
    public void sendMessage() {
        System.out.print("Impossible to send message, the user is offline.");
    }

    @Override
    public void updateStatus() {
        System.out.print("Impossible to update status, the user is offline.");
    }

    @Override
    public void receiveMessage() {
        System.out.print("Impossible to receive message, the user is offline.");
    }
}
