/*1. Write a Java program to update specific array element by given element and empty the array list.
Input: [Apple, Grape, Melon, Berry]
Output: [Kiwi, Grape, Mango, Berry]
Array list after removing all elements []*/

package com.stackroute.pe5;
import java.util.*;


public class UpdateandemptyArraylist {

    private List<String> stringList = new ArrayList<>();

    // convert array of string to List
    public List<String> converttoArray(String[] inputArray) {
        for (String input : inputArray) {
            stringList.add(input);
        }
        return stringList;
    }

    //  remove all element of list
    public List<String> removeAllOccurences() {
        stringList.clear();
        return stringList;
    }

    // replace list value with respective index
    public List<String> updateValues(int index, String value) {
        stringList.set(index, value);
        return stringList;
    }
}
