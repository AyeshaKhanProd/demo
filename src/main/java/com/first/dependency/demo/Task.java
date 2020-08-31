package com.first.dependency.demo;

public class Task {
    public static void main(String[] args) {
        String name ="AyeshaKhan";
        char[] word = name.toCharArray();
        for (int i=0;i< word.length;i++){
            if(i< word.length-4)
                System.out.print("*");
            else
                System.out.print(word[i]);
        }

    }
}
