package spring.boot.dsa.service;

import java.util.HashSet;

public class StringAndArray {

    public int countConsistentStrings(String allowed, String[] words) {

        HashSet<Character> set = new HashSet<>();
        char [] ch = allowed.toCharArray();
        for(int i = 0;i<ch.length;i++){
            set.add(ch[i]);
        }
        int count = 0;
        boolean isConsistent;
        for(String word : words){
            isConsistent = true;
            for(int i = 0;i<word.length();i++){
                if(!set.contains(word.charAt(i))){
                    isConsistent = false;
                    break;
                }
            }
            if(isConsistent){
                count++;
            }
        }
        return count;
    }
}
