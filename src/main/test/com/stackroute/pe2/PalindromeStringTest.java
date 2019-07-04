package com.stackroute.pe2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeStringTest {
    PalindromeString palindromestring;
    @Before
    public void setup()

    {
        palindromestring=new PalindromeString();
    }
    @Test
    public void StringisPalindrome()
    {
        String result=palindromestring.CheckPalindrome("malayalam");
        assertEquals("Palindrome",result);
    }
    @Test
    public void StringisNotPalindrome()
    {
        String result=palindromestring.CheckPalindrome("hello");
        assertEquals("Not Palindrome",result);
    }
    @Test
    public void StringisNull()
    {
        String result=palindromestring.CheckPalindrome("");
        assertEquals("null",result);
    }

}