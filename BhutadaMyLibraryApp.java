import java.io.File;
import java.io.PrintStream;
import java.util.*;

public class BhutadaMyLibraryApp{
    public static void main(String[] args) throws Exception {
        int choice = 0;
        try {
            CS420ListADT<RiyaItemType> library = new CS420ListADT<RiyaItemType>();
            CS420ListADT2<RiyaItemType> issuedBooks = new CS420ListADT2<RiyaItemType>();
            
            File inputFile = new File("./src/input.txt");
            Scanner sc = new Scanner(inputFile);

            //Instantiating the File class
            File outputFile = new File("./src/output.txt");
            //Instantiating the PrintStream class
            PrintStream stream = new PrintStream(outputFile);
            System.out.println("From now on "+outputFile.getAbsolutePath()+" will be your console");
            System.setOut(stream);

            while(choice < 6 && sc.hasNext()){
                System.out.println("\n*******MENU*******");
                System.out.println("1. ADD A BOOK");
                System.out.println("2. VIEW LIBRARY");
                System.out.println("3. ISSUE/BORROW A BOOK");
                System.out.println("4. VIEW ISSUED BOOKS");
                System.out.println("5. REMOVE BOOK");
                System.out.println("6. QUIT APP");
                //Scanner input3 = new Scanner (System.in);
                System.out.println("Please enter your choice: ");
                choice = sc.nextInt();
                
                if(choice == 1){                    
                    RiyaItemType inputBook = new RiyaItemType();
                    System.out.print("Title: "+ " ");
                    inputBook.setTitle(sc.next());
                    System.out.print("Author: "+ " ");
                    inputBook.setAuthor(sc.next());
                    System.out.print("Year: "+ " ");
                    inputBook.setYear(sc.nextInt());
                    
                    library.addBook(inputBook);
                    
                }else if(choice == 2){
                    library.viewLibrary();
                }else if(choice == 3){
                    RiyaItemType issuedBook = new RiyaItemType();
                    System.out.println("Enter the book title you wish to borrow: ");
                    System.out.print("Title: "+ " ");
                    issuedBook.setTitle(sc.next());
                    System.out.println("Enter the name of the person issuing the book: ");
                    issuedBook.issuedBy = sc.next();
                    Boolean isPresent = library.findBook(issuedBook.getTitle());
                    if(isPresent)
                        issuedBooks.addBook(issuedBook);
                }else if(choice == 4){
                    issuedBooks.viewIssuedBooks();
                }else if(choice == 5){
                    System.out.println("Enter the book title you wish to remove: ");           
                    library.removeBook(sc.next());
                }else{
                    System.out.println("\n******QUITTING APPLICATION******");
                }
            }	    
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
