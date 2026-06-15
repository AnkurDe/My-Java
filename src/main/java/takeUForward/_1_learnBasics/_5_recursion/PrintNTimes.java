void print(String string, int count){
    if (count > 1)
        print(string, --count);
    System.out.print(string + " ");
}

void main() {
    print("Ankur", 3);
}
