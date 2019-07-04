package com.stackroute.pe2;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;
public class WordFrequencyTest {
    WordFrequency wordFrequency;

    @Before
    public void setup(){
        wordFrequency=new WordFrequency();
    }
    @Test
    public void readFileAndCountFrequency() throws IOException {
        String str=wordFrequency.readFrequencyOfWordsInFile(new File("file2.txt"));
        assertEquals(" i-2,am-2,man-1,good-1",str);
    }
    @After
    public void tearDown(){
        wordFrequency = null;
    }
}

