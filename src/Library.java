public class Library {

    private Book[] books;
    private int count;

    public Library(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    // TODO: Add book to array
    public void addBook(Book book) {
        if (count >= books.length) {
            System.out.println("Library is full. Cannot add more books.");
            return;
        }
        books[count++] = book;
    }

    // TODO: Display all books
    public void displayBooks() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }

    // TODO: Search book by title
    public Book searchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title))
                return book;
        }
        return null;
    }

    // TODO: Borrow book by title
    public void borrowBook(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i] != null && books[i].getTitle().equals(title)) {
                if (books[i].isAvailable()) {
                    books[i].borrowBook();
                    System.out.println("Book borrowed successfully: " + title);
                    return;
                } else {
                    System.out.println("Book is already borrowed: " + title);
                    return;
                }
            }
        }
        System.out.println("Book not found");
    }

    // TODO: Return book by title
    public void returnBook(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i] != null && books[i].getTitle().equals(title)) {
                if (!books[i].isAvailable()) {
                    books[i].returnBook();
                    System.out.println("Book returned successfully: " + title);
                    return;
                } else {
                    System.out.println("Book is already available: " + title);
                    return;
                }
            }
        }
        System.out.println("Book not found");
    }
}
