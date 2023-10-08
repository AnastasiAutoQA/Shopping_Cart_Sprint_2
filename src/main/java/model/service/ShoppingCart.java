package model.service;

import model.Food;

public class ShoppingCart  {
    public Food[] foodItems;
    public ShoppingCart(Food[] foodItems){
        this.foodItems = foodItems;
    }

    public double getTotalPrice(){
        double totalPrice = 0;
        for(Food foodItems : foodItems) {
            totalPrice = totalPrice + foodItems.getPrice();
        }
        return totalPrice;
    }
    public double getTotalDiscountedPrice(){
        double totalDiscountedPrice = 0;
        for(Food foodItems : foodItems) {
            totalDiscountedPrice = totalDiscountedPrice + foodItems.getPrice() * (1 - foodItems.getDiscount()/100);
        }

        return totalDiscountedPrice;
    }

    public double getVegetarianPrice(){
        double totalVegetarianPrice = 0;
        for(Food foodItems : foodItems){
            if(foodItems.isVegetarian == true){
                totalVegetarianPrice = totalVegetarianPrice + foodItems.getPrice();
            }
        }
        return totalVegetarianPrice;
    }

}
