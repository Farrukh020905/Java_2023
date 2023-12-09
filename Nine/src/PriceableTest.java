interface Priceable {
    double getPrice();
}

class Smartphone implements Priceable {
    private String brand;
    private String model;
    private double price;

    public Smartphone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class Tablet implements Priceable {
    private String brand;
    private String model;
    private double price;

    public Tablet(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class Television implements Priceable {
    private String brand;
    private String model;
    private double price;

    public Television(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

public class PriceableTest {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Apple", "iPhone 13", 999.99);
        Tablet tablet = new Tablet("Samsung", "Galaxy Tab S7", 649.99);
        Television television = new Television("LG", "OLED65C1PUB", 1999.99);

        System.out.println("Smartphone price: $" + smartphone.getPrice());
        System.out.println("Tablet price: $" + tablet.getPrice());
        System.out.println("Television price: $" + television.getPrice());
    }
}
