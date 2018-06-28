package lesson_06_29;

import java.util.Scanner;

public class PizzeriaMain {

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in );

        String line = null;


        int meniuPasirinkimas = -1;


        do {
            System.out.println( "Pasirinkit uzsakyma : 1. Pasirinkti gerimus,  2. Pasirinkiti maista, 3. Gauti saskaita, 0. Iseiti." );


            meniuPasirinkimas = input.nextInt();

            switch (meniuPasirinkimas) {
                case 0:
                    break;
                case 1:

                    System.out.println( "Pasirinkit gerimus" );

                    do {
                        line = input.nextLine();

                        if (line.equalsIgnoreCase( "Water" )) {

                        }

                    } while
                            (!line.equalsIgnoreCase( "end" ));
            }
        }
        while (meniuPasirinkimas != 0);


    }

}
