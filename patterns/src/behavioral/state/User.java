package behavioral.state;

public class User {

    public State state;

    public User(){
        state = new Offline();
    }

    public void login(){
        state = new Active();
    }

    public void setNotificationsOff(){
        state = new Quiet();
    }
}
