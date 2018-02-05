package observer;

/**
 * Created by dela on 2/2/18.
 */
public class ACompany implements IFruitListener {
    private float apple;

    public ACompany() { }

    public float getApple() {
        return apple;
    }

    public void setApple(float apple) {
        this.apple = apple;
    }

    @Override
    public void getPrice(float apple, float banana, float peach) {
        this.apple = apple;
        System.out.println("apple`s price: " + apple);
    }
}
