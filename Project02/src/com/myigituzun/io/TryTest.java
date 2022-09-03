package com.myigituzun.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class TryTest {
    public static void main(String[] args) {
        String path = "D:\\GitHub\\IBTechBootcamp\\Project02\\Texts\\in.txt";
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(path));
            bw.write("Java");
            bw.write("JDBC");
            bw.write("JAXP");
            bw.write("JSON-P");
            bw.write("JSON");
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
