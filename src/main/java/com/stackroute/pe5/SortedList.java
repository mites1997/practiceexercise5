
/*Write a program to implement set interface which sorts the given randomly ordered names in

ascending order. Convert the sorted set in to an array list
Input : Harry Olive Alice Bluto Eugene
Output :
Sorted Set : Alice Bluto Eugene Harry Olive
Array list from Set : Alice Bluto Eugene Harry Olive*/
package com.stackroute.pe5;
import java.util.*;
public class SortedList
{

    public String sortArrayListUsingSortedSet(String string){
        if (string==null)
            return null;//error condition
        SortedSet<String> sortedSet=new TreeSet<>(Arrays.asList(string.split(" ")));//array is split and sorted by treeset

        return new ArrayList<String>(sortedSet).toString();//treeset is returned as string
    }

}
