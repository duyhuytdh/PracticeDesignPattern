package decorator.pattern.com;

public class DarkRoast extends  Beverage {
    public DarkRoast(){
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
