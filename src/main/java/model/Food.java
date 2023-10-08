package model;

import static model.constants.Discount.ZERO_DISCOUNT_PERCENT;

public abstract class Food implements Discountable {
    protected int amount;
    protected double price;
    public boolean isVegetarian;
    @Override
    public double getDiscount() {
        return ZERO_DISCOUNT_PERCENT;
    }
    public double getPrice() {
        return amount * price;
    }

}
