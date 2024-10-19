import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Management {
    private Map<String, Books> booksMap; // ISBN -> Book
    private Map<String, Borrowers> borrowersMap; // MembershipID -> Borrower
    public Management() {
        booksMap = new HashMap<>();
        borrowersMap = new HashMap<>();
    }

    // Book Management
    public void addBook(Books book) {
        booksMap.put(book.getIsbn(), book);
    }

    public void updateBook(String isbn, String title, String author, Integer quantity) {
        Books book = booksMap.get(isbn);
        if (book != null) {
            if (title != null) book.setTitle(title);
            if (author != null) book.setAuthor(author);
            if (quantity != null) book.setQuantity(quantity);
        }
    }

    public void removeBook(String isbn) {
        booksMap.remove(isbn);
    }


    // Borrower Management
    public void addBorrower(Borrowers borrower) {
        borrowersMap.put(borrower.getMembership_ID(), borrower);
    }

    public void updateBorrower(String membershipId, String name, String contact) {
        Borrowers borrower = borrowersMap.get(membershipId);
        if (borrower != null) {
            if (name != null) borrower.setName(name);
            if (contact != null) borrower.setContact_details((contact));
        }
    }

    public void removeBorrower(String membershipId) {
        borrowersMap.remove(membershipId);
    }

    // Book Borrowing
    public void borrowBook(String membershipId, String isbn, String dueDate) {
        Borrowers borrowers = borrowersMap.get(membershipId);
        Books book = booksMap.get(isbn);
        if (borrowers != null && book != null && book.getQuantity() > 0) {
            borrowers.getBorrowedBooks().put(isbn, dueDate);
            book.setQuantity(book.getQuantity() - 1);
        } else {
            System.out.println(" Book not available || invalid borrower.");
        }
    }

    public void returnBook(String membershipId, String isbn){
        Borrowers borrowers = borrowersMap.get(membershipId);
        if(borrowers!=null && borrowers.getBorrowedBooks().containsKey(isbn)){
            borrowers.getBorrowedBooks().remove(isbn);
            Books books=booksMap.get(isbn);
            if(books!=null){
                books.setQuantity(books.getQuantity()+1);
            }
            System.out.println("Book returned successfully");
        }
    }

    public List<Books> searchBooks(String title, String isbn){
        List<Books> result=new ArrayList<>();
        Books books=booksMap.get(isbn);
        if(books!=null){
            books.getTitle().contains(title);
            result.add(books);
        }else{
            System.out.println("No book found with given title and isbn code");
        }
        return result;
    }

    public int checkAvailability(String isbn){
        Books books=booksMap.get(isbn);
        return (books!=null)? books.getQuantity():0;
    }
}