package loggers;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;

public class Logger {

    private final static java.util.logging.Logger logr = java.util.logging.Logger.getLogger(Logger.class.getName());

    private static void setupLogger() {

        LogManager.getLogManager().reset();
        logr.setLevel(Level.ALL);

        ConsoleHandler ch =  new ConsoleHandler();
        ch.setLevel(Level.SEVERE);
        logr.addHandler(ch);

        try {

            FileHandler fh = new FileHandler("LogExample.log", true);
            fh.setLevel(Level.FINE);
            logr.addHandler(fh);
        } catch (IOException e) {
            logr.log(Level.SEVERE, "File logger not working. ", e);}
    }
  }
