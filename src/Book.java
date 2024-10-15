class Book extends LibraryItem {
    private String author;
    private String isbn;

    public Book(String title, int yearPublished, String author, String isbn) {
        super(title, yearPublished);
        this.author = author;
        this.isbn = isbn;
    }
    public void getDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}
