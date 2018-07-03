package lesson_06_29_pizzeria.food;

import lesson_06_29_pizzeria.Sauce;

import static lesson_06_29_pizzeria.Sauce.HOT;
import static lesson_06_29_pizzeria.Sauce.MILD;
import static lesson_06_29_pizzeria.Sauce.MIX;

public class PizzaSalami implements Food {

    private double kaina;

    public PizzaSalami(Sauce sauce) {
        this.kaina = 12;
        if(sauce == MILD) {
            this.kaina = 12 + MILD.getPrice();
        } else if(sauce == MIX) {
            this.kaina = 12 + MIX.getPrice();
        } else if(sauce == HOT) {
            this.kaina = 12 + HOT.getPrice();
        }
    }
    public double getKaina() {
        return kaina;
    }
    @Override
    public double orderPrice() {
        return this.kaina;
    }
}
