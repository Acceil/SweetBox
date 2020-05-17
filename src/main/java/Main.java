public class Main {
    public static void main(String[] args) {

        SweetBox sweetBox = new SweetBox();
        Candy candy = new Candy("Леденец", 8.2, 2, 1);
        Toffee toffee = new Toffee("Ириска", 5, 4, "Коричневый");
        Toffee toffee2 = new Toffee("Ириска", 6.1, 4, "Коричневый");

        sweetBox.addSweet(candy);
        sweetBox.addSweet(toffee);
        sweetBox.addSweet(toffee2);
        sweetBox.reduceWeight(17);
        sweetBox.reducePrice(5);

        candy.displaySweet();
        toffee.displaySweet();
        toffee2.displaySweet();

        System.out.println("\nСтоимость подарка: " + sweetBox.getPrice());
        System.out.println("Вес подарка: " + sweetBox.getWeight());

        sweetBox.getSweetInfo();
    }
}
