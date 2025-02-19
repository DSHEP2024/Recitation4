public class Recitation4 {

    /**
     * Returns a string generated from word by duplicating
     * each letter in the string based on the character's position. Digits
     * are duplicated by the value of their digit. Any other character
     * considered non-alphanumeric will result in all characters being
     * appended to the result, up to but not including the non-alphanumeric
     * character.
     *
     * @param word a string that is to be exploded
     * @return a string generated from word by duplicating
     *        each letter in the string based on the character's position. Digits
     *        are duplicated by the value of their digit. Any other character
     *        considered non-alphanumeric will result in all characters being
     *        appended to the result, up to but not including the non-alphanumeric
     *        character
     */
    public static String explode(String word){
        StringBuilder sb = new StringBuilder();

            int pos;
            // Loop through the string

            for (pos = 0; pos < word.length(); pos++) {
                char currentChar = word.charAt(pos);
                if (Character.isDigit(currentChar)) {
                    sb.repeat(currentChar, (int)(currentChar - '0'));
                } else if (Character.isLetter(currentChar)) {
                    sb.repeat(currentChar, (pos + 1));
                } else {

                    // Stop expansion and append
                    String subString = word. substring(0, pos);
                    sb.append(subString);
                }
            }
        return sb.toString();
    }
}
/*
1. Assume we have a variable called pos
2. Assume we have a variable called sb
3. start with the first character
4. if the character is a digit, then
     a. duplicate the character based on its value
 5. else if the character is a letter, then duplicate by its position
 6. else if the character is not (a letter and not a digit), then append string up to but not including the character
 7 . get the next character
 8. if there is another character then goto 4
 9. Done

*/
