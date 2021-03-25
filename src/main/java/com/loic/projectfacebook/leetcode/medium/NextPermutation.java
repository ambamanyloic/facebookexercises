package com.loic.projectfacebook.leetcode.medium;

import java.util.*;

public class NextPermutation {
    public String nextPermutation(int[] nums) {

        StringBuffer builder = new StringBuffer();
        Set<StringBuffer> strBuffer = new TreeSet<StringBuffer>(
                new StringBufferCustomComparator());

        for(int num: nums) {

            String str = String.valueOf(num);

            strBuffer.add(builder.append(str));
        }

        return strBuffer.toString();

    }

    public class StringBufferCustomComparator
            implements Comparator<StringBuffer> {

        @Override
        public int compare(StringBuffer sbf1, StringBuffer sbf2) {
            return sbf1.toString().compareTo(sbf2.toString());
        }
    }

    public static void main(String[] args){


        NextPermutation perm = new NextPermutation();
        int[] num_arr = {1,2,3};
        System.out.println(perm.nextPermutation(num_arr));
    }
}
