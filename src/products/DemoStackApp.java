package products;

import java.util.HashMap;

public class DemoStackApp <T> {
    public void main(String[] args) {

        Product<T> p1 = new Product<>("Chair", 199.0, 1, "black");
        Product<T> p2 = new Product<>("Table", 379.9, 1, "brown");
        Product<T> p3 = new Product<T>("T-Shirt", 19.9, 2, "yellow");
        Product<T> p4 = new Product<T>("Jeans", 99.9, 2, "blue");
        Product<T> p5 = new Product<T>("Tennisball", 9.9, 3, "yellow");
        Product<T> p6 = new Product<T>("Skier", 689.9, 3, "white");
        Product<T> p7 = new Product<T>("Apples", 2.99, 4, "red");
        Product<T> p8 = new Product<T>("Orange", 3.49, 4, "orange");
        Product<T> p9 = new Product<T>("Game", 12.99, 5, "white");

        Stack productsStack = new Stack(new Product<T>[10]);
        productsStack.push(p1);
        productsStack.push(p2);
        productsStack.push(p3);
        productsStack.push(p4);
        productsStack.push(p5);
        productsStack.push(p6);
        productsStack.push(p7);
        productsStack.push(p8);
        productsStack.push(p9);

        System.out.println(productsStack);

        System.out.println("countItemsByCategoryName(productsStack) = " + countItemsByCategoryName(productsStack));

    }

    public static String getCategoryName(int categoryID) {
        // TODO: Your implementation
        return "";
    }

    public static HashMap<String, Integer> countItemsByCategoryName(Stack products){
        // TODO: Your implementation
        return null;
    }
}
