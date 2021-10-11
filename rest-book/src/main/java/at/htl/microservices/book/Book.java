package at.htl.microservices.book;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.json.bind.annotation.JsonbProperty;
import java.time.Instant;

public class Book {

    @JsonbProperty("isbn_13")
    public String isbn13;
    public String title;
    public String author;
    public String genre;
    @JsonbProperty("creation_time")
    @JsonbDateFormat("yyyy-MM-dd")
    public Instant creationTime;
    @JsonbProperty("year_of_publication")
    public int yearOfPublication;

    @Override
    public String toString() {
        return "Book{" +
                "isbn13='" + isbn13 + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", creationTime=" + creationTime +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }
}
