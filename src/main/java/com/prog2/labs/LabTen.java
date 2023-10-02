package com.prog2.labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author adinashby
 *
 */
public class LabTen {

    /**
     * Write your test code below in the main (optional).
     *
     */
    public static void main(String[] args) {

    }

    /**
     * Please refer to the README file for question(s) description
     */

    public String[] spellchecker(String[] wordlist, String[] queries) {
        HashSet<String> wordSet = new HashSet<>(Arrays.asList(wordlist));
        HashMap<String, String> caseMap = new HashMap<>();
        HashMap<String, String> vowelMap = new HashMap<>();

        for (String word : wordlist) {
            String wordLower = word.toLowerCase();
            String wordDevowel = vowelCheck(wordLower);

            caseMap.putIfAbsent(wordLower, word);
            vowelMap.putIfAbsent(wordDevowel, word);
        }

        List<String> result = new ArrayList<>();
        for (String query : queries) {
            if (wordSet.contains(query)) {
                result.add(query);
                continue;
            }

            String queryLower = query.toLowerCase();
            String queryDevowel = vowelCheck(queryLower);

            if (caseMap.containsKey(queryLower)) {
                result.add(caseMap.get(queryLower));
            } else if (vowelMap.containsKey(queryDevowel)) {
                result.add(vowelMap.get(queryDevowel));
            } else {
                result.add("");
            }
        }

        return result.toArray(new String[0]);
    }

    public static String vowelCheck(String word) {
        return word.replaceAll("[aeiou]", "*");
    }
}
