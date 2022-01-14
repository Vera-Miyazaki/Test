package products;

import java.util.HashMap;

public class Product<T> {

    private String name;
    private double price;
    private int categoryID;
    private String colour;

    public Product(String name, double price, int categoryID, String colour) {
        this.name = name;
        this.price = price;
        this.categoryID = categoryID;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", categoryID=" + categoryID +
                ", colour='" + colour + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public static String getCategoryName(int categoryID){
    switch(categoryID) {
        case 1:
            return "Möbel";

        case 2:
            return
                    "Kleidung";

        case 3:
            return
                    "Sportartikel";

        case 4:
            return "Nahrungsmittel";
    }

           return "Diverses";}

    public static HashMap<String, Integer> countItemsByCategoryName(Stack products) {
        int counter = 1;

        for (int i = 1; i <= 5; i++) {
            if (products.equals(getCategoryName(i))) {
                System.out.println("getCategoryName(1)+ \" \" +counter = " + getCategoryName(1) + " " + "Anzahl: " + i);
                return countItemsByCategoryName(products);
            }}

            return countItemsByCategoryName(products);
        }


    }