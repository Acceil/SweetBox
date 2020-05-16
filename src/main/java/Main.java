public class Main {
    public static void main(String[] args) {

        SweetBox sweetBox = new SweetBox();
        Candy candy = new Candy("Леденец", 5, 2, 1);
        Toffee toffee = new Toffee("Ириска", 5, 4, "Коричневый");

        sweetBox.addSweet(candy);
        sweetBox.addSweet(toffee);

        candy.displaySweet();
        toffee.displaySweet();


        System.out.println("\nСтоимость подарка: " + sweetBox.getPrice());
        System.out.println("Вес подарка: " + sweetBox.getWeight());


        sweetBox.getSweetInfo();
    }
}
