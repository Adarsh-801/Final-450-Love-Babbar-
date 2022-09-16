QUESTION LINK - https://practice.geeksforgeeks.org/problems/check-for-bst/1
  
======================================================================ANSWER===========================================================================================
  
public class Solution
{
   
   Node prev=null;
   
   boolean isBST(Node root){
       
       if(root!=null){
           
           if(!isBST(root.left))
                return false;
           
           if(prev!=null && root.data<=prev.data)
                return false;
            
            prev = root;
            
            return isBST(root.right);
       }
       return true; 
   }
}
