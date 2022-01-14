package products;

public class StackGeneric <T>{

    private Product<T>[] elements;
    private int length;

    public StackGeneric(Product<T>[] elements) {
        this.elements = elements;
        length = 0;
    }

    public void push(Product<T> p) {
        if (length < elements.length)
            elements[length++] = p;
        else
            System.out.println("Stack is full");
    }

    public Product<T> pop() {
        if (length > 0) {
            return elements[--length];
        }
        System.out.println("Stack is empty");
        return null;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    @Override
    public String toString() {
        String value = "";
        for (int i = length - 1; i >= 0; i--) {
            value += "Position: " + i + ": " + elements[i];
            value += "\n";
            value += "--------------------------------------------------------\n";
        }
        return value;
    }
}
