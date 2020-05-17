public class Toffee extends Sweet {
    private final String color;

    public Toffee(String name, double weight, double price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    public void displaySweet() {
        System.out.printf("Название сладости: %s \t Вес: %s \t Цена:  %s \t Цвет:  %s \n",
                super.getName(), super.getWeight(), super.getPrice(), color);
    }
}
