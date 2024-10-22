package src;

public class Author {
    private String fName;
    private String lName;
    private int year;

    // Конструктор
    public Author(String fName, String lName, int year) {
        this.fName = fName;
        this.lName = lName;
        this.year = year;
    }

    // Метод для получения фамилии автора
    public String getLName() {
        return lName;
    }

    // Метод toString для вывода информации об авторе
    @Override
    public String toString() {
        return fName + " " + lName + " (" + year + ")";
    }
}
