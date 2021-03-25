package com.loic.projectfacebook.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsString {

    final int MAX = 256;

    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> list = new ArrayList<>();

        int s_size = s.length();
        int p_size = p.length();

        char[] sCount = new char[256];
        char[] pCount = new char[256];

        for (int i = 0; i < p_size; i++) {

            sCount[s.charAt(i)]++;
            pCount[s.charAt(i)]++;


            for (int j = 0; j < s_size; j++) {

                if (compare(sCount, pCount)) {

                    list.add(j - s_size);
                }

            }

        }

        return list;
    }

    public boolean compare(char arr1[], char arr2[]) {
        for (int i = 0; i < MAX; i++)
            if (arr1[i] != arr2[i])
                return false;
        return true;
    }
}
