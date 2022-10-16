package behavioral.visitor;

public class Mouse implements ComputerPart{

    @Override
    public void doSomething(Visitor visitor) {
        visitor.visit(this);
    }
}
