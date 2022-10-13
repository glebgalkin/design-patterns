package behavioral.state;

public class Demo {

    public static void main(String[] args) {

        User user = new User();
        user.state.sendMessage();

        user.login();
        user.state.sendMessage();

        user.setNotificationsOff();
        user.state.receiveMessage();
    }
}
