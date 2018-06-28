package lesson_06_29.drinks;

public class Water implements Drink {


    private boolean still;
    private double kaina;

    public Water(boolean still,double kaina) {
        this.still = still;

        if (still == true) {
            this.kaina = 1;
        } else if (still == false) {
            this.kaina = 2;
          }
    }
}
