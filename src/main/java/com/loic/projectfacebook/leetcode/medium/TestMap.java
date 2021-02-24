package com.loic.projectfacebook.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMap {

    public List testMaps(int [] nums) {


        List<Integer> arrayList = new ArrayList<>();
        Map<Integer,Integer> hMap = new HashMap<>();

        for(int i : nums ) {

            hMap.put(i, hMap.getOrDefault(i,0)+1);
        }

        for (Map.Entry<Integer,Integer> entry : hMap.entrySet()) {

            arrayList.add(entry.getValue());
        }

        return arrayList;

    }

    public static void main(String [] args) {

        TestMap map = new TestMap();
        int [] array = {1,1,1,2,2,3};
        System.out.println(map.testMaps(array));

    }
}
