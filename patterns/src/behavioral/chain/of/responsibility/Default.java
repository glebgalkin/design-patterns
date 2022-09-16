package behavioral.chain.of.responsibility;

public class Default extends Middleware{

    @Override
    public boolean check(String login, String password) {
        if(login.equals("admin") && password.equals("admin")){
            System.out.println("Successfully logged in");
            return true;
        }
        return checkNext(login,password);
    }
}
