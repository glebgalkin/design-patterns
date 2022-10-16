package behavioral.visitor;

public interface Visitor {
    void visit(Mouse mouse);
    void visit(Monitor monitor);
    void visit(Keyboard keyboard);
    void visit(Computer computer);
}
