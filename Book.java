class Book {
    // Property for  title
    String title;

    // Constructor to initialize the book title
    public Book(String title) {
        this.title = title; 
    }
    public void changeTitle(String newTitle) {
        title = newTitle; 
    }

    // Method to print the book's title
    public void printTitle() {
        System.out.println("Book Title: " + title);
    }

    public static void main(String[] args) {
        Book myBook = new Book("Old Title");

        // Print the original title
        myBook.printTitle(); 

        myBook.changeTitle("New Title"); // Change to New Title

        // Print the updated title
        myBook.printTitle(); 
    }
}
