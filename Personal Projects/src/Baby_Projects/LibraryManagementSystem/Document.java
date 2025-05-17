package Baby_Projects.LibraryManagementSystem;

public class Document {
    private int downloadCount;
    private final String author;
    Document next;
    private final String docId;
    private final String title;

    public Document(String author, int downloadCount, String docId, String title) {
        if (author == null || docId == null || title == null) {
            throw new IllegalArgumentException("Author, docId, and title cannot be null");
        }
        if (downloadCount < 0) {
            throw new IllegalArgumentException("Download count cannot be negative");
        }
        
        this.docId = docId;
        this.author = author;
        this.downloadCount = downloadCount;
        this.title = title;
    }

    public String getDocId() {
        return docId;
    }

    public int getDownloadCount() {
        return downloadCount;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "[" + docId + "] \"" + title + "\" -by " + author;
    }
}