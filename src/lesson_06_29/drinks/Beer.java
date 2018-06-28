package lesson_06_29.drinks;

public class Beer implements Drink {
    private String rusis;
    private double kaina;

    public Beer(String rusis, double kaina) {
        this.rusis = rusis;

        if (rusis == ("light")) {
            this.kaina = 3;
        } else if (rusis == "black") {
            this.kaina = 3.5;
        } else if (rusis == "white") {
            this.kaina = 3.3;
        } else {


            this.kaina = 0;
        }
    }


}