package at.htl.microservices.book;

import java.time.Instant;

public class Book {
    public String isbn13;
    public String title;
    public String author;
    public String genre;
    public Instant creationTime;
    public int yearOfPublication;

    @Override
    public String toString() {
        return "Book{" +
                "isbn13='" + isbn13 + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", instant_createTime=" + instant_createTime +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }
}
