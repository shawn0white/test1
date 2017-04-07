package test1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {  
	
	
	public int lengthOfLongestSubstring(String s) {  
        if(s == null || s.length() == 0)  
            return 0;  
        HashSet<Character> set = new HashSet<Character>();  
        int maxLen = 1;  
        int i = 0;  
        int j = 0;  
        for(i = 0; i < s.length(); i++) {  
            if(set.contains(s.charAt(i))){  
                if(maxLen < i-j)  
                    maxLen = i-j;  
                while(j < i){  
                    if(s.charAt(j) == s.charAt(i)){  
                        j++;  
                        break;  
                    }  
                    set.remove(s.charAt(j));  
                    j++;  
                }  
            }else{  
                set.add(s.charAt(i));  
            }  
        }  
        return Math.max(maxLen, i-j);  
    }  
}