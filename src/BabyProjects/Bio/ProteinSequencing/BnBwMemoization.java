package BabyProjects.Bio.ProteinSequencing;

import java.util.*;

import static BabyProjects.Bio.Commons.AMINO_ACID_MASS;
import static BabyProjects.Bio.Commons.isConsistent;

// This is my java method to do branch and bound with memoization
public class BnBwMemoization {

    public static Set<String> sequencing(Set<Integer> spectrum) {
        final Set<String> kMer1 = new HashSet<>();
        for (Map.Entry<String, Integer> entry : AMINO_ACID_MASS.entrySet()) {
            if (spectrum.contains(entry.getValue())) {
                kMer1.add(entry.getKey());
            }
        }

        final HashMap<Integer, Set<String>> hashMap = new HashMap<>();
        hashMap.put(1, kMer1);

        int i = 2;
        while (!hashMap.get(i - 1).isEmpty()) {
            Set<String> prev = hashMap.get(i - 1);
            Set<String> next = new HashSet<>();

            // Taking every element in previous set
            for (String ele : prev) {
                for (String s : kMer1) {
                    String seq = ele + s;

                    // If it contains weight then
                    if (isConsistent(seq, spectrum)) {
                        next.add(seq);
//                        System.out.println(seq);
                    }
                }
            }
            hashMap.put(i, next);
            ++i;
        }

        return hashMap.get(i - 2);
    }

    void main() {
        Set<Integer> seq = new HashSet<>(Arrays.asList(
            0, 97, 99, 113, 114, 128, 128, 147, 147, 163, 186, 227,
            241, 242, 244, 260, 261, 262, 283, 291, 333, 340, 357, 388,
            389, 390, 390, 405, 430, 430, 447, 485, 487, 503, 504, 518,
            543, 544, 552, 575, 577, 584, 631, 632, 650, 651, 671, 672,
            690, 691, 738, 745, 747, 770, 778, 779, 804, 818, 819, 835,
            837, 875, 892, 892, 917, 932, 932, 933, 934, 965, 982, 989,
            1031, 1039, 1060, 1061, 1062, 1078, 1080, 1081, 1095, 1136,
            1159, 1175, 1175, 1194, 1194, 1208, 1209, 1223, 1225, 1322
        )); // VKLFPWFNQY
        Set<String> set = sequencing(seq);
//        System.out.println(set);
        String origSeq = "VKLFPWFNQY";
        System.out.println(set.contains(origSeq) ? "Has "+origSeq : origSeq+" absent");
    }
}
