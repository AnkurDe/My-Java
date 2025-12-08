void main() {
    LinkedList<String> list = new LinkedList<>();

    list.add("One");
    list.add("Two"); // Adds at the last of the list

    System.out.println(list);
    list.add("Three");
    list.add("Four");
    System.out.println(list);

    System.out.println(list.remove());

    System.out.println("\nNew list");
    list = new LinkedList<>();
    list.add("Apple");
    list.add("Banana");
    list.add("Cherry");
    System.out.println(list);

    list.add(1, "Blueberry");
    System.out.println(list);

    System.out.println("The third element is " + list.get(2));

    list.remove("Cherry");
    System.out.println(list);
}