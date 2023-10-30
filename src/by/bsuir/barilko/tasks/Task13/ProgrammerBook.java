package by.bsuir.barilko.tasks.Task13;

import by.bsuir.barilko.tasks.Task12.Book;

public class ProgrammerBook extends Book{
    private String language;
    private int level;

    public boolean equals(Book other)
    {
        return hashCode() == other.hashCode();
    }

    public int hashCode()
    {
        return super.hashCode() + language.hashCode() + level;
    }

    public String toString()
    {
        var bookStr = super.toString();
        return "ProgrammerBook{"
        + bookStr.substring(5, bookStr.length() - 1)
        + ", language=" + language
        + ", level=" + level
        + '}';
        
    }
}
