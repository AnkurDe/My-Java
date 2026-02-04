package BabyProjects.Bio.ProteinSequencing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static BabyProjects.Bio.Commons.AMINO_ACID_MASS;

public class DP {
    public static Set<String> sequencing(Set<Integer> spectrum) {
    Set<String> kMer1 = new HashSet<>();
    for (Map.Entry<String, Integer> e : AMINO_ACID_MASS.entrySet()) {
        if (spectrum.contains(e.getValue())) {
            kMer1.add(e.getKey());
        }
    }

    Set<String> results = new HashSet<>();

    for (String aa : kMer1) {
        sequencingRec(spectrum, aa, AMINO_ACID_MASS.get(aa), kMer1, results);
    }

    int maxLen = results.stream()
            .mapToInt(String::length)
            .max()
            .orElse(0);

    Set<String> fin = new HashSet<>();
    for (String s : results) {
        if (s.length() == maxLen) {
            fin.add(s);
        }
    }

    return fin;
}


    private static void sequencingRec(Set<Integer> spectrum, String seq, int mass, Set<String> kMer1, Set<String> results) {
    for (String aa : kMer1) {
        int newMass = mass + AMINO_ACID_MASS.get(aa);

        if (!spectrum.contains(newMass)) {
            continue;
        }

        String extended = seq + aa;
        results.add(extended);

        sequencingRec(spectrum, extended, newMass, kMer1, results);
    }
}


    void main() {
        Set<Integer> seq = new HashSet<>(Arrays.asList(0, 113, 114, 128, 129, 227, 242, 242, 257, 355, 356, 370, 371, 484
        ));
        Set<String> set = sequencing(seq);
        System.out.println(set);
        String origSeq = "NQEL";
        System.out.println(set.contains(origSeq) ? "Has "+origSeq : origSeq+" absent");
    }
}
