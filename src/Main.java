public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Management obj=new Management();

        Books book1 = new Books("2002", "RR Martin", "123", "fantasy", 3);
        Books book2 = new Books("Game Of Thrones", "George RR Martin", "456", "Fantasy", 5);
        obj.addBook(book1);
        obj.addBook(book2);

        System.out.println(book2.toString());

        obj.borrowBook("B001", "12345", "2024-11-01");

        Borrowers borrower1 = new Borrowers("Charan", "cherry@example.com", "B001");
        obj.addBorrower(borrower1);
        System.out.println(borrower1.toString());

        int availableCopies = obj.checkAvailability("456");
        System.out.println(availableCopies);

    }
}