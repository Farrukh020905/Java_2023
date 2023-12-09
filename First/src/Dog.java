import java.lang.*;
public class Dog {
    private String name; //переменная name
    private int age; //переменная age
    public Dog(String n, int a){ //Первый Конструктор принимает имя(n) и возраст(a)
        name = n;
        age = a;
    }
    public Dog(String n){ //Второй конструктор  принимает только имя (n) собаки
                        // и устанавливает возраст по умолчанию равным 0.
        name = n;
        age = 0;
    }
    public Dog(){ // Третий консруктор создаёт с именем "Pup" и возрастом 0.
        name = "Pup";
        age = 0;
    }
    public void setAge(int age) {
        this.age = age; //сеттер age
    }
    public void setName(String name) {
        this.name = name; //сеттер name
    }
    public String getName(String name){

        return name; //геттер name
    }
    public int getAge() { //геттер name

        return age;
    }
    public String toString(){ // Метод toString() возращает строку, содержащую имя и возраст собаки

        return this.name+", age "+this.age;
    }
    public void intoHumanAge(){ // Метод intoHumanAge(), выводит экран возраст собаки в человеческих года.
        //Возраст умножается на 7
        System.out.println(name+"'s age in human years is"+age*7+" years");
    }
}