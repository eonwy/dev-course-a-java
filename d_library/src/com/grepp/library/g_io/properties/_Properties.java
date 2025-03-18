package com.grepp.library.g_io.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class _Properties {

    public static void main(String[] args) {
        studyProperties();
        loadFromXML();
    }

    private static void loadFromXML() {
        Properties prop = new Properties();

        try (FileInputStream fis = new FileInputStream("web.xml")) {
            prop.loadFromXML(fis);

            System.out.println("--- loadFromXML ---");
            System.out.println(prop);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void studyProperties() {
        Properties prop = new Properties();

        prop.setProperty("DATE", "2025-03-18");
        prop.setProperty("PORT", "8080");
        prop.setProperty("HOST", "localhost");

        for (Object key : prop.keySet()) {
            System.out.println(prop.getProperty(key.toString()));
        }

        prop.remove("DATE");
        System.out.println(prop);


    }

}
