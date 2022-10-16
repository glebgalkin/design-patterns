package behavioral.visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Computer implements ComputerPart{

    private List<ComputerPart> computerPartList;

    Computer(){
        computerPartList = Arrays.asList(new Keyboard(), new Monitor(), new Mouse());
    }

    @Override
    public void doSomething(Visitor visitor) {
        computerPartList.forEach(e-> e.doSomething(visitor));
        visitor.visit(this);
    }
}
