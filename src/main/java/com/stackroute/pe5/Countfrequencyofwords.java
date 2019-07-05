/*Write a program to find the number of counts in the following String. Store the output in
Map<String,Integer> as key value pair.
Input : String str = “one one -one___two,,three,one @three*one?two”;
Output : {"one":5 , "two":2, "three" :2}*/
package com.stackroute.pe5;
import java.util.*;

public class Countfrequencyofwords
{

    public String checkFrequency(String input) {
        if (input == null)
            return "wrong input";//error condition
        List<String> stringList = Arrays.asList(input.split("[\\W_]+"));//string is split according to the non word characters
        Map<String, Integer> map = new HashMap<>();
        for (String word : stringList) {
            if (map.containsKey(word)) {
                map.replace(word, map.get(word) + 1);
            } else {
                map.put(word, 1);//counter is incremented
            }
        }
        return map.toString();//map is returned as string
    }
}
