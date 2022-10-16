package behavioral.visitor;

public class Demo {

    public static void main(String[] args) {

        ComputerPartVisitor visitor = new ComputerPartVisitor();

        Computer computer = new Computer();
       computer.doSomething(visitor);
    }
}
