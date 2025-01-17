package com.car.util;

import java.util.*;
import java.io.*;
public class PropretiesReader {
    public static Properties getProperties(final String filePath) {
        Properties properties = new Properties();
        try(FileInputStream InputStream = new FileInputStream(filePath)) {
            properties.load(InputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
