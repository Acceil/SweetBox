public class Candy extends Sweet {
    private int size;

    public Candy(String name, int weight, int price, int size) {
        super(name, weight, price);
        this.size = size;
    }


    public void displaySweet() {
        System.out.printf("Название сладости: %s \t Вес: %s \t Цена:  %s \t Размер:  %s \n",
                super.getName(), super.getPrice(), super.getWeight(), size);
    }
}
