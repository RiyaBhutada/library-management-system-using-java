import java.util.*;

public class CS420ListADT2<T>{ 
    T obj;
    private static Queue<RiyaItemType> issuedBooks = new LinkedList<RiyaItemType>(); 

    public CS420ListADT2(){    
        
    }

    public void addBook(RiyaItemType book) throws RiyaQueueException{
        try {            
            issuedBooks.offer(book);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void viewIssuedBooks(){
        System.out.println("\n*******ISSUED/BORROWED BOOKS*******");
        for (RiyaItemType book : issuedBooks) {
            System.out.println("\nTitle:  " + book.getTitle());
            System.out.println("Issued By: " + book.getAuthor());
        }
    }

    /*
    public void removeBook(){
        try {
            issuedBooks.remove();
        } catch (Exception e) {
            System.out.println("Cannot remove since library is empty! \n" + e);
        }       
    }
    */
}
