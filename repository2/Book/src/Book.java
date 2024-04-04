public class Book {
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static Book createBook(String title, double price) {
        return new Book(title, price);
    }

    public void showBook() {
        System.out.println("Book Title: " + title + " and Price: " + price);
    }

    public static void main(String[] args) {
        Book myBook = Book.createBook("Java Programming", 350.00);
        myBook.showBook();
    }
}
