import model.Apple;
import model.Food;
import model.Meat;
import model.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100);

        Food apple_red = new Apple (10, 50, "red");

        Food apple_green = new Apple(8, 60, "green");

        Food[] foodItems = {meat, apple_red, apple_green};

        ShoppingCart cart = new ShoppingCart(foodItems);

        System.out.println("Общая сумма товаров без скидки: " + cart.getTotalPrice());

        System.out.println("Общая сумма товаров со скидкой: " + cart.getTotalDiscountedPrice());

        System.out.println("Общая сумма вегетарианских товаров без скидки: " + cart.getVegetarianPrice());

    }
}
