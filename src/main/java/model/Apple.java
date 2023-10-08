package model;


import static model.constants.Colour.RED_APPLE;
import static model.constants.Discount.RED_DISCOUNT_PERCENT;
import static model.constants.Discount.ZERO_DISCOUNT_PERCENT;

public class Apple extends Food {
    protected String colour;

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;
    }
    @Override
    public double getDiscount(){
        if(this.colour.equals(RED_APPLE)){
            return RED_DISCOUNT_PERCENT;
        } else {
            return ZERO_DISCOUNT_PERCENT;
        }
    }

}