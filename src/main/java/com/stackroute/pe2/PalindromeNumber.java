package com.stackroute.pe2;
//check given number is palindrome or not
public class PalindromeNumber {
    public String CheckPalindrome(int number)
    {
        int temp=number;
        int digit,sum=0;
        //reverse the number
        while(number>0)
        {
           digit=number%10;
           sum=(sum*10)+digit;
           number=number/10;

        }
        //check given number with reversed number
        if(temp==sum)
        {
            return "Palindrome";
        }
        else
        {
            return "Not Palindrome";
        }
    }
}
