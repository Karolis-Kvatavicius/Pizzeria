package lesson_06_29_pizzeria;

import lesson_06_29_pizzeria.drinks.Beer;
import lesson_06_29_pizzeria.drinks.Coffee;
import lesson_06_29_pizzeria.drinks.Tea;
import lesson_06_29_pizzeria.drinks.Water;
import lesson_06_29_pizzeria.food.PizzaFunghi;
import lesson_06_29_pizzeria.food.PizzaSalami;
import lesson_06_29_pizzeria.food.PizzaWrap;

public class OrderItem {

    Coffee coffee;
    Tea tea;
    Water water;
    Beer beer;
    PizzaWrap wrap;
    PizzaSalami salami;
    PizzaFunghi funghi;
    int kiekis;

    public OrderItem(Coffee coffee, int kiekis) {
        this.coffee = coffee;
        this.kiekis = kiekis;
    }

    public OrderItem(Tea tea, int kiekis) {
        this.tea = tea;
        this.kiekis = kiekis;
    }

    public OrderItem(Water water, int kiekis) {
        this.water = water;
        this.kiekis = kiekis;
    }

    public OrderItem(Beer beer, int kiekis) {
        this.beer = beer;
        this.kiekis = kiekis;
    }

    public OrderItem(PizzaWrap wrap, int kiekis) {
        this.wrap = wrap;
        this.kiekis = kiekis;
    }

    public OrderItem(PizzaSalami salami, int kiekis) {
        this.salami = salami;
        this.kiekis = kiekis;
    }

    public OrderItem(PizzaFunghi funghi, int kiekis) {
        this.funghi = funghi;
        this.kiekis = kiekis;
    }

    public int getKiekis() {
        return kiekis;
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public Tea getTea() {
        return tea;
    }

    public Water getWater() {
        return water;
    }

    public Beer getBeer() {
        return beer;
    }

    public PizzaWrap getWrap() {
        return wrap;
    }

    public PizzaSalami getSalami() {
        return salami;
    }

    public PizzaFunghi getFunghi() {
        return funghi;
    }
}
