package com.aberneko.learning.Object;

import java.util.Objects;

public class Method {
    static void main() {
      Book book = new Book("", "", 0);
      Book book1 = new Book("qwe", "ewf", 1);

      book.equals(book1);
    }

}

class Book {
    public String title;
    public String author;
    public int pagesNumber;

    public Book(String title, String author, int pagesNumber) {
        this.title = title;
        this.author = author;

        this.pagesNumber = pagesNumber;
    }

    @Override  // аннотация сигнализует о том, что мы переопределяем метод
    public boolean equals(Object obj) {
        if (this == obj) return true; // проверяем адреса объектов
        if (obj == null) return false; // проверяем ссылку на null
        if (this.getClass() != obj.getClass()) return false; // сравниваем классы объектов
        /*if (obj == null || this.getClass() != obj.getClass()) return false;*/
        Book otherBook = (Book) obj; // привели второй объект к классу Book
        return Objects.equals(title, otherBook.title) && // Утилитарный класс Objects
                Objects.equals(author, otherBook.author) && // Этот метод сначала проверяет, не равны ли переданные аргументы пустым ссылкам, и если нет — сравнивает их.
                (pagesNumber == otherBook.pagesNumber); // Поля примитивных типов сравниваем через оператор ==
    }
}
