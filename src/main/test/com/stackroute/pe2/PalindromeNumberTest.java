package com.stackroute.pe2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeNumberTest {

    PalindromeNumber palindromenumber;
    @Before
    public void setup()
    {
        palindromenumber=new PalindromeNumber();
    }
    @Test
    public void NumberisPalindrome()
    {
        String result=palindromenumber.CheckPalindrome(121);
        assertEquals("Palindrome",result);
    }
    @Test
    public void NumberisNotPalindrome()
    {
        String result=palindromenumber.CheckPalindrome(12342);
        assertEquals("Not Palindrome",result);
    }
    @Test
    public void NegativeNumberisNotPalindrome()
    {
        String result=palindromenumber.CheckPalindrome(-151);
        assertEquals("Not Palindrome",result);
    }

}

