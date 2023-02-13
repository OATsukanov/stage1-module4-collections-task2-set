package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {

        TreeSet<Integer> treeSetOfSquares = new TreeSet<>();

        for (int element : sourceList) {

            int square = element * element;
            treeSetOfSquares.add(square);
        }

        return treeSetOfSquares.subSet(lowerBound, true, upperBound, true );
    }
}
