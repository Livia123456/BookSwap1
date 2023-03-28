package controller;

import model.Book;

import java.util.ArrayList;
import java.util.Date;

public class BookHandler {

    private ArrayList<Book> books;

    private ArrayList<Book> searchBooks;

    public BookHandler(){
        books = new ArrayList<Book>();
    }

    public ArrayList<Book> searchBooks(String search) {

        for (int i = 0; i < books.size(); i++) {

            if (books.get(i).getTitle().equals(search)) {
                searchBooks.add(books.get(i));
            }
            else if (books.get(i).getReleaseDate().equals(search)) {        // "parsa"
                searchBooks.add(books.get(i));
            }
            else if (books.get(i).getISBN().equals(search)){
                searchBooks.add(books.get(i));
            }
            else if (books.get(i).getGenre().equals(search)){       // "parsa"
                searchBooks.add(books.get(i));
            }
            
        }
        return searchBooks;
    }

}
