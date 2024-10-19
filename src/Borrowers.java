import java.util.HashMap;
import java.util.Map;

public class Borrowers {
    //Add new borrowers to the library system, including information like name,  contact details, and membership ID.
    private String name;
    private String contact_details;
    private String membership_ID;

    @Override
    public String toString() {
        return "Borrowers{" +
                "name='" + name + '\'' +
                ", contact_details='" + contact_details + '\'' +
                ", membership_ID='" + membership_ID + '\'' +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }

    private Map<String, String> borrowedBooks;
    public Borrowers(String name, String contact_details, String membership_ID) {
        this.name = name;
        this.contact_details = contact_details;
        this.membership_ID = membership_ID;
        this.borrowedBooks=new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact_details() {
        return contact_details;
    }

    public void setContact_details(String contact_details) {
        this.contact_details = contact_details;
    }

    public String getMembership_ID() {
        return membership_ID;
    }

    public void setMembership_ID(String membership_ID) {
        this.membership_ID = membership_ID;
    }
    public Map<String, String> getBorrowedBooks() {
        return borrowedBooks;
    }
}
