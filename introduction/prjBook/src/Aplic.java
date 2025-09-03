import java.util.Scanner;

/**
 *
 * @author h-and-rod
 */
public class Aplic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the book title: ");
        String bookTitle = input.next();

        System.out.print("Enter the book identifier: ");
        int id = input.nextInt();

        System.out.print("Daily late fee for returning the book: ");
        double fee = input.nextDouble();

        Book book = new Book(id, bookTitle);
        book.setDailyFineValue(fee);
        int option;
        do {
            System.out.println("\n\n--- Menu ---");
            System.out.println("1 - Consult book");
            System.out.println("2 - Borrow book");
            System.out.println("3 - Return book");
            System.out.println("4 - Exit");
            System.out.print("\nEnter your option: ");
            option = input.nextInt();

            if (option == 1) {
                System.out.println("Book title: " + book.getTitle());
                System.out.println("Book identifier: " + book.getId());

                String status = "Available";
                if (book.getStatus()) {
                    status = "Borrowed";
                } else {
                    status = "Available";
                }

                System.out.println("Book status: " + status);

            } else if (option == 2) {
                if (book.getStatus()) {
                    System.out.println("The book is already borrowed!");
                } else {
                    book.borrow();
                    System.out.println("The book status has been updated!");
                }

            } else if (option == 3) {
                if (book.getStatus()) {
                    System.out.print("Enter the number of late days: ");
                    int lateDays = input.nextInt();
                    double fine = book.returnBook(lateDays);
                    if (fine > 0) {
                        System.out.println("The amount due for late return is: $" + fine);
                    }
                    System.out.println("The book has been returned!");
                } else {
                    System.out.println("The book is already available!");
                }

            } else if (option == 4) {
                System.out.println("Exiting the program...");

            } else {
                System.out.println("Invalid option! Please try again.");
            }

        } while (option != 4);
    }
}
