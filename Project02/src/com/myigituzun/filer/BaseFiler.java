package com.myigituzun.filer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

abstract public class BaseFiler<E> {
    protected String filePath;
    protected final static String DELIMETER = ";";

    public BaseFiler(String filePath) {
        this.filePath = filePath;
    }

    public void store(List<E> entitiys) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(this.filePath));
        for (E entity : entitiys) {
            bw.write(format(entity) + "\r\n");
        }
        bw.close();
    }

    public List<E> load() throws IOException {
        List<E> entitiys = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(this.filePath));
        String line = null;

        while ((line = br.readLine()) != null) {
            entitiys.add(parse(line));
        }
        br.close();

        return entitiys;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    abstract protected String format(E entity);
    abstract protected E parse(String line);
}
