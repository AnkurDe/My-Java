public List<Integer> bruteforce(int number){
    List<Integer> linkedList = new LinkedList<>();

    for (int i = 1; i <= number; i++) {
        if (number%i==0)
            linkedList.add(i);
    }

    return linkedList;
}

public List<Integer> optimal(int number){
    List<Integer> list = new LinkedList<>();

    for (int i = 1; i*i < number; i++) {
        if (number %i == 0) {
            list.add(i);
            if(i!=number/i){
                list.add(number/i);
            }
        }
    }

    list = new ArrayList<>(list);
    Collections.sort(list);
    return list;
}

void main() {
    int[] nums = {10, 8888, 662566, 67576, 5};

    for (int n : nums) {
        System.out.printf("--Brute The divisors number %d is %s\n", n, bruteforce(n));
        System.out.printf("--Optim The divisors number %d is %s\n", n, optimal(n));
    }
}