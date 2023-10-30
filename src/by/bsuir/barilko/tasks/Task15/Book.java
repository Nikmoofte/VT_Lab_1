package by.bsuir.barilko.tasks.Task15;

public class Book implements Comparable {
    private String title;
    private String author;
    private int price;
    private int isbn;
    private static int edition;

    public Book(Book other)
    {
        title = other.title;
        author = other.title;
        price = other.price;
        isbn = other.isbn;
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

    @Override
    public int compareTo(Object o)
    {    
        return Integer.compare(isbn, ((Book)o).isbn);
    }
}
