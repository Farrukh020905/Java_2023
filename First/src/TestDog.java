import java.lang.*;
public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Mike", 2);  //Объект с им "Mike" и возрастом 2
        Dog d2 = new Dog("Helen", 7); //Объект с им "Helen" и возрастом 7
        Dog d3 = new Dog("Bob"); d3.setAge(1); //Объект с им "Bob" и  метод setAge(1) для установки возраста в 1 год.
        System.out.println(d1);
        d1.intoHumanAge(); //выводится объект d1
        d2.intoHumanAge(); //выводится объект d1
        d3.intoHumanAge(); //выводится объект d1
    }
}