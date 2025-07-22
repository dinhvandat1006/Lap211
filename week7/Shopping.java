package week7;

import java.util.ArrayList;
import java.util.List;

public class Shopping {
    private List<Fruits> fruits;
    private List<Order> orders;

    public Shopping() {
        fruits = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public void createFruit(int fruitId, String fruitName, double price, int quantity, String origin) {
        fruits.add(new Fruits(fruitId, fruitName, price, quantity, origin));
    }

    public void showFruit() {
        System.out.println("List of Fruits : ");
        for (Fruits fr : fruits) {
            System.out.println(fr.toString());
        }
    }

    public void createOrder(String customerName, ArrayList<OrderItem> item) {
        Order order = new Order(customerName);
        for (OrderItem it : item)
            order.addItem(it);
        orders.add(order);
    }

    public void viewOrders() {
        for (Order order : orders) {
            order.viewOrder();
            System.out.println("-----------------------------");
        }
    }

    public Fruits getFruitByName(String fruitName) {
        for (Fruits fruit : fruits) {
            if (fruit.getFruitName().equalsIgnoreCase(fruitName)) {
                return fruit;
            }
        }
        return null;
    }
}

