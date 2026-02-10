import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library(10);

        int choice;

        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add book");
            System.out.println("2. Add e-book");
            System.out.println("3. Display all books");
            System.out.println("4. Search book by title");
            System.out.println("5. Borrow book");
            System.out.println("6. Return book");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.println("title: ");
                    String title = scanner.nextLine();
                    System.out.println("author: ");
                    String author = scanner.nextLine();
                    System.out.println("year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    Book newBook = new Book(title, author, year);
                    library.addBook(newBook);
                    break;

                case 2:
                    System.out.println("title: ");
                    String title2 = scanner.nextLine();
                    System.out.println("author: ");
                    String author2 = scanner.nextLine();
                    System.out.println("year: ");
                    int year2 = scanner.nextInt();
                    System.out.println("file size:");
                    double fileSize = scanner.nextDouble();
                    scanner.nextLine();
                    EBook book = new EBook(title2, author2, year2, fileSize);
                    library.addBook(book);
                    break;

                case 3:
                    library.displayBooks();
                    break;

                case 4:
                    System.out.println("book title: ");
                    String book3 = scanner.nextLine();
                    Book result = library.searchByTitle(book3);
                    if (result != null) {
                        System.out.println(result);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 5:
                    System.out.println("title: ");
                    String book4 = scanner.nextLine();
                    library.borrowBook(book4);
                    break;

                case 6:
                    System.out.println("title: ");
                    String book5 = scanner.nextLine();
                    library.returnBook(book5);
                    break;

                case 7:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option!");
            }

        } while (choice != 7);

        scanner.close();
    }
}
