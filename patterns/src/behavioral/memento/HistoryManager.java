package behavioral.memento;

import java.util.Stack;

public class HistoryManager implements Memento{

    private Stack<String> httpAddresses = new Stack<>();

    @Override
    public void undo() {
        httpAddresses.pop();
    }

    public void visit(String address){
        httpAddresses.push(address);
    }

    public void printHistory(){
        for(String k : httpAddresses){
            System.out.println(k);
        }
    }
}
