package Baby_Projects.LibraryManagementSystem;

public class LMS {
    private static Category root;

    // WORKING CORRECTLY
    private static boolean insertInCategoryRec(String catInsert, Category node, String subType) {
        if (node == null) {
            return false;
        }
        
        if (node.type.equals(subType)) {
            Category newCat = new Category(catInsert);
            if (node.subType == null) {
                node.subType = newCat;
            } else {
                Category current = node.subType;
                while (current.nextType != null) {
                    if (current.type.equals(catInsert)) {
                        System.out.println("Category '" + catInsert + "' already exists under '" + subType + "'");
                        return true;
                    }
                    current = current.nextType;
                }
                if (current.type.equals(catInsert)) {
                    System.out.println("Category '" + catInsert + "' already exists under '" + subType + "'");
                    return true;
                }
                current.nextType = newCat;
            }
            return true;
        }
        
        // Search in depth (children)
        boolean found = insertInCategoryRec(catInsert, node.subType, subType);
        if (!found) {
            // If not found in children, search in siblings
            found = insertInCategoryRec(catInsert, node.nextType, subType);
        }
        return found;
    }

    private static void insertInCategory(String catInsert, String subType) {
        if (root == null) {
            root = new Category(catInsert);
            return;
        }
        
        boolean success = insertInCategoryRec(catInsert, root, subType);
        if (!success) {
            System.out.println("Parent category '" + subType + "' not found");
        }
    }

    //WORKING CORRECTLY
    private static void showCategories() {
        showCategories(root, 0);
    }

    // WORKING CORRECTLY
    private static void showCategories(Category node, int k) {
        if (node == null) {
            return;
        }

        // Print current node
        for (int i = 0; i < k; i++) {
            System.out.print("|\t");
        }
        System.out.println(node.type);

        // Print documents of current node
        Document temp = node.docs;
        while (temp != null) {
            for (int i = 0; i < k + 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("--" + temp.toString());
            temp = temp.next;
        }

        // Process first child (subType)
        showCategories(node.subType, k + 1);
        
        // Process siblings (nextType)
        showCategories(node.nextType, k);
    }

    // WORKING CORRECTLY
    private static void insertDoc(Document doc, String category) {
        insertDocRec(doc, category, root);
    }

    // WORKING CORRECTLY
    static void insertDocRec(Document doc, String category, Category node) {
        if (node == null) {
            return;
        }

        if (node.type.equals(category)) {
            node.insertDoc(doc);
            return;
        }

        // Try in subtree
        insertDocRec(doc, category, node.subType);
        // Try in sibling
        insertDocRec(doc, category, node.nextType);
    }

    // WORKING CORRECTLY
    static Document mostDownloaded() {
        return mostDownloaded(root, null);
    }

    // WORKING CORRECTLY
    static Document mostDownloaded(Category cat, Document toCompare) {
        if (cat == null) {
            return toCompare;
        }

        Document localMax = cat.mostDownloaded();
        if (localMax != null) {
            if (toCompare == null || localMax.downloadCount > toCompare.downloadCount) {
                toCompare = localMax;
            }
        }

        toCompare = mostDownloaded(cat.subType1, toCompare);
        toCompare = mostDownloaded(cat.subType2, toCompare);

        return toCompare;
    }

    public static void main(String[] args) {
        // Inserting documents
        insertInCategory("Science", "Science");
        insertDoc(new Document("Me", 1000, "D001", "Vigyaan kyu hai zaroori?"), "Science");
        insertDoc(new Document("Someone", 1000, "D002", "Science? Why?"), "Science");

        insertInCategory("Physics", "Science");
        insertDoc(new Document("Me", 1000, "D001", "Bahutik Vigyaan"), "Physics");
        insertDoc(new Document("Someone", 1000, "D002", "How to physics?"), "Physics");

        insertInCategory("Chemistry", "Science");
        insertDoc(new Document("Me", 1000, "D001", "Rasayan Vigyaan"), "Chemistry");
        insertDoc(new Document("Someone", 1000, "D002", "This subject💀 Why?"), "Chemistry");

        insertInCategory("Reactions", "Chemistry");
        insertDoc(new Document("Me", 1000, "D001", "Why reactions occur?"), "Reactions");
        insertDoc(new Document("Someone", 1000, "D002", "Types of reactions"), "Reactions");

        insertInCategory("Safety Manual", "Chemistry");
        insertDoc(new Document("Me", 1000, "D001", "Safety is important even-if you have a partner or not"), "Safety Manual");
        insertDoc(new Document("Someone", 1000, "D002", "How to not play around with chemicals"), "Safety Manual");

        insertInCategory("Thermodynamics", "Physics");
        insertDoc(new Document("Me", 1000, "D001", "Heat-Something you can't relate to "), "Thermodynamics");
        insertDoc(new Document("Someone", 1000, "D002", "Heat why?"), "Thermodynamics");

        insertInCategory("Fluid Mechanics", "Physics");
        insertDoc(new Document("Abhinav", 1000, "D001", "The aura of Fluid Dynamics"), "Fluid Mechanics");
        insertDoc(new Document("Vineet", 1000, "D002", "Fluid Dynamics karne ka aasan tareeka"), "Fluid Mechanics");

        showCategories();
        System.out.println("\n\nMost Downloaded: " + mostDownloaded());

        System.out.println("Ended");
    }
}