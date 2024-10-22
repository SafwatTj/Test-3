package src;

import java.util.Arrays;

public class Book {
    private String title;
    private Author[] authors;
    private int year;

    // Конструктор
    public Book(String title, Author[] authors, int year) {
        this.title = title;
        this.authors = authors;
        this.year = year;
    }

    // Метод для получения массива авторов
    public Author[] getAuthors() {
        return authors;
    }

    // Метод toString для вывода информации о блядской книге
    @Override
    public String toString() {
        String authorsStr = (authors.length == 1) ? authors[0].toString() : Arrays.toString(authors);
        return "Title: " + title + ", Authors: " + authorsStr + ", Year: " + year;
    }
}
