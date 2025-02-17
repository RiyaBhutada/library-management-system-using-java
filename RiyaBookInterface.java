public interface RiyaBookInterface {
    //public void Riya_BookInterface();
    void removeBook(String t) throws RiyaQueueException;
    void addBook(RiyaItemType book) throws RiyaQueueException;
}
