QUESTION LINK - https://practice.geeksforgeeks.org/problems/number-of-distinct-subsequences0909/1
EXPLANATION LINK - 1. Using Recursion - https://www.youtube.com/watch?v=Sa5PmCFF_zI&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=25
  
======================================================================ANSWER===========================================================================================
  
  
class Solution {
    
    int distinctSubsequences(String S) {
        
        Set<String> arr = helper(S);
        
        return arr.size();
    }
    
    
  Set<String> helper(String S){
        
        if(S.length() == 0){
            Set<String> baseResult = new HashSet<>();
            baseResult.add("");
            return baseResult;
        }
        
        String smallString = S.substring(1);
        Set<String> smallAns = helper(smallString);
        
        Set<String> ans = new HashSet<>();
        for(String str : smallAns){
            ans.add(S.charAt(0) + str);
            ans.add("" + str);
        }

         return ans;
    }
}


--------------------------------------------------------------OPTIMIZED APPROACH------------------------------------------------------------------------------------
  
