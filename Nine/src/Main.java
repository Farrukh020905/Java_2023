
interface Nameable {
    String getName();
}

class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Car implements Nameable {
    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getName() {
        return brand + " " + model;
    }
}

class Animal implements Nameable {
    private String species;
    private String name;

    public Animal(String species, String name) {
        this.species = species;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Nameable planet = new Planet("Earth");
        System.out.println("Planet name: " + planet.getName());

        Nameable car = new Car("Tesla", "Model S");
        System.out.println("Car name: " + car.getName());

        Nameable animal = new Animal("Dog", "Buddy");
        System.out.println("Animal name: " + animal.getName());
    }
}
