package observer;

/**
 * Created by dela on 2/4/18.
 */
public class BCompany implements IFruitListener {
    private float banana;

    public BCompany() { }

    public float getBanana() {
        return banana;
    }

    public void setBanana(float banana) {
        this.banana = banana;
    }

//    @Override
//    public void getPrice(Fruit fruit) {
//        banana = fruit.getBanana();
//        System.out.println("banana`s price: " + banana);
//    }

    @Override
    public void getPrice(float apple, float banana, float peach) {

    }
}
