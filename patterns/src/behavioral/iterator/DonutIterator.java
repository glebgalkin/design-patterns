package behavioral.iterator;

import java.util.List;

public class DonutIterator implements FoodIterator{

    private List<Donut> donutList;
    private int currentPosition = 0;

    public int getCurrentPosition() {
        return currentPosition;
    }

    public DonutIterator(List<Donut> donutList) {
        this.donutList = donutList;
    }

    @Override
    public boolean hasNext() {
        return currentPosition<donutList.size();
    }

    @Override
    public Donut getNext() {
        if(!hasNext()){
            return null;
        }
        Donut cake = donutList.get(currentPosition);
        currentPosition ++;
        return cake;
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }
}
