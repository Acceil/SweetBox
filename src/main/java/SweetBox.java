import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SweetBox implements BoxMethods {
    private List<Sweet> sweets = new ArrayList<>();

    @Override
    public void addSweet(Sweet sweet) {
        sweets.add(sweet);
    }

    @Override
    public void removeSweet(Sweet sweet) {
        sweets.remove(sweet);
    }

    @Override
    public double getWeight() {
        return sweets.stream().mapToDouble(Sweet::getWeight).sum();
    }

    @Override
    public double getPrice() {
        return sweets.stream().mapToDouble(Sweet::getPrice).sum();
    }

    @Override
    public void getSweetInfo() {
        List<Sweet> sweetsSorted = sweets.stream()
                .sorted(Comparator.comparing(Sweet::getName))
                .collect(Collectors.toList());

        System.out.println("\nЭто коробка содержит:");
        sweetsSorted.forEach(System.out::println);
    }

    @Override
    public void reduceWeight(double weight) {
        sweets = sweets.stream()
                .sorted(Comparator.comparing(Sweet::getWeight))
                .collect(Collectors.toList());

        while (weight < getWeight()) {
            sweets.remove(0);
        }
    }

    @Override
    public void reducePrice(double price) {
        sweets = sweets.stream()
                .sorted(Comparator.comparing(Sweet::getPrice))
                .collect(Collectors.toList());

        while (price < getPrice()) {
            sweets.remove(0);
        }
    }
}
