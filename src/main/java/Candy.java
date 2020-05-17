public class Candy extends Sweet {
    private int size;

    public Candy(String name, double weight, double price, int size) {
        super(name, weight, price);
        this.size = size;
    }


    public void displaySweet() {
        System.out.printf("Название сладости: %s \t Вес: %s \t Цена:  %s \t Размер:  %s \n",
                super.getName(), super.getWeight(), super.getPrice(), size);
    }
}
