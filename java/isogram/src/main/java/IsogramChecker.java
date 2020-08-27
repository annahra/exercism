import java.util.Set;

import java.util.HashSet;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        String normPhrase = phrase.toLowerCase().replace("-", "").replace(" ", "");

        Set<Character> uniqueChars = new HashSet<Character>();

        for(int idx = 0; idx < normPhrase.length(); idx++) {
            if(uniqueChars.contains(normPhrase.charAt(idx))) {
                return false;
            } else {
                uniqueChars.add(normPhrase.charAt(idx));
            }
        }

        return true;
    }

}
