package behavioral.state;

interface State {

    abstract void sendMessage();
    abstract void updateStatus();
    abstract void receiveMessage();
}
