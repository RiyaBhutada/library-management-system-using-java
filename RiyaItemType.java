public class RiyaItemType {
    private String title;
    private String author;
    private int publishedYear;
    public boolean bookIssued;
    public String issuedBy;
 
    RiyaItemType left, right;
    
    public RiyaItemType(){
        title = null;
        author = null;
        publishedYear = 0;
        left = right = null;
        bookIssued = false;
        issuedBy = null;
    }

    public RiyaItemType(RiyaItemType book){
        title = book.title;
        author = book.author;
        publishedYear = book.publishedYear;
        left = right = null;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String inputTitle){
        title = inputTitle;
    }

    public String getAuthor(){
        return author;
    }
    
    public void setAuthor(String inputAuthor){
        author = inputAuthor;
    }

    public int getYear(){
        return publishedYear;
    }
    
    public void setYear(int inputYear){
        publishedYear = inputYear;
    }

}
