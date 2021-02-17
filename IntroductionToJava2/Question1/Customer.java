package Question1;

public class Customer extends User {
    String userType;
    Book bookObj = null;

    Customer(String name, int id, String userType) {
        this.name = name;
        this.id = id;
        this.userType = userType;
    }

    public void requestIssue(String title) {
        System.out.println("check if book is issued or not and take futher actions");
    }

    public void returnBook(String bookName) {
        System.out.println("set book issued status to false");
    }

    public void get_bookInfo(String title) {
        if (searchByName(title)) {
            System.out.println("Customer called the get_bookinfo method");
        } else {
            System.out.println("Book is not available");
        }
    }
}
