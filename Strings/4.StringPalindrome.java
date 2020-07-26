import java.io.*;
import java.util.*;

public class Solution {

    public static String checkPalindrome(String str)
    {
        int n = str.length();
    
        if(n <= 1)
        return "Yes";

        if(str.charAt(0) == str.charAt(n - 1))
        {
            return checkPalindrome(str.substring(1,n-1));
        }

        return "No";
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        System.out.println(checkPalindrome(A));
              
    }
}
