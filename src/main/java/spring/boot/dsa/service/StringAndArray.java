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

    public String firstPalindrome(String[] words) {
        for(String word : words){
            int i;
            int j = word.length()-1;
            boolean isPalindrome = true;
            if(word.length()==1){
                return word;
            }
            for(i=0;i<(word.length()/2);i++){
                if(word.charAt(i)!=word.charAt(j)){
                    isPalindrome = false;
                    break;
                }
                j--;
            }
            if(isPalindrome){
                return word;
            }
        }
        return "";
    }
}
