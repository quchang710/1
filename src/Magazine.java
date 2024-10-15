class Magazine extends LibraryItem {
    private int issueNumber;
    private String publisher;

    public Magazine(String title, int yearPublished, int issueNumber, String publisher) {
        super(title, yearPublished);
        this.issueNumber = issueNumber;
        this.publisher = publisher;
    }
    public void getDetails() {
        System.out.println("Magazine Title: " + title);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Issue Number: " + issueNumber);
        System.out.println("Publisher: " + publisher);
    }
}