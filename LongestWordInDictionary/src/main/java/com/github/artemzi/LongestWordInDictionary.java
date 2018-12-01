package com.github.artemzi;

import java.util.HashMap;
import java.util.Map;

/**
 * The Challenge
 * Given a string S and a set of words D, find the longest word in D that is a subsequence of S.
 *
 * Word W is a subsequence of S if some number of characters, possibly zero, can be deleted from S to form W,
 * without reordering the remaining characters.
 *
 * Note: D can appear in any format (list, hash table, prefix tree, etc.
 *
 * For example, given the input of S = "abppplee" and D = {"able", "ale", "apple", "bale", "kangaroo"}
 * the correct output would be "apple"
 *
 * The words "able" and "ale" are both subsequences of S, but they are shorter than "apple".
 * The word "bale" is not a subsequence of S because even though S has all the right letters, they are not in the right order.
 * The word "kangaroo" is the longest word in D, but it isn't a subsequence of S.
 */
public class LongestWordInDictionary {
    private static final String S = "abppplee";
    private static final String S1 = "abpcplea";
    private static final String S2 = "ambponcpkleya";
    private static final String[] D = new String[] {"able", "ale", "apple", "bale", "kangaroo"};
    private static final String[] D1 = new String[] {"ale", "apple", "monkey", "plea"};

    public static void main(String[] args) {
        System.out.println(getResult(solve(S, D)));
        System.out.println(getResult(solve(S1, D1)));
        System.out.println(getResult(solve(S2, D1)));
    }

    private static String getResult(Map<String, Integer> map) {
        String result = "";
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if (entry.getKey().length() <= entry.getValue()) {
                result = result.length() > entry.getKey().length() ? result :
                        entry.getKey();
            }
        }
        return result;
    }

    private static Map<String, Integer> solve(String line, String[] words) {
        Map<String, Integer> t = new HashMap<>();
        for (String d: words) {
            t.put(d, 0);
        }

        for (char ch: line.toCharArray()) {
            String letter = Character.toString(ch);

            for (Map.Entry<String, Integer> entry: t.entrySet()) {
                if (entry.getKey().contains(letter)) {
                    Integer val = entry.getValue();
                    t.put(entry.getKey(), ++val);
                }
            }
        }
        return t;
    }
}
