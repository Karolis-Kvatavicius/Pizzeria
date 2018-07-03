package lesson_06_29_pizzeria.drinks;

public class Water implements Drink {


    private boolean still;
    private double kaina;

    public Water(boolean still) {
        this.still = still;

        if (still) {
            this.kaina = 1;
        } else if (!still) {
            this.kaina = 2;
        }
    }
    public double getKaina() {
        return kaina;
    }
    @Override
    public Drink orderPrice() {
        return this;
    }

}
