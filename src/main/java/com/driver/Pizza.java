package com.driver;

public class Pizza {

    protected int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg)
        {
            price+=300;
            bill="Base Price Of The Pizza: "+price+"\n";

        }
        else
        {
            price+=400;
            bill="Base Price Of The Pizza: "+price+"\n";
        }
        // your code goes here
    }

    public Pizza() {

    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        if(bill==null)
        {
            bill="Base Price Of The Pizza: "+price+"\n";
        }
        // your code goes here
        bill+="Extra Cheese Added: 80\n";
        price+=80;

    }

    public void addExtraToppings(){
        if(isVeg)
        {
            bill+="Extra Toppings Added: 70\n";
            price+=70;
        }
        else
        // your code goes here
        {
            bill+="Extra Toppings Added: 120\n";
            price+=120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        bill+="Paperbag Added: 20\n";
        price+=20;
    }

    public String getBill(){
        // your code goes here
        bill+="Total Price: "+price;
        return this.bill;
    }
}
