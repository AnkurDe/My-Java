String complement(String dnaSeq) {
    StringBuilder reverseCompliment = new StringBuilder();
    final Map<Character, Character> map = Map.ofEntries(
            Map.entry('A', 'T'),
            Map.entry('T', 'A'),
            Map.entry('G', 'C'),
            Map.entry('C', 'G')
    );

    for (final char c : dnaSeq.toCharArray()) {
        reverseCompliment.append(map.get(c));
    }

    return reverseCompliment.toString();
}

void main() {
    System.out.println(complement("ATGC"));
    System.out.println(complement("ATCC"));
}