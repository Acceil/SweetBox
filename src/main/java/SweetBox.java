import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SweetBox implements BoxMethods {
    private final List<Sweet> sweets = new ArrayList<>();

    @Override
    public void addSweet(Sweet sweet) {
        sweets.add(sweet);
    }

    @Override
    public void removeSweet(Sweet sweet) {
        sweets.remove(sweet);
    }

    @Override
    public int getWeight() {
        return sweets.stream().mapToInt(Sweet::getWeight).sum();
    }

    @Override
    public int getPrice() {
        return sweets.stream().mapToInt(Sweet::getPrice).sum();
    }

    @Override
    public void getSweetInfo() {
        List<Sweet> sweetsSorted = sweets.stream()
                .sorted(Comparator.comparing(Sweet::getName))
                .collect(Collectors.toList());

        System.out.println("\nЭто коробка содержит:");
        sweetsSorted.forEach(System.out::println);
    }

}
