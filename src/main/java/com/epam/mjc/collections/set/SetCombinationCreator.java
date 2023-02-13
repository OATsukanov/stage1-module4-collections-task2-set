package com.epam.mjc.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {

        TreeSet<String> setOfString = new TreeSet<>();

        for (String element : firstSet) {

            if (secondSet.contains(element) && !thirdSet.contains(element)) {

                setOfString.add(element);
            }
        }

        for (String element : thirdSet)
            if (!firstSet.contains(element) && !secondSet.contains(element)) setOfString.add(element);

        return setOfString;
    }
}
