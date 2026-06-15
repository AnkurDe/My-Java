String transcription(String dna) {
    final StringBuilder transcribed = new StringBuilder();

    for (char c : dna.toCharArray()){
        if (c == 'T')
            c = 'U';
        transcribed.append(c);
    }

    return transcribed.toString();
}

void main() {
    System.out.println(transcription("ATGC"));
    System.out.println(transcription("ATCC"));
}