package com.first.dependency.demo;

public class Task {
    public static void main(String[] args) {
        String name = "Ayesh";
        System.out.println(mask(name));
    }

    protected static String mask(String name) {
        if (name==null||name.equals("")){
            return "Name can not be null or empty";
        }
        char[] word = name.toCharArray();
        StringBuilder br = new StringBuilder();
        for (int i = 0; i < word.length; i++) {
            if (i < word.length - 4)
                br.append("*");
            else
                br.append(word[i]);
        }
        return br.toString();
    }
}
