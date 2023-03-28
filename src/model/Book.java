package model;

import javax.swing.*;
import java.util.Date;

public class Book {

    private String title;
    private Date releaseDate;
    private String ISBN;
    private Genres genre;
    private ImageIcon image;


    public Book(ImageIcon img, String title, Date date, String ISBN, Genres genre){

        this.title = title;
        this.releaseDate = date;
        this.ISBN = ISBN;
        this.genre = genre;
        this.image = img;

    }

    public String getTitle() {
        return title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public String getISBN() {
        return ISBN;
    }

    public Genres getGenre() {
        return genre;
    }

    public ImageIcon getImage() {
        return image;
    }
}
