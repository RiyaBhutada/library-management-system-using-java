import java.util.*;

public class CS420ListADT<T> implements RiyaBookInterface{
    T obj;

    private static int n = 0;    
    RiyaItemType book;
    public CS420ListADT(){    
        book = null;
    }

    public RiyaItemType addBookToTree(RiyaItemType b, RiyaItemType inputBook){
        if(b == null){
            b = new RiyaItemType();
            b.setTitle(inputBook.getTitle());
            b.setAuthor(inputBook.getAuthor());
            b.setYear(inputBook.getYear());
            return b;
            
        }else if(inputBook.getTitle().charAt(0) < b.getTitle().charAt(0)){
            b.left = addBookToTree(b.left, inputBook);
        }else{
            b.right = addBookToTree(b.right, inputBook);
        }
        return b;
    }

    public void addBook(RiyaItemType inputBook) throws RiyaQueueException{
        try {  
            
            book = addBookToTree(book, inputBook);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void printTreeLibrary(RiyaItemType b){
        if(b == null)
            return;
        printTreeLibrary(b.left);
        System.out.println("\nTitle:  " + b.getTitle());
        System.out.println("Author: " + b.getAuthor());
        System.out.println("Year:   " + b.getYear());
        //System.out.println("Left tree:   " + b.left);
        //System.out.println("Rt:   " + b.right);
        printTreeLibrary(b.right);
    }

    public void viewLibrary(){
        System.out.println("\n*******SHOWING LIBRARY IN ALPHABETICAL ORDER OF TITLE*******");
        printTreeLibrary(book);
    }

    public RiyaItemType deleteBottomMost(RiyaItemType lTree, RiyaItemType rTree){
        if(lTree.right == null){
            lTree.right = rTree;
            return lTree;
        }else{
            lTree = deleteBottomMost(lTree.right, rTree);
        }
        return lTree;
    }

    public RiyaItemType removeBookFromLibrary(RiyaItemType b, String t){        
        if(b == null){
            System.out.println("b is "+b);
            return null;
        }
        
        if(b.getTitle().charAt(0) == t.charAt(0)){
            if(b.left == null && b.right == null){
                return null;
			}else if(b.left == null){
				b = b.right;
			}else{
				b = deleteBottomMost(b.left, b.right);
			}
        }else if(t.charAt(0) < b.getTitle().charAt(0)){
            b.left = removeBookFromLibrary(b.left, t);
        }else{
            b.right = removeBookFromLibrary(b.right, t);
        }
        return b;
    }

    public void removeBook(String t){
        try {
            if(book != null){
                RiyaItemType result = removeBookFromLibrary(book, t);
                book = result;
                System.out.println("Book deleted successfully!");
            }else{
                System.out.println("LIBRARY EMPTY!");
            }
            
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }       
    }

    public Boolean findBook(String t){
        try {
            if(book != null){
                RiyaItemType b = book;
                while(b.getTitle().charAt(0) != t.charAt(0)){
                    if(t.charAt(0) < b.getTitle().charAt(0)){
                        if(b.left == null)
                            return false;
                        else
                            b = b.left;
                    }else{
                        if(b.right == null)
                            return false;
                        else
                            b = b.right;
                    }
                }
                return true;
            }else{
                System.out.println("LIBRARY EMPTY!");
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }       
        return false;
    }
    
    public static void setn(int number){
        n = number;
    }
}
