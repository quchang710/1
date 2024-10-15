public class Main {
    public static void main(String[] args) {
        Book book = new Book("Effective Java", 2008, "Joshua Bloch", "978-0134685991");
        book.getDetails();

        System.out.println();
        Magazine magazine = new Magazine("National Geographic", 2023, 156, "National Geographic Society");
        magazine.getDetails();
    }
}