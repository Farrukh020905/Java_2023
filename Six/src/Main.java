/*
// Абстрактный класс, описывающий посуду
abstract class Dish {
    protected String material; // материал, из которого сделана посуда
    protected int capacity; // вместимость посуды

    // Конструктор класса
    public Dish(String material, int capacity) {
        this.material = material;
        this.capacity = capacity;
    }

    // Геттеры для получения свойств посуды
    public String getMaterial() {
        return material;
    }

    public int getCapacity() {
        return capacity;
    }

    // Абстрактные методы для наполнения и мытья посуды
    public abstract void fill();
    public abstract void wash();
}

// Класс, описывающий чашку
class Cup extends Dish {
    private boolean handle; // наличие ручки у чашки

    // Конструктор класса
    public Cup(String material, int capacity, boolean handle) {
        super(material, capacity);
        this.handle = handle;
    }

    // Геттер для получения наличия ручки у чашки
    public boolean hasHandle() {
        return handle;
    }

    // Реализация методов для наполнения и мытья чашки
    @Override
    public void fill() {
        System.out.println("Cup is filled with liquid.");
    }

    @Override
    public void wash() {
        System.out.println("Cup is washed.");
    }
}

// Класс, описывающий тарелку
class Plate extends Dish {
    private boolean flat; // плоская ли тарелка

    // Конструктор класса
    public Plate(String material, int capacity, boolean flat) {
        super(material, capacity);
        this.flat = flat;
    }

    // Геттер для получения типа тарелки
    public boolean isFlat() {
        return flat;
    }

    // Реализация методов для наполнения и мытья тарелки
    @Override
    public void fill() {
        System.out.println("Plate is filled with food.");
    }

    @Override
    public void wash() {
        System.out.println("Plate is washed.");
    }
}

// Тестирование классов
public class Main {
    public static void main(String[] args) {
        // Создание объектов чашки и тарелки
        Cup cup = new Cup("ceramic", 250, true);
        Plate plate = new Plate("glass", 500, false);

        // Вывод свойств созданных объектов
        System.out.println("Cup material: " + cup.getMaterial());
        System.out.println("Cup capacity: " + cup.getCapacity());
        System.out.println("Cup has handle: " + cup.hasHandle());

        System.out.println("Plate material: " + plate.getMaterial());
        System.out.println("Plate capacity: " + plate.getCapacity());
        System.out.println("Plate is flat: " + plate.isFlat());

        // Вызов методов для наполнения и мытья посуды
        cup.fill();
        cup.wash();

        plate.fill();
        plate.wash();
    }
}
*/
/*
//Второе задание
abstract class Dog {
    protected String name;
    protected int age;
    private String breed;

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public abstract void bark();

    public void run() {
        System.out.println(name + " бежит!");
    }

    public void sleep() {
        System.out.println(name + " спит.");
    }

    public String getBreed() {
        return breed;
    }
}

class Bulldog extends Dog {
    public Bulldog(String name, int age) {
        super(name, age, "Бульдог");
    }

    @Override
    public void bark() {
        System.out.println(name + " лает: Гав-гав!");
    }
}

public class Main {
    public static void main(String[] args) {
        Bulldog bulldog = new Bulldog("Буся", 3);
        bulldog.bark(); // Буся лает: Гав-гав!
        bulldog.run(); // Буся бежит!
        bulldog.sleep(); // Буся спит.
        System.out.println(bulldog.getBreed()); // Бульдог
    }
}
*/
// Абстрактный класс, описывающий мебель
import java.util.ArrayList;
abstract class Furniture {
    protected String name;
    protected String material;
    protected int price;

    public Furniture(String name, String material, int price) {
        this.name = name;
        this.material = material;
        this.price = price;
    }

    public abstract void getInfo();
}

// Класс, описывающий стул
class Chair extends Furniture {
    protected int legs;

    public Chair(String name, String material, int price, int legs) {
        super(name, material, price);
        this.legs = legs;
    }

    public void getInfo() {
        System.out.println( name + ", материал: " + material + ", количество ножек: " + legs + ", цена: " + price + " рублей.");
    }
}

// Класс, описывающий стол
class Table extends Furniture {
    protected int length;
    protected int width;

    public Table(String name, String material, int price, int length, int width) {
        super(name, material, price);
        this.length = length;
        this.width = width;
    }

    public void getInfo() {
        System.out.println( name + ", материал: " + material + ", размеры: " + length + "x" + width + ", цена: " + price + " рублей.");
    }
}

// Класс, описывающий магазин мебели
class FurnitureShop {
    private ArrayList<Furniture> furnitureList;

    public FurnitureShop() {
        furnitureList = new ArrayList<Furniture>();
    }

    public void addFurniture(Furniture furniture) {
        furnitureList.add(furniture);
    }

    public void showFurniture() {
        for (Furniture furniture : furnitureList) {
            furniture.getInfo();
        }
    }
}

// Тестирование работы классов
public class Main {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();

        Chair chair = new Chair("Стул", "Дерево", 1000, 4);
        Table table = new Table("Стол", "Стекло", 5000, 120, 80);

        shop.addFurniture(chair);
        shop.addFurniture(table);

        shop.showFurniture();
    }
}