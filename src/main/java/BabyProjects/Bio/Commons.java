package BabyProjects.Bio;

import java.util.Map;
import java.util.Set;

public class Commons {
    public static final Map<String, Integer> AMINO_ACID_MASS;
    public static final Map<String, Character> DNA_CODON_MAP;
    public static final Map<String, Character> RNA_CODON_MAP;

    static {
        DNA_CODON_MAP = Map.<String, Character>ofEntries(
                Map.entry("TTT", 'F'),
                // Phenylalanine
                Map.entry("TTC", 'F'),

                // Leucine
                Map.entry("TTA", 'L'),
                Map.entry("TTG", 'L'),
                Map.entry("CTT", 'L'),
                Map.entry("CTC", 'L'),
                Map.entry("CTA", 'L'),
                Map.entry("CTG", 'L'),

                // Isoleucine
                Map.entry("ATT", 'I'),
                Map.entry("ATC", 'I'),
                Map.entry("ATA", 'I'),

                // Methionine (START)
                Map.entry("ATG", 'M'),

                // Valine
                Map.entry("GTT", 'V'),
                Map.entry("GTC", 'V'),
                Map.entry("GTA", 'V'),
                Map.entry("GTG", 'V'),

                // Serine
                Map.entry("TCT", 'S'),
                Map.entry("TCC", 'S'),
                Map.entry("TCA", 'S'),
                Map.entry("TCG", 'S'),
                Map.entry("AGT", 'S'),
                Map.entry("AGC", 'S'),

                // Proline
                Map.entry("CCT", 'P'),
                Map.entry("CCC", 'P'),
                Map.entry("CCA", 'P'),
                Map.entry("CCG", 'P'),

                // Threonine
                Map.entry("ACT", 'T'),
                Map.entry("ACC", 'T'),
                Map.entry("ACA", 'T'),
                Map.entry("ACG", 'T'),

                // Alanine
                Map.entry("GCT", 'A'),
                Map.entry("GCC", 'A'),
                Map.entry("GCA", 'A'),
                Map.entry("GCG", 'A'),

                // Tyrosine
                Map.entry("TAT", 'Y'),
                Map.entry("TAC", 'Y'),

                // Histidine
                Map.entry("CAT", 'H'),
                Map.entry("CAC", 'H'),

                // Glutamine
                Map.entry("CAA", 'Q'),
                Map.entry("CAG", 'Q'),

                // Asparagine
                Map.entry("AAT", 'N'),
                Map.entry("AAC", 'N'),

                // Lysine
                Map.entry("AAA", 'K'),
                Map.entry("AAG", 'K'),

                // Aspartic Acid
                Map.entry("GAT", 'D'),
                Map.entry("GAC", 'D'),

                // Glutamic Acid
                Map.entry("GAA", 'E'),
                Map.entry("GAG", 'E'),

                // Cysteine
                Map.entry("TGT", 'C'),
                Map.entry("TGC", 'C'),

                // Tryptophan
                Map.entry("TGG", 'W'),

                // Arginine
                Map.entry("CGT", 'R'),
                Map.entry("CGC", 'R'),
                Map.entry("CGA", 'R'),
                Map.entry("CGG", 'R'),
                Map.entry("AGA", 'R'),
                Map.entry("AGG", 'R'),

                // Glycine
                Map.entry("GGT", 'G'),
                Map.entry("GGC", 'G'),
                Map.entry("GGA", 'G'),
                Map.entry("GGG", 'G'),

                // STOP codons
                Map.entry("TAA", '*'),
                Map.entry("TAG", '*'),
                Map.entry("TGA", '*')

        );

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

        RNA_CODON_MAP = Map.<String, Character>ofEntries(

                // Phenylalanine
                Map.entry("UUU", 'F'),
                Map.entry("UUC", 'F'),

                // Leucine
                Map.entry("UUA", 'L'),
                Map.entry("UUG", 'L'),
                Map.entry("CUU", 'L'),
                Map.entry("CUC", 'L'),
                Map.entry("CUA", 'L'),
                Map.entry("CUG", 'L'),

                // Isoleucine
                Map.entry("AUU", 'I'),
                Map.entry("AUC", 'I'),
                Map.entry("AUA", 'I'),

                // Methionine (START)
                Map.entry("AUG", 'M'),

                // Valine
                Map.entry("GUU", 'V'),
                Map.entry("GUC", 'V'),
                Map.entry("GUA", 'V'),
                Map.entry("GUG", 'V'),

                // Serine
                Map.entry("UCU", 'S'),
                Map.entry("UCC", 'S'),
                Map.entry("UCA", 'S'),
                Map.entry("UCG", 'S'),
                Map.entry("AGU", 'S'),
                Map.entry("AGC", 'S'),

                // Proline
                Map.entry("CCU", 'P'),
                Map.entry("CCC", 'P'),
                Map.entry("CCA", 'P'),
                Map.entry("CCG", 'P'),

                // Threonine
                Map.entry("ACU", 'T'),
                Map.entry("ACC", 'T'),
                Map.entry("ACA", 'T'),
                Map.entry("ACG", 'T'),

                // Alanine
                Map.entry("GCU", 'A'),
                Map.entry("GCC", 'A'),
                Map.entry("GCA", 'A'),
                Map.entry("GCG", 'A'),

                // Tyrosine
                Map.entry("UAU", 'Y'),
                Map.entry("UAC", 'Y'),

                // Histidine
                Map.entry("CAU", 'H'),
                Map.entry("CAC", 'H'),

                // Glutamine
                Map.entry("CAA", 'Q'),
                Map.entry("CAG", 'Q'),

                // Asparagine
                Map.entry("AAU", 'N'),
                Map.entry("AAC", 'N'),

                // Lysine
                Map.entry("AAA", 'K'),
                Map.entry("AAG", 'K'),

                // Aspartic Acid
                Map.entry("GAU", 'D'),
                Map.entry("GAC", 'D'),

                // Glutamic Acid
                Map.entry("GAA", 'E'),
                Map.entry("GAG", 'E'),

                // Cysteine
                Map.entry("UGU", 'C'),
                Map.entry("UGC", 'C'),

                // Tryptophan
                Map.entry("UGG", 'W'),

                // Arginine
                Map.entry("CGU", 'R'),
                Map.entry("CGC", 'R'),
                Map.entry("CGA", 'R'),
                Map.entry("CGG", 'R'),
                Map.entry("AGA", 'R'),
                Map.entry("AGG", 'R'),

                // Glycine
                Map.entry("GGU", 'G'),
                Map.entry("GGC", 'G'),
                Map.entry("GGA", 'G'),
                Map.entry("GGG", 'G'),

                // STOP codons
                Map.entry("UAA", '*'),
                Map.entry("UAG", '*'),
                Map.entry("UGA", '*')
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
