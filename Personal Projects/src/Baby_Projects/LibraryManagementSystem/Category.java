package Baby_Projects.LibraryManagementSystem;

public class Category { // n-ary Tree Node Implementation
    Document docs; // SLL in the binary tree
    String type;
    // Linked List of child nodes
    Category subType, nextType;

    public Category(String type) {
        this.type = type;
        subType = null;
        nextType = null;
        docs = null;
    }

    public String toString() {
        return type;
    }

    public void insertDoc(Document doc) {
        Document temp = docs;
        if (temp == null) {
            docs = doc;
            return;
        }

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = doc;
    }

    public Document mostDownloaded() {
        if (docs == null) {
            return null;
        }

        Document maxDoc = docs;
        Document current = docs.next;

        while (current != null) {
            if (current.downloadCount > maxDoc.downloadCount) {
                maxDoc = current;
            }
            current = current.next;
        }

        return maxDoc;
    }
}
