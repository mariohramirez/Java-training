package com.training;

public class Pizza {

    String bread;
    String cheese;
    String sauce;
    String topping;

    Pizza() {

    }

    Pizza(String bread, String sauce, String cheese, String topping) {
        this.bread = bread;
        this.cheese = cheese;
        this.sauce = sauce;
        this.topping = topping;
    }

    Pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.cheese = cheese;
        this.sauce = sauce;
    }

}
