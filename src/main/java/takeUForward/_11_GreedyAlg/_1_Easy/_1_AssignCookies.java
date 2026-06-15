// Problem Statement: Consider a scenario where a teacher wants to distribute cookies to students, with each student receiving at most one cookie. Given two arrays, student and cookie, the ith value in the student array describes the minimum size of cookie that the ith student can be assigned. The jth value in the cookie array represents the size of the jth cookie. If cookie[j] >= student[i], the jth cookie can be assigned to the ith student. Maximize the number of students assigned with cookies and output the maximum number.

int assignCookies(int[] student, int[] cookie) {
    Arrays.sort(student);
    Arrays.sort(cookie);

    int i = 0, j = 0;
    int count = 0;
    while (i < student.length && j < cookie.length) {
        if (student[i] <= cookie[j]) {
            count++;
            i++;
        }
        j++;
    }
    return count;
}

void testing(int[] student, int[] cookie) {
    System.out.printf("The maximum happiness is %d \n", assignCookies(student, cookie));
}

void main() {
    int[][] students = {
            {1, 2, 3},
            {1, 2}
    };

    int[][] cookies = {
            {1, 1},
            {1, 2, 3},
    };

    for (int i = 0; i < students.length; i++) {
        testing(students[i], cookies[i]);
    }
}