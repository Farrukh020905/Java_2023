import java.lang.*;

public class Ball {
    private String color;  //переменная color
    private double radius; //переменная radius
    public  Ball(String n, double a){ //Первый Конструктор принимает цвет(n) и радиус(a)
        color = n;
        radius = a;
    }
    public Ball(String n){  //Второй конструктор  принимает только  цвет(n) мяча
        // и устанавливает радиус по умолчанию равным 0.
        color = n;
        radius = 0;
    }
    public Ball(){ //Третий консруктор создаёт с цветом "Red" и Радиусом 0.
        color = "red";
        radius = 0;
    }
    public void setColor(String color){ //сеттер color
        this.color = color;
    }
    public void setRadius(double radius){ //сеттер radius
        this.radius = radius;
    }
    public String getColor(String color){ //геттер color
        return  color;
    }
    public  double getRadius(){ //геттер radius
        return radius;
    }
    public  String toString(){ // Метод toString() возращает строку, содержащую цвет и раиус собаки
        return "Color is" + this.color+", radius " + this.radius +"\n";
    }


}
