package behavioral.chain.of.responsibility;

import java.util.HashMap;

public class Server {

    private Middleware middleware;
    private HashMap<String, String> users;


    public Server(){
        users = new HashMap<>();
    }

    public void setMiddleware(Middleware middleware){
        this.middleware = middleware;
    }

    public void register(String login, String password){
        users.put(login,password);
    }

    public boolean logIn(String login, String password){
        return middleware.check(login, password);
    }
}
