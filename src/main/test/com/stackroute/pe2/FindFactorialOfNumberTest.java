package com.stackroute.pe2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindFactorialOfNumberTest {
    FindFactorialOfNumber obj;
    @Before
    public void setup()
    {
        obj=new FindFactorialOfNumber();
    }
    @Test
    public void FindFactorialOfPositiveNumber()
    {
        int result=obj.FindFactorialOfGivenNumber(12);
        assertEquals(479001600,result);

    }
    @Test
    public void FindFactorialOfzero()
    {
        int result=obj.FindFactorialOfGivenNumber(0);
        assertEquals(1,result);

    }
    @Test
    public void FindFactorialOfone()
    {
        int result=obj.FindFactorialOfGivenNumber(1);
        assertEquals(1,result);

    }

}