// There is one meeting room in a firm.
// You are given two arrays, start and end each of size N.
// For an index ‘i’, start[i] denotes the starting time of the ith meeting while end[i] will denote the ending time of the ith meeting.
// Find the maximum number of meetings that can be accommodated if only one meeting can happen in the room at a particular time.
// Print the order in which these meetings will be performed.

List<Integer> nMeetingsInRoom(int[] start, int[] end) {
    List<Integer> meetings = new ArrayList<>();
//    Arrays.sort(start);
//    Arrays.sort(end);

    int i = 0, j = 0;
    while (i < start.length && j < end.length) {
        if (start[i] < end[j]) {
            i++;
            meetings.add(i);
        }
        j++;
    }

    return meetings;
}

void testing(int[] start, int[] end) {
    System.out.printf("The meetings are to be done in order %s\n", nMeetingsInRoom(start, end));
}

void main() {
    int[][] starts = {
            {1, 3, 0, 5, 8, 5}
    },
            ends = {
                    {2, 4, 5, 7, 9, 9}
            };

    for (int i = 0; i < starts.length; i++) {
        testing(starts[i], ends[i]);
    }
}