
/*Write a program where an array of strings is input and output is a Map<String,boolean> where
each different string is a key and its value is true if that string appears 2 or more times in the array
Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
Output - {“a” : true,”b” :false ,”c” :true,”d” : false}*/

package com.stackroute.pe5;
import java.util.*;

public class BooleanMaptoCount {
    public String checkIfTrue(String inputStringtobechecked){
        if(input==null)
            return "wrong input";//error condition to be checked
        List<String> stringList= Arrays.asList(input.split("[\\W_]+"));//string is split according to Non word character
        Map<String,Integer> map=new HashMap<>();
        for(String each:stringList){
            if(map.containsKey(each)){
                map.replace(each,map.get(each)+1);
            }else{
                map.put(each,1);//counter is incremented if the element is found
            }
        }

        Map<String,Boolean> bmap=new HashMap<>();
        for(String each:map.keySet()){
            if(map.get(each)>=2){
                bmap.put(each,true);//if the count is greater than 2, true is returned
            }else {
                bmap.put(each,false);
            }
        }
        return bmap.toString();//String is returned
    }
}
