package takeUForward._11_GreedyAlg._2_MidHard;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
There is one meeting room in a firm.
You are given two arrays, start and end each of size N.
For an index ‘i’, start[i] denotes the starting time of the ith meeting while end[i] will denote the ending time of the ith meeting.
Find the maximum number of meetings that can be accommodated if only one meeting can happen in the room at a particular time.
 */

public class _1_NMeetingsInRoom {
    public record meeting(int start, int end) {
    }

    List<Integer> nMeetingsInRoom(int[] start, int[] end) {
        List<meeting> meetings = new ArrayList<>();
        List<Integer> meetingList = new ArrayList<>();

        for (int i = 0; i < start.length; i++) {
            meetings.add(new meeting(start[i], end[i]));
        }
        meetings.sort(Comparator.comparingInt(meeting::end));
        int prevEnd = meetings.getFirst().end;
        meetingList.add(1);

        for (int i = 1; i < start.length; i++) {
            if (meetings.get(i).start > prevEnd) {
                meetingList.add(i + 1);
                prevEnd = meetings.get(i).end;
            }
        }

        return meetingList;
    }

    void testing(int[] start, int[] end) {
        System.out.printf("The number of meetings that can be done are %s\n", nMeetingsInRoom(start, end));
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
}
