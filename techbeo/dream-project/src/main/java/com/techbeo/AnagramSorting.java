package com.techbeo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <p>
 *  Given a sequence of words, print all anagrams together | Set 1
 *  Given an array of words, print all anagrams together. For example, if the given array is {“cat”, “dog”, “tac”, “god”, “act”},
 *  then output may be “cat tac act dog god”.
 * </p>
 * @author Devbrat Anand
 * @date 22.07.18
 */
public class AnagramSorting {

    public static List<String> anagramSortedWords(String[] words) {
        List<String> wordList = new ArrayList();
        for(String word : words) {
            char[] charWord =  word.toCharArray();

        }


        return Collections.emptyList();
    }
    public static void main(String[] args) {
        String words[] = { "cat", "dog", "tac", "god", "act" };
        System.out.println(anagramSortedWords(words));
    }
}