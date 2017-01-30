package com.msiniars.oca.Ch1;

import java.io.IOException;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import static java.nio.file.Files.createDirectories;


/**
 * Created by Mateusz Siniarski on 17.01.2017.
 */
public class TestClass {

    public static void main(String[] args) throws IOException {
        createDirectories(Paths.get("logs"));
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMMdd_hhmm");
        LocalDateTime now = LocalDateTime.now();
        String date = now.format(df);
        String logFileName = "logs\\testlog-" + date + ".txt";
        FileHandler myFileHandler = new FileHandler(logFileName);
        myFileHandler.setFormatter(new SimpleFormatter());
        Logger ocajLogger = Logger.getLogger("OCAJ Logger");
        ocajLogger.setLevel(Level.ALL);
        ocajLogger.addHandler(myFileHandler);
        ocajLogger.info("\nThis is a logged information message");
        myFileHandler.close();
    }

}
