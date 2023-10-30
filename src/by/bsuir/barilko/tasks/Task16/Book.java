package by.bsuir.barilko.tasks.Task16;

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

    public int compareByTitle(Object o)
    {    
        return title.compareTo(((Book)o).title);
    }
    public int compareByAuthor(Object o)
    {    
        return author.compareTo(((Book)o).author);
    }
    public int compareByPrice(Object o)
    {    
        return Integer.compare(price, ((Book)o).price);
    }
    public int compareByTitleAuthor(Object o)
    {    
        var compareRes = compareByTitle(o);
        if(compareRes == 0)
            return compareByAuthor(o);
        else 
            return compareRes;
    }
    public int compareByAuthorTitle(Object o)
    {    
        var compareRes = compareByAuthor(o);
        if(compareRes == 0)
            return compareByTitle(o);
        else 
            return compareRes;

    }
    public int compareByAuthorTitleName(Object o)
    {    
        var compareRes = compareByAuthorTitle(o);
        if(compareRes == 0)
            return compareByPrice(o);
        else 
            return compareRes;

    }
    
}
