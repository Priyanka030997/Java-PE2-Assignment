package com.stackroute.pe2;
//check given string is palindrome or not
public class PalindromeString {
    public String CheckPalindrome(String str)
    {
        if(str.isEmpty()||(str).equals(null))
        {
            return "null";
        }
        else {
            //String temp=str;
            String reverse = "";
            //reverse the string
            for (int i = str.length() - 1; i >= 0; i--) {
                reverse = reverse + str.charAt(i);
            }
            //check given string with reversed string
            if (str.equals(reverse)) {
                return "Palindrome";
            } else {
                return "Not Palindrome";
            }
        }

    }
}
