public class Book {

    // TODO: make fields private
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    // TODO: Implement parameterized constructor
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
    }

    // TODO: Implement copy constructor
    public Book(Book other) {
        this.title = other.getTitle();
        this.author = other.getAuthor();
        this.year = other.getYear();
        this.isAvailable = true;
    }

    // TODO: Implement getters
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    // TODO: Implement borrow logic
    public void borrowBook() {
        this.isAvailable = false;
    }

    // TODO: Implement return logic
    public void returnBook() {
        this.isAvailable = true;
    }

    // TODO: Override toString()
    @Override
    public String toString() {
        return "Title: " + this.title + ',' + "Author: " + this.author + ',' + "year: " + this.year + ','
                + "Available: " + this.isAvailable;
    }

    // TODO: Override equals()
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Book))
            return false;
        Book other = (Book) obj;
        return this.title.equals(other.title) && this.author.equals(other.author) && this.year == other.year;
    }

}
