package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dela on 2/2/18.
 */
public class Fruit implements IFruitSpeaker {
    private float apple;
    private float banana;
    private float peach;
    private List<IFruitListener> listeners;

    public Fruit(float apple, float banana, float peach) {
        this.apple = apple;
        this.banana = banana;
        this.peach = peach;
        listeners = new ArrayList<>();
    }

    public float getApple() {
        return apple;
    }

    public void setApple(float apple) {
        this.apple = apple;
    }

    public float getBanana() {
        return banana;
    }

    public void setBanana(float banana) {
        this.banana = banana;
    }

    public float getPeach() {
        return peach;
    }

    public void setPeach(float peach) {
        this.peach = peach;
    }


    @Override
    public void addListener(IFruitListener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeListener(IFruitListener listener) {
        if(listeners.contains(listener)) {
            listeners.remove(listener);
        }
    }

    @Override
    public void sendPrice() {
        for (IFruitListener listener : listeners) {
            listener.getPrice(apple, banana, peach);
        }
    }
}
