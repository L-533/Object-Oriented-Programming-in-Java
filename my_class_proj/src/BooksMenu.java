import java.util.Scanner;


public class BooksMenu {
    private static Book getExpensiveBook(Book book1, Book book2) {
        if (book1.getPrice()<book2.getPrice()) {
            return book2;
        } else {
            return book1;
        }
    }
    public static void main(String s[]) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[10];
        int bkIdx = 0;
        while(true) {
            System.out.println(	"Press 1 to view books, 2 to add books, "+
                                "3 to compare prices of books, any other key to exit");
            String userAction = scanner.nextLine();
            if (userAction.equals("1")) {
                for(int i=0;i<books.length;i++) {
                    if(books[i] != null) {
                        System.out.println(books[i]);
                    }
                }
            } else if (userAction.equals("2")) {
                if(bkIdx == 10) {
                    System.out.println("10 books added already. Cannot add any more books!");
                    continue;
                }
                System.out.println("Which constructor do you want to use? Press 1 for default,"+
                                    "any other key for overloaded constructor");
                String constructor = scanner.nextLine();
                System.out.println("Enter book title");
                String tmpTitle = scanner.nextLine();
                System.out.println("Enter book author");
                String tmpAuthor = scanner.nextLine();
                System.out.println("Enter book price");
                float tmpPrice = Float.parseFloat(scanner.nextLine());
                if (constructor.equals("1")) {
                    Book bkTmp = new Book();
                    bkTmp.setTitle(tmpTitle);
                    bkTmp.setAuthor(tmpAuthor);
                    bkTmp.setPrice(tmpPrice);
                    books[bkIdx++] = bkTmp;
                } else {
                    books[bkIdx++] = new Book(tmpTitle, tmpAuthor, tmpPrice);
                }
            } else if (userAction.equals("3")) {
                System.out.println("Enter index of first book to compare");
                int book1Idx = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter index of second book to compare");
                int book2Idx = Integer.parseInt(scanner.nextLine());

                if (books[book1Idx] != null && books[book2Idx] != null ) {
                    System.out.println("The details of expensive book is \n"+getExpensiveBook(books[book1Idx],books[book2Idx]));
                } else {
                    System.out.println("One of the books is null");
                }
            } else {
                break;
            }
        }
    }
}