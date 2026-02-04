package BabyProjects.Bio;

import java.util.Map;
import java.util.Set;

public class Commons {
    public static final Map<String, Integer> AMINO_ACID_MASS;

    static {
        AMINO_ACID_MASS = Map.ofEntries(
                Map.entry("A", 71),   // Alanine
                Map.entry("R", 156),  // Arginine
                Map.entry("N", 114),  // Asparagine
                Map.entry("D", 115),  // Aspartic acid
                Map.entry("C", 103),  // Cysteine
                Map.entry("E", 129),  // Glutamic acid
                Map.entry("Q", 128),  // Glutamine
                Map.entry("G", 57),   // Glycine
                Map.entry("H", 137),  // Histidine
                Map.entry("I", 113),  // Isoleucine
                Map.entry("L", 113),  // Leucine
                Map.entry("K", 128),  // Lysine
                Map.entry("M", 131),  // Methionine
                Map.entry("F", 147),  // Phenylalanine
                Map.entry("P", 97),  // Proline
                Map.entry("S", 87),  // Serine
                Map.entry("T", 101),  // Threonine
                Map.entry("W", 186),  // Tryptophan
                Map.entry("Y", 163),  // Tyrosine
                Map.entry("V", 99)
        );
    }


    public static boolean isConsistent(String seq, Set<Integer> spectrum) {
        int sum = 0;
        for (int i = 0; i < seq.length(); i++) {
            sum += AMINO_ACID_MASS.get(String.valueOf(seq.charAt(i)));
            if (!spectrum.contains(sum)) {
                return false;
            }
        }
        return true;
    }
}
