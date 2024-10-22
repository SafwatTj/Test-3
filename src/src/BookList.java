package src;

public class BookList {
    private Book[] books;
    private int count;

    // Конструктор
    public BookList(int size) {
        books = new Book[size];
        count = 0;
    }

    // Добавление книги в массив
    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
        }
    }

    // Метод toString для вывода всех долбанных книг
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(books[i].toString()).append("\n");
        }
        return result.toString();
    }

    // Метод для получения книги по индексу
    public Book get(int index) {
        if (index >= 0 && index < count) {
            return books[index];
        }
        return null;
    }

    // Поиск книг по фамилии долбаного автора
    public String findBookByAuthorLastName(String lastName) {

            StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            
        }
        return result.toString();

        }
     }