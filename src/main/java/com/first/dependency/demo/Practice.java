package com.first.dependency.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        String name = "Ayesha Khan";
        String[] nameArray = name.split(" ");
        for (String s:nameArray
             ) {
        StringBuilder word = new StringBuilder(s);
        System.out.print(word.reverse());

            System.out.print(" ");}
        countNumberOfLetters();}

        private static void countNumberOfLetters(){
        String countName = "ayeshaaaa";
        char[] arr = countName.toCharArray();
        HashMap<Character,Integer> wordMap = new HashMap<>();
        for (int i =0 ; i< arr.length;i++){
            char letter = arr[i];
            int count = 0;
            for(int j=i;j<arr.length;j++){
                if (letter==arr[j]){
                    count++;
                }
            }
            if (!wordMap.containsKey(letter))
            wordMap.put(letter,count);
        }
        wordMap.forEach((s,i)-> System.out.println(s+":"+i));

        }

    }


