package at.htl.microservices.book;

import java.time.Instant;

public class Book {
    private String isbn13;
    private String title;
    private String author;
    private String genre;
    private Instant instant_createTime;
    private int yearOfPublication;

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
