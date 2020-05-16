public class Toffee extends Sweet {
    private String color;

    public Toffee(String name, int weight, int price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    public void displaySweet() {
        System.out.printf("Название сладости: %s \t Вес: %s \t Цена:  %s \t Размер:  %s \n",
                super.getName(), super.getPrice(), super.getWeight(), color);
    }
}
