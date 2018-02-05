package observer;

/**
 * Created by dela on 2/4/18.
 */
public class CCompany implements IFruitListener {
    private float peach;

    public CCompany() { }

    public float getPeach() {
        return peach;
    }

    public void setPeach(float peach) {
        this.peach = peach;
    }

//    @Override
//    public void getPrice(Fruit fruit) {
//        peach = fruit.getPeach();
//        System.out.println("peach`s price: " + peach);
//    }

    @Override
    public void getPrice(float apple, float banana, float peach) {

    }
}
