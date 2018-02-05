package observer;

/**
 * Created by dela on 2/2/18.
 */
public interface IFruitSpeaker {
    void addListener(IFruitListener listener);
    void removeListener(IFruitListener listener);
    void sendPrice();
}
