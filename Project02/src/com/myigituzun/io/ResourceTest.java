package com.myigituzun.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ResourceTest {
    public static void main(String[] args) {
        String path = "D:\\GitHub\\IBTechBootcamp\\Project02\\Texts\\in.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write("Java");
            bw.write("JDBC");
            bw.write("JAXP");
            bw.write("JSON-P");
            bw.write("JSON");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
