package com.myigituzun.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderText {
    public static void main(String[] args) throws IOException {
        String path = "D:\\GitHub\\IBTechBootcamp\\Project02\\Texts\\in.txt";
        BufferedReader br = new BufferedReader(new FileReader(path));

        String line = null;
        StringBuilder builder = new StringBuilder();

        while ((line = br.readLine()) != null) {
            builder.append(line).append("\r\n");
        }
        
        String text = builder.toString();
        System.out.println("Yazı:\n" + text);
        br.close();
    }
}
