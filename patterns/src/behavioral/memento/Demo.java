package behavioral.memento;

public class Demo {

    public static void main(String[] args) {

        HistoryManager historyManager = new HistoryManager();

        historyManager.visit("youtube.com");
        historyManager.visit("instagram.com");
        historyManager.visit("linkedin.com");
        historyManager.undo();
        historyManager.visit("odnoklassniki.ru");
        historyManager.printHistory();
    }
}
