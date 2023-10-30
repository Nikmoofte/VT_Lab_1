package by.bsuir.barilko.tasks.Task14;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book(Book other)
    {
        title = other.title;
        author = other.title;
        price = other.price;
    }

    public boolean equals(Book other)
    {
        return hashCode() == other.hashCode();
    }

    public int hashCode()
    {
        return title.hashCode() + author.hashCode();
    }

    public String toString()
    {
        return "Book{"
        + "title='" + title
        + ", Author=" + author
        + ", price=" + price
        + ", edition=" + edition
        + '}';
    }

    public Book clone()
    {
        return new Book(this);
    }
}
