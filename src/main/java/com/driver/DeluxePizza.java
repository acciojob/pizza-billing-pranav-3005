package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super();
        // your code goes here
        if(isVeg)
            price=300+150;
        else
            price=400+200;
    }
}
