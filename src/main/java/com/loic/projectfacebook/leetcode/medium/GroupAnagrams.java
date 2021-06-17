package com.loic.projectfacebook.leetcode.medium;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key))
                ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());


        /*ArrayList<String> list = new ArrayList<>();
        List<List<String>> result = new ArrayList<List<String>>();
        Map<String,ArrayList<String>> mapList = new HashMap<>();

        for(String str: strs) {

            char[] arr_char = str.toCharArray();

            Arrays.sort(arr_char);

                String ns = new String(arr_char);


                if (mapList.containsKey(ns)) {

                    //new_list.add(list.add(strs[i]));
                    mapList.get(ns).add(str);
                } else {

                    ArrayList<String> al = new ArrayList<String>();
                    al.add(str);
                    mapList.put(ns, al);

                }
        }

        result.addAll(mapList.values());

        return result;*/


    }

    public static void main(String[] args) {


        GroupAnagrams anagram = new GroupAnagrams();
        String[] array_list = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(anagram.groupAnagrams(array_list));
    }
}
