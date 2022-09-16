package behavioral.chain.of.responsibility;

public class RoleCheck extends Middleware {

    @Override
    public boolean check(String login, String password) {
        if (login.equals("user")) {
            System.out.println("Hello regular user");
            return true;
        }
        return checkNext(login, password);

    }
}
