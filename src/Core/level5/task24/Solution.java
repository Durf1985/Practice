package Core.level5.task24;

import java.util.LinkedList;
import java.util.List;

/*
ООП - книги
*/

public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books); // вызывается метод toString() переопреденный в асбтрактном методе.
    }

    abstract static class Book {
        private String author;// поле класса

        public Book(String author) {
            this.author = author;
        } // конструктор

        public abstract Book getBook(); // абстрактные методы

        public abstract String getTitle();

        private String getOutputByBookType() {
            // формируется 2 строки одна из которых будет возвращена, в зависимости от полученного объекта

            String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " was written by " + author;
            // в абстрактном классе вызывается реализация метода в классе наследнике.  getBook()
            String output = "output";
            if (getBook() instanceof MarkTwainBook) {
                output = markTwainOutput;
            }
            if (getBook() instanceof AgathaChristieBook) {
                output = agathaChristieOutput;
            }
            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }

    public static class MarkTwainBook extends Book {
        private String title;

        public MarkTwainBook(String title) {
            super("Mark Twain");// инициализируется поле родителя
            this.title = title;// инициализация поля наследника.
        }

        @Override
        public MarkTwainBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }

    public static class AgathaChristieBook extends Book {
        private String title;

        public AgathaChristieBook(String title) {
            super("Agatha Christie");
            this.title = title;
        }

        @Override
        public AgathaChristieBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }
}
