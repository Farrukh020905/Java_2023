import java.lang.*;
public class Book {
    private String name; // переменная name
    private int page; // переменная page
    public Book(String n, int a){ //Первый Конструктор принимает название(n) и кол-во страниц(a).
        name = n;
        page = a;
    }
    public Book(String n){ //Второй конструктор  принимает только название(n)
        // и устанавливает кол-во страниц(a) по умолчанию равным 0.
        name = n;
        page = 0;
    }
    public Book(){ // Третий консруктор создаёт с именем "Lorem" и кол-вом страниц 0.
        name = "Lorem";
        page = 0;
    }
    public void setPage(int page) {
        this.page = page; //сеттер page
    }
    public void setName(String name) {
        this.name = name; //сеттер name
    }
    public String getName(String name){

        return name; //геттер name
    }
    public int getPage() {

        return page; //геттер name
    }
    public String toString(){ // Метод toString() возращает строку, содержащую название и кол-во страниц книги

        return this.name+", кол-во страниц "+this.page+"\n";
    }
}
