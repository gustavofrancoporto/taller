package br.study;

import java.util.HashSet;

public class Main {

    public int longestSubstringWithoutRepeatingCharacters(String text) {

        var letters = new HashSet<Character>();

        var longest = 0;
        var begin = 0;
        var end = 0;

        while (end < text.length()) {

            var current = text.charAt(end);

            if (letters.contains(current)) {
                longest = Math.max(longest, (end - begin));
                begin = end;
                letters.clear();
            }
            letters.add(current);
            end++;
        }
        return Math.max(longest, (end - begin));
    }


    public static void main(String[] args) {


//        Length of the longest substring without repeating characters
//
//        Given a string str, find the length of the longest substring without repeating characters.
//
//                Example:
//        For “ABDEFGABEF”, the longest substring are “BDEFGA” and “DEFGAB”, with length 6.
//        For “BBBB” the longest substring is “B”, with length 1.
//        For “GEEKSFORGEEKS”, there are two longest substrings shown in the below diagrams, with length 7

        var main = new Main();


        System.out.println(main.longestSubstringWithoutRepeatingCharacters("ABDEFGABEF"));
        System.out.println(main.longestSubstringWithoutRepeatingCharacters("BBBB"));
        System.out.println(main.longestSubstringWithoutRepeatingCharacters("GEEKSFORGEEKS"));
    }
}