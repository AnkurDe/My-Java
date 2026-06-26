// Problem Statement: Find the validity of an input string s that only contains the letters '(', ')' and '*'. A string entered is legitimate if
// Any left parenthesis '(' must have a corresponding right parenthesis ')'.
// right parenthesis ')' must have a corresponding left parenthesis '('.
// Left parenthesis '(' must go before the corresponding right parenthesis ')'.
// could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".

boolean validParenthesis(String string) {
    int minOpen = 0, maxOpen = 0;
    for (char c : string.toCharArray()) {
        if (c == '(') {
            minOpen++;
            maxOpen++;
        } else if (c == ')') {
            minOpen--;
            maxOpen--;
        } else if (c == '*') {
            minOpen--;
            maxOpen++;
        }

        if (maxOpen < 0)
            return false;

        if (minOpen < 0)
            minOpen = 0;
    }
    return minOpen == 0;
}

void testing(String string) {
    System.out.printf("The pattern is: %s\n", validParenthesis(string) ? "valid" : "not valid");
}

void main() {
    String[] strings = {"(*))", "*(()"};
    for (String string : strings)
        testing(string);
}
