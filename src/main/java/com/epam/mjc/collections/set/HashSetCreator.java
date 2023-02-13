package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {

        HashSet<Integer> hashSetOfIntegers = new HashSet<>();

        if (sourceList.size() == 0) return hashSetOfIntegers;

        for (int element : sourceList) {

            if (element % 2 == 0) {

                hashSetOfIntegers.add(element);
                while (element % 2 == 0) {

                    element = element/2;
                    hashSetOfIntegers.add(element);
                }

            } else {

                hashSetOfIntegers.add(element);
                hashSetOfIntegers.add(element * 2);
            }
        }

        return hashSetOfIntegers;
    }
}
