import BabyProjects.Bio.Type;

import static BabyProjects.Bio.Commons.DNA_CODON_MAP;
import static BabyProjects.Bio.Commons.RNA_CODON_MAP;

String translationRNA(final String rnaSequence, final Type type) {
    final Set<String> startCodons;
    final Map<String, Character> map;

    if (type == Type.DNA) {
        map = DNA_CODON_MAP;
        startCodons = Set.of("ATG", "GTG", "TTG");
    } else if (type == Type.RNA) {
        map = RNA_CODON_MAP;
        startCodons = Set.of("AUG", "GUG", "UUG");
    } else {
        throw new IllegalArgumentException("Cannot be of type protein");
    }


    StringBuilder sb = new StringBuilder();
    int length = rnaSequence.length();
    if (length < 3) {
        return "";
    }
    int i = 0;

    for (; i < length - 3; i++) {
        final char c1 = rnaSequence.charAt(i);
        final char c2 = rnaSequence.charAt(i + 1);
        final char c3 = rnaSequence.charAt(i + 2);
        final String codon = "" + c1 + c2 + c3;

        if (startCodons.contains(codon)) break;
    }

    length = length - ((length - i) % 3);
    for (; i < length; i += 3) {
        final char c1 = rnaSequence.charAt(i);
        final char c2 = rnaSequence.charAt(i + 1);
        final char c3 = rnaSequence.charAt(i + 2);
        final String codon = new String(new char[]{c1, c2, c3});
        sb.append(map.get(codon));
    }


    return sb.toString();
}

void main() {
    System.out.println(translationRNA("AUGUUUAUA", Type.RNA));
    System.out.println(translationRNA("AUGUUUAUAAUGUUUAUAAUGUUUAUAAUGUUUAUA", Type.RNA));
}