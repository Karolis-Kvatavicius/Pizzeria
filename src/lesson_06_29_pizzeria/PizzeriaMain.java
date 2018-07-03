package lesson_06_29_pizzeria;

import lesson_06_29_pizzeria.drinks.Beer;
import lesson_06_29_pizzeria.drinks.Coffee;
import lesson_06_29_pizzeria.drinks.Tea;
import lesson_06_29_pizzeria.drinks.Water;
import lesson_06_29_pizzeria.food.PizzaFunghi;
import lesson_06_29_pizzeria.food.PizzaSalami;
import lesson_06_29_pizzeria.food.PizzaWrap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static lesson_06_29_pizzeria.Sauce.HOT;
import static lesson_06_29_pizzeria.Sauce.MILD;
import static lesson_06_29_pizzeria.Sauce.MIX;

public class PizzeriaMain {

//TODO prideti if elsuose varianta else, kai vartotojo ivestis neatitinka nei vieno is galimu variantu

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in );
        List<OrderItem> orderItems = new ArrayList<>(  );
        String line;
        int meniuPasirinkimas;

        do {
            System.out.println();
            System.out.println( "Pasirinkit uzsakyma : 1. Pasirinkti gerimus,  2. Pasirinkiti maista, 3. Gauti saskaita, 0. Iseiti." );


            meniuPasirinkimas = input.nextInt();

            switch (meniuPasirinkimas) {

                case 0:
                    break;

                //Gerimai
                case 1:

                    System.out.println( "Pasirinkit gerimus" );

                    do {
                        line = input.nextLine();

                        // Water
                        if (line.equalsIgnoreCase( "Water" )) {
                            Water water = new Water( true );
                            int numbers = 0;
                            System.out.println( "Iveskite kieki" );
                            numbers = input.nextInt();
                            orderItems.add( new OrderItem( water, numbers ) );
                        } else if (line.equalsIgnoreCase( "Sparkling water" )) {
                            Water water = new Water( false );
                            int numbers = 0;
                            System.out.println( "Iveskite kieki" );
                            numbers = input.nextInt();
                            orderItems.add( new OrderItem( water, numbers ) );

                            //Beer
                        } else if (line.equalsIgnoreCase( "light beer" )) {
                            Beer beer = new Beer( "light" );
                            int numbers = 0;
                            System.out.println( "Iveskite kieki" );
                            numbers = input.nextInt();
                            orderItems.add( new OrderItem( beer, numbers ) );
                        } else if (line.equalsIgnoreCase( "black beer" )) {
                            Beer beer = new Beer( "black" );
                            int numbers = 0;
                            System.out.println( "Iveskite kieki" );
                            numbers = input.nextInt();
                            orderItems.add( new OrderItem( beer, numbers ) );
                        } else if (line.equalsIgnoreCase( "white beer" )) {
                            Beer beer = new Beer( "white" );
                            int numbers = 0;
                            System.out.println( "Iveskite kieki" );
                            numbers = input.nextInt();
                            orderItems.add( new OrderItem( beer, numbers ) );

                            //Coffee
                        } else if (line.equalsIgnoreCase( "coffee sugar" )) {
                            Coffee coffee = new Coffee( true, false );
                            int numbers = 0;
                            System.out.println( "Iveskite kieki" );
                            numbers = input.nextInt();
                            orderItems.add( new OrderItem( coffee, numbers ) );
                        } else if (line.equalsIgnoreCase( "coffee milk" )) {
                            Coffee coffee = new Coffee( false, true );
                            int numbers = 0;
                            System.out.println( "Iveskite kieki" );
                            numbers = input.nextInt();
                            orderItems.add( new OrderItem( coffee, numbers ) );
                        } else if (line.equalsIgnoreCase( "coffee sugar milk" )) {
                            Coffee coffee = new Coffee( true, true );
                            int numbers = 0;
                            System.out.println( "Iveskite kieki" );
                            numbers = input.nextInt();
                            orderItems.add( new OrderItem( coffee, numbers ) );
                        } else if (line.equalsIgnoreCase( "coffee" )) {
                            Coffee coffee = new Coffee( false, false );
                            int numbers = 0;
                            System.out.println( "Iveskite kieki" );
                            numbers = input.nextInt();
                            orderItems.add( new OrderItem( coffee, numbers ) );

                            //Tea
                        } else if (line.equalsIgnoreCase( "tea sugar" )) {
                            Tea tea = new Tea( true, false );
                            int numbers = 0;
                            System.out.println( "Iveskite kieki" );
                            numbers = input.nextInt();
                            orderItems.add( new OrderItem( tea, numbers ) );
                        } else if (line.equalsIgnoreCase( "tea honey" )) {
                            Tea tea = new Tea( false, true );
                            int numbers = 0;
                            System.out.println( "Iveskite kieki" );
                            numbers = input.nextInt();
                            orderItems.add( new OrderItem( tea, numbers ) );
                        } else if (line.equalsIgnoreCase( "tea sugar honey" )) {
                            Tea tea = new Tea( true, true );
                            int numbers = 0;
                            System.out.println( "Iveskite kieki" );
                            numbers = input.nextInt();
                            orderItems.add( new OrderItem( tea, numbers ) );
                        } else if (line.equalsIgnoreCase( "tea" )) {
                            Tea tea = new Tea( false, false );
                            int numbers = 0;
                            System.out.println( "Iveskite kieki" );
                            numbers = input.nextInt();
                            orderItems.add( new OrderItem( tea, numbers ) );
                        }

                    } while (!line.equalsIgnoreCase( "end" ));
                    break;

                //Maistas
                case 2:
                    System.out.println( "Pasirinkit maista" );

                    do {
                        line = input.nextLine();

                        // Wrap
                        if (line.equalsIgnoreCase( "wrap svelnus" )) {
                            PizzaWrap pizza = new PizzaWrap( MILD );
                            int numbers = 0;
                            System.out.println( "Iveskite kieki" );
                            numbers = input.nextInt();
                            orderItems.add( new OrderItem( pizza, numbers ) );

                        } else if (line.equalsIgnoreCase( "wrap mixas" )) {
                            PizzaWrap pizza = new PizzaWrap( MIX );
                            int numbers = 0;
                            System.out.println( "Iveskite kieki" );
                            numbers = input.nextInt();
                            orderItems.add( new OrderItem( pizza, numbers ) );

                        } else if (line.equalsIgnoreCase( "wrap astrus" )) {
                            PizzaWrap pizza = new PizzaWrap( HOT );
                            int numbers = 0;
                            System.out.println( "Iveskite kieki" );
                            numbers = input.nextInt();
                            orderItems.add( new OrderItem( pizza, numbers ) );

                            // Salami
                        } else if (line.equalsIgnoreCase( "salami svelnus" )) {
                            PizzaSalami pizza = new PizzaSalami( MILD );
                            int numbers = 0;
                            System.out.println( "Iveskite kieki" );
                            numbers = input.nextInt();
                            orderItems.add( new OrderItem( pizza, numbers ) );

                        } else if (line.equalsIgnoreCase( "salami mixas" )) {
                            PizzaSalami pizza = new PizzaSalami( MIX );
                            int numbers = 0;
                            System.out.println( "Iveskite kieki" );
                            numbers = input.nextInt();
                            orderItems.add( new OrderItem( pizza, numbers ) );

                        } else if (line.equalsIgnoreCase( "salami astrus" )) {
                            PizzaSalami pizza = new PizzaSalami( HOT );
                            int numbers = 0;
                            System.out.println( "Iveskite kieki" );
                            numbers = input.nextInt();
                            orderItems.add( new OrderItem( pizza, numbers ) );

                            //Funghi
                        } else if (line.equalsIgnoreCase( "funghi svelnus" )) {
                            PizzaFunghi pizza = new PizzaFunghi( MILD );
                            int numbers = 0;
                            System.out.println( "Iveskite kieki" );
                            numbers = input.nextInt();
                            orderItems.add( new OrderItem( pizza, numbers ) );

                        } else if (line.equalsIgnoreCase( "funghi mixas" )) {
                            PizzaFunghi pizza = new PizzaFunghi( MIX );
                            int numbers = 0;
                            System.out.println( "Iveskite kieki" );
                            numbers = input.nextInt();
                            orderItems.add( new OrderItem( pizza, numbers ) );

                        } else if (line.equalsIgnoreCase( "funghi astrus" )) {
                            PizzaFunghi pizza = new PizzaFunghi( HOT );
                            int numbers = 0;
                            System.out.println( "Iveskite kieki" );
                            numbers = input.nextInt();
                            orderItems.add( new OrderItem( pizza, numbers ) );
                        }
                    } while (!line.equalsIgnoreCase( "end" ));
                    break;

                case 3:
                    System.out.println("Jūsų čekis:");
                    double suma = 0;

                    for(int i = 0; i< orderItems.size(); i++){

                        //gerimai
                        if (orderItems.get( i ).getBeer() != null) {
                            System.out.println( "Alus: " + orderItems.get( i ).getBeer().getKaina() + " € , kiekis: " + orderItems.get( i ).getKiekis() + ", kaina: " + (orderItems.get( i ).getBeer().getKaina() * orderItems.get( i ).getKiekis()) + " €");
                            suma += (orderItems.get( i ).getBeer().getKaina() * orderItems.get( i ).getKiekis());

                        } else if (orderItems.get( i ).getWater() != null) {
                            System.out.println( "Vanduo: " + orderItems.get( i ).getWater().getKaina() + " € , kiekis: " + orderItems.get( i ).getKiekis() + ", kaina: " + (orderItems.get( i ).getWater().getKaina() * orderItems.get( i ).getKiekis()) + " €");
                            suma += (orderItems.get( i ).getWater().getKaina() * orderItems.get( i ).getKiekis());

                        } else if (orderItems.get( i ).getTea() != null) {
                            System.out.println( "Arbata: " + orderItems.get( i ).getTea().getKaina() + " € , kiekis: " + orderItems.get( i ).getKiekis() + ", kaina: " + (orderItems.get( i ).getTea().getKaina() * orderItems.get( i ).getKiekis()) + " €");
                            suma += (orderItems.get( i ).getTea().getKaina() * orderItems.get( i ).getKiekis());

                        } else if (orderItems.get( i ).getCoffee() != null) {
                            System.out.println( "Kava: " + orderItems.get( i ).getCoffee().getKaina() + " € , kiekis: " + orderItems.get( i ).getKiekis() + ", kaina: " + (orderItems.get( i ).getCoffee().getKaina() * orderItems.get( i ).getKiekis()) + " €");
                            suma += (orderItems.get( i ).getCoffee().getKaina() * orderItems.get( i ).getKiekis());

                        // maistas
                        } else if (orderItems.get( i ).getWrap() != null) {
                            System.out.println( "Pica wrap: " + orderItems.get( i ).getWrap().getKaina() + " € , kiekis: " + orderItems.get( i ).getKiekis() + ", kaina: " + (orderItems.get( i ).getWrap().getKaina() * orderItems.get( i ).getKiekis()) + " €");
                            suma += (orderItems.get( i ).getWrap().getKaina() * orderItems.get( i ).getKiekis());

                        } else if (orderItems.get( i ).getFunghi() != null) {
                            System.out.println( "Pica su grybais: " + orderItems.get( i ).getFunghi().getKaina() + " € , kiekis: " + orderItems.get( i ).getKiekis() + ", kaina: " + (orderItems.get( i ).getFunghi().getKaina() * orderItems.get( i ).getKiekis()) + " €");
                            suma += (orderItems.get( i ).getFunghi().getKaina() * orderItems.get( i ).getKiekis());

                        } else if (orderItems.get( i ).getSalami() != null) {
                            System.out.println( "Pica salami: " + orderItems.get( i ).getSalami().getKaina() + " € , kiekis: " + orderItems.get( i ).getKiekis() + ", kaina: " + (orderItems.get( i ).getSalami().getKaina() * orderItems.get( i ).getKiekis()) + " €");
                            suma += (orderItems.get( i ).getSalami().getKaina() * orderItems.get( i ).getKiekis());
                        }
                    }
                    System.out.println("Viso suma: " + suma + " €");

                    for (int i = 0; i < orderItems.size(); i++) {
                        orderItems.remove(i);
                    }

            }
            } while (meniuPasirinkimas != 0);
    }

}
