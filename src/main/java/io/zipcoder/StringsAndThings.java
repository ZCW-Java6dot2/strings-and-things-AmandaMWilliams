package io.zipcoder;


import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {
        String[] wordArray = input.split("\\s+"); //Split the string at the 'space' into an array of individual words
        Integer output = 0;

        for (int i = 0; i < wordArray.length; i++) {  //iterate through the array elements
            String word = wordArray[i];
            if (word.charAt(wordArray.length) == 'y') {  //if the character at the end of the element is y
                output += 1;                               // add 1 to the count
            } else if (word.charAt(wordArray.length) == 'z') {  //else if the char at the end of the element is z
                output += 1;                           // add 1 to the count
            } else {                    // if it's neither
                output += 0;             // add 0 (nothing) to the count
            }
        }
        return output;          // return the count
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove) {
        String modifiedString = base.replace(remove, ""); //replace the "remove" in the base with nothing
        return modifiedString;               //return what's left
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This notnotis ") // Should return true
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input) {
        input = " " + input + " ";
        String[] isArray = input.split("is");
        String[] notArray = input.split("not");

        return isArray.length == notArray.length;
    }

        /*String[] individualLetterArray = input.split(""); //split the whole sentence into an array of letters
        Integer countingIs = 0;              //make a counter for occurances of the word "is"
        Integer countingNot = 0;           // make a counter for occurances of the word "not"*/

        /*for (int i = 0; i < individualLetterArray.length; i++) {  // iterate through
            String letter = individualLetterArray[i];     // call each element "letter"
            String nextLetter = individualLetterArray[i + 1];
            String thirdLetterT = individualLetterArray[i + 2];
            Boolean isLetterI = "i".equals(letter);
            Boolean isNextLetterS = "s".equals(nextLetter);
            Boolean isLetterN = "n".equals(letter);
            Boolean isNextLetterO = "o".equals(nextLetter);
            Boolean isThirdLetter = "t".equals(thirdLetterT);
            Boolean isWordIs = isLetterI && isNextLetterS;
            Boolean isWordNot = isLetterN && isNextLetterO && isThirdLetter;

            if (isWordIs) {
                countingIs++;
            } else if (isWordNot) {
                countingNot++;
            }
        }

            if (letter == "i" && nextLetter == "s") {  // find "is"
                countingIs += 1;          // add 1 to the "is" counter
            } else if (letter == "n" && nextLetter == "o" && thirdLetterT == "t") {  //find "not"
                countingNot += 1;
            } else {
                countingIs += 0;
            }
        }
        if (countingIs == countingNot) {
            return true;
        } else {
            return false;
        }
    }*/

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {
        return null;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     * countTriple("xxxabyyyycd") // Should return 3
     * countTriple("a") // Should return 0
     */
    public Integer countTriple(String input) {
        return null;
    }
}
