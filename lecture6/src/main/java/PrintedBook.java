import javax.persistence.Entity;

@Entity
public class PrintedBook extends Book {
    private String isbn;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}