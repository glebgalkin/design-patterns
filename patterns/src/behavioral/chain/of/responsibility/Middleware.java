package behavioral.chain.of.responsibility;

public abstract class Middleware {

    private Middleware next;

    public static Middleware link(Middleware first, Middleware... chain) {

        Middleware head = first;

        for (Middleware middleware : chain) {
            head.next = middleware;
            head = middleware;
        }

        return first;
    }

    public abstract boolean check(String login, String password);

    public boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }
}
