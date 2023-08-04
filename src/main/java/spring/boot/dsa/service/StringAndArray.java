package spring.boot.dsa.service;

import java.util.*;
import java.util.stream.IntStream;

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

    public int countSeniors(String[] details) {
        int count = 0;
        for(String detail : details){
            if(Integer.parseInt(detail.substring(11,13))>60){
                count++;
            }
        }
        return count;
    }

    public int[] minOperations(String boxes) {
        int [] res = new int[boxes.length()];
        for(int i = 0;i<boxes.length();i++){
            int count = 0;
            for(int j = 0;j<boxes.length();j++){
                if(i!=j && boxes.charAt(j)=='1'){
                    count = count + (Math.max(j,i) - Math.min(j,i));
                }
                res[i] = count;
            }
        }
        return res;
    }

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<Integer> patternIntList = getIntList(pattern);
        List<String> res = new ArrayList<>();
        for (String word:words){
            if(patternIntList.equals(getIntList(word))){
                res.add(word);
            }
        }
        return res;
    }

    public List<Integer> getIntList(String s){
        List<Integer> intL = new ArrayList<>();
        int idx = 0;
        for(char c : s.toCharArray()){
            if(!intL.contains(s.indexOf(c))){
                intL.add(idx);
                idx++;
            } else{
                intL.add(s.indexOf(c));
            }
        }
        return intL;
    }

    public int numOfPairs(String[] nums, String target) {
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){
                if(target.equals(nums[i]+nums[j]) && i!=j){
                    count ++;
                }
            }
        }
        return count;
    }

    public int getSecondHighestElement(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int idx = -1;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0;i<nums.length-1;i++){
            al.add(nums[i]);
            if(nums[i]>largest){
                secondLargest = largest;
                largest = nums[i];
                idx = al.indexOf(secondLargest);
            }
        }
        return idx;

    }
}
