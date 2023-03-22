import javax.swing.*;
import java.util.Date;

public class Book {

    private Date releaseDate;
    private String title;
    private ImageIcon img;


    public Book(ImageIcon img, String title, Date date){
        this.img = img;
        this.title = title;
        this.releaseDate = date;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public ImageIcon getImg() {
        return img;
    }
}
