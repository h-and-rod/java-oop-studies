/**
 *
 * @author h-and-rod
 */
public class Book {

    private int id;
    private String title;
    private boolean status;
    private double dailyFineValue;

    public Book(int id, String bookTitle) {
        title = bookTitle;
        this.id = id;
    }

    public void setDailyFineValue(double value) {
        dailyFineValue = value;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean getStatus() {
        return status;
    }

    public void borrow() {
        status = true;
    }

    public double returnBook(int lateDays) {
        status = false;

        double amountDue;
        amountDue = dailyFineValue * lateDays;

        return amountDue;
    }
}
