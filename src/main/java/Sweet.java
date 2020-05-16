public abstract class Sweet {
    private String name;
    private int weight;
    private int price;

    public Sweet(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return getName();
    }

    public abstract void displaySweet();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
