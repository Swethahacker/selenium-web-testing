package com.sauce.utils;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.List;

import com.opencsv.CSVReader;

public class CSVUtils {

    public static List<String[]> getCSVData(String filePath) throws Exception {
        CSVReader reader = new CSVReader(new FileReader(filePath));
        List<String[]> data = reader.readAll();
        reader.close();
        return data;
    }
}


