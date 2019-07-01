package com.stackroute.pe2;

public class PalindromeString {
    //check given string is palindrome or not
    public String CheckPalindrome(String str)
    {
        //String temp=str;
       String reverse="";
       //reverse the string
       for(int i=str.length()-1;i>=0;i--)
       {
           reverse=reverse+str.charAt(i);
       }
       //check given string with reversed string
       if(str.equals(reverse))
       {
           return "Palindrome";
       }
       else
       {
           return "Not Palindrome";
       }

    }
}
