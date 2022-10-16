package behavioral.visitor;

public class Monitor implements ComputerPart{

    @Override
    public void doSomething(Visitor visitor) {
        visitor.visit(this);
    }
}
