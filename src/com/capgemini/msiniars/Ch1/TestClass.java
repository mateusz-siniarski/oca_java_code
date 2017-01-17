package com.capgemini.msiniars.Ch1;


import java.io.IOException;
import java.nio.file.Files;
import java.time.format.DateTimeFormatter;

/**
 * Created by Mateusz Siniarski on 17.01.2017.
 */
public class TestClass {

    public static void main(String[] args) throws IOException {
        Files.createDirectories(Paths.get("logs"));
        DataTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMMdd_hhmm");
    }
}
