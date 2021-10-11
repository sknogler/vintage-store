package at.htl.microservices.number;

import javax.json.bind.annotation.JsonbProperty;
import java.time.Instant;

public class IsbnNumbers {

    @JsonbProperty
    public String isbn10;
    @JsonbProperty
    public String isbn13;
    @JsonbProperty
    public Instant generationDate;

    @Override
    public String toString() {
        return "IsbnNumbers{" +
                "isbn10='" + isbn10 + '\'' +
                ", isbn13='" + isbn13 + '\'' +
                ", generationDate=" + generationDate +
                '}';
    }
}
