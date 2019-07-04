package com.stackroute.pe2;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import static org.junit.Assert.*;

public class ReadTextToUpperCaseTest {
    ReadTextToUpperCase file1;
    PrintWriter actualResult;
    String expectedResult;
    @Before
    public void setup(){
        file1=new ReadTextToUpperCase();
    }
    @Test
    public void readFileAndConveretToUpperCase() throws IOException {
        String str=file1.readFile(new File("file1.txt"));
        assertEquals(" HELLOWORLD",str);
    }

}