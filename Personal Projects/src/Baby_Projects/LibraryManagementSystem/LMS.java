package Baby_Projects.LibraryManagementSystem;

public class LMS {
    private static Category root;

    // WORKING CORRECTLY
    private static void insertInCategory(String catInsert, String subType) {
        if (root == null) {
            root = new Category(catInsert);
            return;
        }
        insertInCategoryRec(catInsert, root, subType);
    }

    // WORKING CORRECTLY
    private static void insertInCategoryRec(String catInsert, Category node, String subType) {
        if (node != null) {
            if (node.type.equals(subType)) {
                if (node.subType1 == null) {
                    node.subType1 = new Category(catInsert);
                    return;
                } else {
                    if (node.subType2 != null) {
                        System.out.println("The category is filled");
                        return;
                    }
                    node.subType2 = new Category(catInsert);
                }
                return;
            }

            insertInCategoryRec(catInsert, node.subType1, subType);
            insertInCategoryRec(catInsert, node.subType2, subType);
        }
    }

    //WORKING CORRECTLY
    private static void showCategories() {
        showCategories(root, 0);
    }

    // WORKING CORRECTLY
    private static void showCategories(Category node, int k) {
        if (node != null) {
            for (int i = 0; i < k; i++) {
                System.out.print("|\t");
            }

            System.out.println(node.type);
            Document temp = node.docs;

            while (temp != null) {
                for (int i = 0; i < k + 1; i++) {
                    System.out.print("|\t");
                }

                System.out.println("--"+temp.toString());
                temp = temp.next;
            }
            showCategories(node.subType1, k + 1);
            showCategories(node.subType2, k + 1);
        }
    }

    static void insertDoc(Document doc, String category) {
        insertDocRec(doc, category, root);
    }

    static Document mostDownloaded() {
        return mostDownloaded(root, null);
    }

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


    static void insertDocRec(Document doc, String category, Category node) {
        if (node != null) {
            if (node.type.equals(category)) {
                node.insertDoc(doc);
                return;
            }
            insertDocRec(doc, category, node.subType1);
            insertDocRec(doc, category, node.subType2);
        }
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
        System.out.println("\n\n Most Downloaded: " + mostDownloaded());

        System.out.println("Ended");
    }
}