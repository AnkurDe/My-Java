package BabyProjects.Bio.ProteinSequencing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static BabyProjects.Bio.Commons.AMINO_ACID_MASS;
import static BabyProjects.Bio.Commons.isConsistent;

public class BruteForce {

    public static Set<String> sequencing(Set<Integer> spectrum) {
        int parentMass = spectrum.stream().max(Integer::compareTo).get();

        Set<String> peptides = new HashSet<>();
        peptides.add("");

        Set<String> result = new HashSet<>();

        while (!peptides.isEmpty()) {
            // Expand
            Set<String> expanded = new HashSet<>();
            for (String p : peptides) {
                for (String aa : AMINO_ACID_MASS.keySet()) {
                    expanded.add(p + aa);
                }
            }

            peptides.clear();

            for (String peptide : expanded) {

                int m = mass(peptide);

                if (m == parentMass) {
                    if (cyclicSpectrum(peptide).equals(spectrum)) {
                        result.add(peptide);
                    }
                }

                if (m <= parentMass && isConsistent(peptide, spectrum)) {
                    peptides.add(peptide);
                }
            }
        }
        return peptides;
    }

    static int mass(String peptide) {
        int sum = 0;
        for (char c : peptide.toCharArray()) {
            sum += AMINO_ACID_MASS.get(c);
        }
        return sum;
    }

    static Set<Integer> cyclicSpectrum(String peptide) {

        Set<Integer> spectrum = new HashSet<>();
        spectrum.add(0);

        int n = peptide.length();
        String doubled = peptide + peptide;

        for (int len = 1; len < n; len++) {
            for (int i = 0; i < n; i++) {
                spectrum.add(mass(doubled.substring(i, i + len)));
            }
        }

        spectrum.add(mass(peptide));
        return spectrum;
    }


    static void main() {
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
        System.out.println(set.contains(origSeq) ? "Has " + origSeq : origSeq + " absent");

    }
}
