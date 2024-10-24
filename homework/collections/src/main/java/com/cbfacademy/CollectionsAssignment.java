package com.cbfacademy;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeSet;

public class CollectionsAssignment {

    /**
     * This method removes all values from the provided list that are smaller
     * than the indicated integer. The remaining elements retain their original
     * ordering.
     *
     * @param list     - the list of integers
     * @param minValue the minimum value to retain
     */
    public static void removeSmallInts(List<Integer> list, int minValue) {
        // Your solution must traverse the list from last to first element
        // removing any values less than minValue.
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            if (iterator.previous() < minValue) {
                iterator.remove();
            } // traverses list in reverse

        }

    }

    /**
     * This method returns true if the provided collection contains any
     * duplicate elements.
     *
     * @param integers - a collection of integers
     * @return true if integers contains duplicates, false otherwise
     */
    public static boolean containsDuplicates(Collection<Integer> integers) {// takes a perameter of integer objects
        // Your solution must not use any loops.

        return new HashSet<>(integers).size() < integers.size();// hashset removes the duplicates so if haspmap size
                                                                // less than the original collection ir means there were
                                                                // suplicates
    }

    /**
     * This method returns an ArrayList containing all elements that appear in
     * either of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order.
     * <p>
     * For example, if the two arguments contain {2, 1, 2, 3} and {3, 4, 4, 5},
     * the returned ArrayList will contain {1, 2, 3, 4, 5}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return A sorted ArrayList containing the integers that appear in either
     *         collection.
     */
    public static ArrayList<Integer> inEither(Collection<Integer> ints1, Collection<Integer> ints2) {// collection
                                                                                                     // integers
        // This must be done with no loops.
        TreeSet<Integer> uniqueElements = new TreeSet<>(ints1);// new create(ints1);//tree sets automatically sorts and
                                                               // no duplicates

        uniqueElements.addAll(ints2);// adding collection 2
        return new ArrayList<>(uniqueElements); // return array list with unique ints in ascending order
    }

    /**
     * This method returns an ArrayList containing all elements that appear in
     * both of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order. For example, if the two arguments contain {2, 1, 2, 3} and
     * {3, 4, 4, 5}, the returned ArrayList will contain {3}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return An ArrayList containing the integers that appear in both
     *         collections.
     */
    public static ArrayList<Integer> inBoth(Collection<Integer> ints1, Collection<Integer> ints2) {
        // This must be done with no loops.
        TreeSet<Integer> set1 = new TreeSet<>(ints1);
        TreeSet<Integer> set2 = new TreeSet<>(ints2);

        set1.retainAll(set2);// retain all allows for common elements to be reained
        return new ArrayList<>(set1);
    }

    /**
     * This method returns the String that appears most frequently in the
     * provided list. For example, if the input list contains the elements
     * {"Bob", "Alice", "Bob"}, this method will return "Bob". If there are
     * ties, any of the most frequently occurring elements may be returned.
     * If the list is empty, return the empty string "".
     *
     * @param list - a list of Strings
     * @return the most frequently occurring String
     */
    public static String mostFrequent(List<String> list) {
        // You should solve this problem in two stages: First iterate through
        // the list to count occurrences of each String. Then iterate through
        // your counts to find the largest. You'll need a collection that allows
        // you to store a mapping from Strings to counts.
        // No nested loops or non-enhanced for-loops are allowed.
        if (list.isEmpty())
            return "";

        Map<String, Integer> occurrences = new HashMap<>();// map no duplicates stores count of unique string(key)
        for (String s : list) {// iterate through list
            occurrences.put(s, occurrences.getOrDefault(s, 0) + 1);// if not in list retirn 0 if in list get count +1;
        }

        String mostFrequent = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() > maxCount) {// checks if each entry is greater than max count which is 0

                mostFrequent = entry.getKey();// sets the string to the key
                maxCount = entry.getValue();// sets map count to the value
            }
        }

        return mostFrequent;
    }

    public static String getName() {
        return "Collections Assignment";
    }
}
