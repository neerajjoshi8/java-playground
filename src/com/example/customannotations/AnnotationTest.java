package com.example.customannotations;

@BooksAnnotation(name = "textbook")
class TextBook {
}

@BooksAnnotation(name = "programming-books", year = "2009")
class ProgrammingBook {
}

public class AnnotationTest {

    public static void main(String[] args) {
        try {
            Class c1 = Class.forName("com.example.customannotations.TextBook");
            BooksAnnotation booksAnnotation1 = (BooksAnnotation) c1.getAnnotation(BooksAnnotation.class);
            System.out.println(booksAnnotation1.name());
            System.out.println(booksAnnotation1.year());

            Class c2 = Class.forName("com.example.customannotations.ProgrammingBook");
            BooksAnnotation booksAnnotation2 = (BooksAnnotation) c2.getAnnotation(BooksAnnotation.class);
            System.out.println(booksAnnotation2.name());
            System.out.println(booksAnnotation2.year());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
