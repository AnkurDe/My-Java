void print(int number, int count){
    if (count < number)
        print(number, count + 1);
    System.out.print(count + " ");
}

void main() {
    print(101, 1);
}