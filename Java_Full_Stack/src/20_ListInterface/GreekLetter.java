/*
Greek letters
You are given a list of GreekLetter objects.
Print each element from this list on a new line.
Invoke the toString method to get the string representation of an object.

Sample Input 1:

Sample Output 1:
{letter='Gamma', position=3}
{letter='Omega', position=24}
{letter='Alpha', position=1}
 */

import java.util.*;

class MainGreekLetter {

    public static void main(String[] args) {
        List<GreekLetter> letterList = new ArrayList<>();

        letterList.add(new GreekLetter("Gamma",  3));
        letterList.add(new GreekLetter("Omega", 24));
        letterList.add(new GreekLetter("Alpha",  1));

        for (GreekLetter letter : letterList) {
            System.out.println(letter.toString());
        }
    }

    static class GreekLetter {

        private String letter;
        private Integer position;

        public GreekLetter(String letter, Integer position) {
            this.letter = letter;
            this.position = position;
        }

        @Override
        public String toString() {
            return "{" +
                    "letter='" + letter + '\'' +
                    ", position=" + position +
                    '}';
        }
    }
}