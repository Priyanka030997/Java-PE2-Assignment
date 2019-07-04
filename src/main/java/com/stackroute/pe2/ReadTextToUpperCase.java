package com.stackroute.pe2;
import java.io.*;
public class ReadTextToUpperCase {
    public static String readFile(File file) throws IOException {
        String line=" ";
        String str=" ";
        int len=0;
        try{
            FileReader fr=new FileReader(file);
            BufferedReader bufferReader=new BufferedReader(fr);
            while((line=bufferReader.readLine())!=null)
            {
                str=str.concat(line);
            }
            len=str.length();
            bufferReader.close();;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return str.toUpperCase();
    }
}

