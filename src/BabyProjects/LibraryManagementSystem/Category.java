package BabyProjects.LibraryManagementSystem;

public class Category {
    Document docs;
    final String type;
    Category subType;
    Category nextType;

    public Category(String type) {
        if (type == null) {
            throw new IllegalArgumentException("Category type cannot be null");
        }
        this.type = type;
        this.subType = null;
        this.nextType = null;
        this.docs = null;
    }

    public void insertDoc(Document doc) {
        if (doc == null) {
            throw new IllegalArgumentException("Document cannot be null");
        }
        
        // Create a new document to avoid external references
        Document newDoc = new Document(doc.getAuthor(), doc.getDownloadCount(), doc.getDocId(), doc.getTitle());
        
        if (docs == null) {
            docs = newDoc;
            return;
        }
        
        Document temp = docs;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newDoc;
    }

    public Document mostDownloaded() {
        if (docs == null) {
            return null;
        }

        Document maxDoc = docs;
        Document current = docs.next;

        while (current != null) {
            if (current.getDownloadCount() > maxDoc.getDownloadCount()) {
                maxDoc = current;
            }
            current = current.next;
        }
        return maxDoc;
    }

}