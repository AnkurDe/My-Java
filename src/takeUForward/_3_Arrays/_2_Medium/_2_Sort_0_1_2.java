void sort(int[] nums) {
    final int length = nums.length;
    int num0 = 0, num1 = 0, num2 = 0;

    for (int i = 0; i < length; i++) {
        switch (nums[i]) {
            case 0:
                ++num0;
                break;
            case 1:
                ++num1;
                break;
            case 2:
                ++num2;
                break;
        }
    }
    int pointer = 0;
    for (int i = 0; i < num0; i++, pointer++) {
        nums[pointer] = 0;
    }

    for (int i = 0; i < num1; i++, pointer++) {
        nums[pointer] = 1;
    }

    for (int i = 0; i < num2; i++, pointer++) {
        nums[pointer] = 2;
    }
}

void testing(int[] nums) {
    System.out.print(Arrays.toString(nums) + " -> ");
    sort(nums);
    System.out.println(Arrays.toString(nums));
}

void main() {
    int[] nums = new int[]{1, 0, 2, 1, 0};
    testing(nums);

    nums = new int[]{2, 0, 2, 1, 1, 0};
    testing(nums);

    nums = new int[]{2, 0, 1};
    testing(nums);

    nums = new int[]{0, 0, 1, 1, 1};
    testing(nums);
}