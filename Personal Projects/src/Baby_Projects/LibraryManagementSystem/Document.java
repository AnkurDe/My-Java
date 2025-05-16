package Baby_Projects.LibraryManagementSystem;

public class Document { // SLL Implementation
    int downloadCount;
    String author;
    Document next;
    String docId;
    String title;

    public Document(String author, int downloadCount, String docId, String title) {
        this.docId = docId;
        this.author = author;
        this.downloadCount = downloadCount;
        this.title = title;
        next = null;
    }

    public String toString(){
        return "[" + docId+"] \""+ title + "\" -by " + author;
    }
}