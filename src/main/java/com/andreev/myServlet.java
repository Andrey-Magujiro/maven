package com.andreev;

import java.util.HashMap;
import java.util.Optional;

public class myServlet{
    public static HashMap<Integer, String> map = new HashMap<>();

    public static void main(String[] args){
        if(map.size() >= 5){
            map.clear();
        }

        for(int i = 1; i < 6; i++){
            putInMapEnumObject(map, namesAndIds.returnEnum(i).get());
        }

        map.entrySet().stream().forEach(x -> System.out.println("Id: " + x.getKey() +
                " Name: " + x.getValue()));
    }

    public static void putInMapEnumObject(HashMap<Integer, String> map, namesAndIds obj){
        map.put(obj.getId(), obj.getName());
    }

}




